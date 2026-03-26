package se.lexicon.VendingMachine;

public class Beverage extends Product{



        public Beverage(int id, String name, double price, int quantity) {

            super(id, name, price, quantity);
        }

        @Override
        public String getDescription() {
            return "Beverage: " + getName();
    }
}


