package se.lexicon;

public class Product {
    private int id;
    private String name;
    private double price;
    private String category;
    public Product(int id, String name, double price, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public Product(double id, String notebook, double price) {
    }

    public int getID() {
        return id;
    }

    public void setID(int ID) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }
    @Override
    public String toString() {
        return name + " (" + price + " kr)";
    }

}






