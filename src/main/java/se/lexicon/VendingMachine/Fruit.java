package se.lexicon.VendingMachine;

public class Fruit extends Product {




        public Fruit(int id, String name, double price, int quantity) {

            super(id, name, price, quantity);
        }

        @Override
        public String getDescription() {
            return "Fruit: " + getName();
        }
    }


