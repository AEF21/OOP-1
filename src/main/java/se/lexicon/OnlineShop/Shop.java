package se.lexicon.OnlineShop;

import java.util.Arrays;

public class Shop {
    public static void main(String[] args) {

        // Capitalize names
        String nameAli = "ali";
        String capitalizedAli = nameAli.substring(0,1).toUpperCase() + nameAli.substring(1);

        String nameElla = "ella";
        String capitalizedElla = nameElla.substring(0,1).toUpperCase() + nameElla.substring(1);

        // Create customers using capitalized names
        Customer ali = new Customer(1000, capitalizedAli, "ali@email.com");
        Customer ella = new Customer(101, capitalizedElla, "ella@email.com");

        System.out.println("Customers created:");
        System.out.println(ali.getName());
        System.out.println(ella.getName());

        Product notebook = new Product(1, "Notebook", 29.90);
        Product pencil = new Product(2, "Pencil", 9.90);
        Product backpack = new Product(3, "Backpack", 399.90);

        // Order for Ali
        Order order = new Order(1000, ali);
        order.addProduct(notebook);
        order.addProduct(pencil);

        System.out.println("\n--- Order for Ali ---");
        Arrays.asList("Customer: " + order.getCustomer().getName(), "Products in order: " + order.getProducts(), "Total price: " + order.getTotalPrice()).forEach(System.out::println);


        // Order for Ella
        Order order1 = new Order(101, ella);
        order1.addProduct(notebook);
        order1.addProduct(pencil);
        order1.addProduct(backpack);

        System.out.println("\n--- Order for Ella ---");
        for (String s : Arrays.asList("Customer: " + order1.getCustomer().getName, "Products in order: " + order1.getProducts(), "Total price: " + order1.getTotalPrice())) {
            System.out.println(s);
        }
    }
}
