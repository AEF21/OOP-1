package se.lexicon.VendingMachine;

import java.util.List;

public interface IVendingMachine {

        /**
         * Adds currency to the machine.
         * @param amount amount to add
         * @return updated balance
         */
        int addCurrency(int amount);

        /**
         * @return current balance
         */
        int getBalance();

        /**
         * Purchases a product by ID.
         * @param productId ID of the product
         * @return the purchased Product
         */
        Product purchaseProduct(int productId);

        /**
         * Ends the session and returns all remaining change.
         * @return the amount of returned change
         */
        int endSession();

        /**
         * Returns the description of a product.
         * @param productId ID of the product
         * @return description text
         */
        String getDescription(int productId);

        /**
         * @return list of all available products
         */
        List<Product> getProducts();

        boolean buy(int productId);
}
