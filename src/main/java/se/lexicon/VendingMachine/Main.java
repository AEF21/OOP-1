package se.lexicon.VendingMachine;



public class Main {



    public static void main(String[] args) {
            IVendingMachine machine;
            machine = new VendingMachineImpl();
            ConsoleUI ui = new ConsoleUI(machine);
            ui.start();










        }
    }


