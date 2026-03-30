package se.lexicon.OnlineShop;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int id;
    private final String customer;
    List <Product>Products =new ArrayList<>();

    public Order(int id, Customer Customer) {
        this.id = id;
        this.customer = String.valueOf(Customer);
    }
    public void  addProduct(Product product){
        Products.add(product);
    }


    public int getID() {
        return id;
    }

    public void setID(int ID) {
        this.id = id;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        customer = customer;
    }

    public List<Product> getProducts() {
        return Products;
    }

    public void setProducts(List<Product> products) {
        Products = products;
    }
    public double getTotalPrice() {
        double totalPrice = 0;
        for (Product product : Products) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }
}
