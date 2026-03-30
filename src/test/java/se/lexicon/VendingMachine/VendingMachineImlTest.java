package se.lexicon.VendingMachine;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VendingMachineImplTest {

    private VendingMachineImpl vm;

    @BeforeEach
    void setup() {
        vm = new VendingMachineImpl() {
            @Override
            public boolean buy(int productId) {
                return false;
            }
        };
    }

    // -----------------------------
    // CASE 1: View products
    // -----------------------------
    @Test
    void testGetProductsReturnsList() {
        List<Product> products = vm.getProducts();
        assertNotNull(products);
        assertTrue(products.size() > 0);
    }

    // -----------------------------
    // CASE 2: Insert coins
    // -----------------------------
    @Test
    void testAddCurrencyValidCoins() {
        vm.addCurrency(10);
        vm.addCurrency(20);
        assertEquals(30, vm.getBalance());
    }

    @Test
    void testAddCurrencyInvalidCoinDoesNotChangeBalance() {
        vm.addCurrency(3); // invalid
        assertEquals(0, vm.getBalance());
    }

    // -----------------------------
    // CASE 3: Purchase product
    // -----------------------------
    @Test
    void testPurchaseProductSuccess() {
        vm.addCurrency(50);
        Product p = vm.purchaseProduct(1);

        assertNotNull(p);
        assertEquals("Purified Water", p.getName());
        assertEquals(40, vm.getBalance()); // 50 - 10
    }

    @Test
    void testPurchaseFailsWhenInsufficientBalance() {
        Product p = vm.purchaseProduct(1);
        assertNull(p);
    }

    @Test
    void testPurchaseReducesStock() {
        vm.addCurrency(50);
        Product first = vm.purchaseProduct(1);

        Product product = vm.getProducts().stream()
                .filter(pr -> pr.getId() == 1)
                .findFirst()
                .orElse(null);

        assertNotNull(product);
        assertEquals(0, product.getQuantity()); // originally 1
    }

    @Test
    void testPurchaseInvalidProductId() {
        Product p = vm.purchaseProduct(999);
        assertNull(p);
    }

    // -----------------------------
    // CASE 4: Return change
    // -----------------------------
    @Test
    void testEndSessionReturnsBalanceAndResets() {
        vm.addCurrency(20);
        int change = vm.endSession();

        assertEquals(20, change);
        assertEquals(0, vm.getBalance());
    }

    // -----------------------------
    // CASE 5: Get description
    // -----------------------------
    @Test
    void testGetDescriptionValidProduct() {
        String desc = vm.getDescription(1);
        assertNotNull(desc);
        assertFalse(desc.isEmpty());
    }

    @Test
    void testGetDescriptionInvalidProduct() {
        String desc = vm.getDescription(999);
        assertEquals("Invalid product", desc);
    }
}
