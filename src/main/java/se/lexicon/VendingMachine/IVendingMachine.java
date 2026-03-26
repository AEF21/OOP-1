package se.lexicon.VendingMachine;
/*+ getBalance(): int
+ purchaseProduct(productId: int): Product
+ returnChange(): int
+ getProducts(): List<Product>
*/

import java.util.List;

public interface IVendingMachine {

        void addCurrency(int amount);

        int getBalance();

        Product purchaseProduct(int productId);

        int returnChange();

        String getDescription(int productId);

        // DESCRIPTION
        String getDiscripstion(int productId);

        List<Product> getProducts();
    }







