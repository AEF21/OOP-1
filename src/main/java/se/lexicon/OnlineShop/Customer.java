package se.lexicon.OnlineShop;

import java.util.ArrayList;
import java.util.List;


public class Customer {
    private final int id;
    public String name;
    private final String email;
    private Long phone;
    private final List<Order> orders;


    public Customer(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.orders = new ArrayList<>();

    }

    public int getID() {
        return id;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {

    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail() {
        setEmail(null);
    }

    public void setEmail(String email) {
        email = email;
    }
    @Override
    public String toString() {
        return "Customer{id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

}
