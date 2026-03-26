package se.lexicon.VendingMachine;

import java.util.ArrayList;
import java.util.List;

//ProductList: logic & ProductList
//Add a new Product on list


public abstract class VendingMachineImpl implements IVendingMachine {

    private int balance = 0;
    private final int quantity = 0;

    private final List<Product> products = new ArrayList<>();
    public VendingMachineImpl() {


        products.add(new Beverage(1, "Purified Water",10,1));
        products.add(new Beverage(2, "Sparkling Water",10,2));

        products.add(new Fruit(3, "Apples",5,  3));
        products.add(new Fruit(4, "Bananas",5, 4));
        products.add(new Fruit(5, "Grapes",5, 5));


        products.add(new Mix(6, "Alkaline vitamin",4, 6));
        products.add(new Mix(7, "Aquafina", 4,7));
        products.add(new Mix(8, "Flavor Soda",4,8));
        products.add(new Mix(9, "Testy Soda",4,9));
        products.add(new Mix(10, "Soda",4,10));


        products.add(new Mix(11, "Fruit Cups",10,11));
        products.add(new Mix(12, "Mango",7,  12));
        products.add(new Mix(13, "Sun Maid Raisin", 3, 13));
        products.add(new Mix(14, "fruits Strips",2, 14));

        products.add(new Snack(15, "Nachos Chess",7,  15));
        products.add(new Snack(16, "Cheetos",7, 16));
        products.add(new Snack(17, "Rice Krispies Treats",7,  17));
        products.add(new Snack(18, "Nature Valley Granola Bars",7, 18));
        products.add(new Snack(19, "Classic Chips",7, 19));
        products.add(new Snack(20, "Nature Nuts mix",7, 20));
        products.add(new Snack(21, "Crackers",7, 21));
    }
    // COIN LOGIC
    public void addCurrency(int amount) {
        if (amount == 1 || amount == 2 || amount == 5 || amount == 10 || amount == 20 || amount == 50) {
            balance += amount;
        } else {
            System.out.println("Invalid coin");
        }
    }
    @Override
    public int getBalance(){
        return balance;
    }
    // PURCHASE LOGIC
    @Override
    public Product purchaseProduct(int productId){
        for (Product product : products) {
            if (product.getId() == productId) {

                final var quantity = product.getQuantity();
                if (quantity <=  product.getQuantity()) {
                    System.out.println("out of stock");
                    return null;
                }
                if(balance<product.getPrice()){
                    System.out.println("Check your balance");
                    return null;
                }
              balance -= product.getPrice();
                product.setQuantity(product.getQuantity()-1);
                return product;
            }
        }
        System.out.println("Invalid product");
        return null;
    }
    // RETURN CHANGE
    @Override
    public int returnChange(){
        int change = balance;
        balance = 0;
        returnChange();
        return change;
    }
    // DESCRIPTION
    @Override
    public String getDiscripstion(int productId){
        for (Product product : products) {
            if (product.getId() == productId) {
                return product.getDescription();

                }
            }
        return "Invalid product";
        }
    // GET ALL PRODUCTS
    @Override
    public List<Product>getProducts(){
        return products;
    }

}
