package se.lexicon.VendingMachine;

public class Snack extends Product {


        public Snack(int id, String name, double price, int quantity) {

            super(id, name, price, quantity);
        }

        @Override
        public String getDescription() {
            return "Snack: " + getName();
        }
    }







