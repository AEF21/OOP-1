package se.lexicon.VendingMachine;

import static java.lang.Character.getName;

public class Mix extends Product{

    public Mix (int id, String name, double price, int quantity){
        super(id, name, price, quantity);
    }
    @Override
    public String getDescription() {
        return "Mix: " + getName();
    }



}
