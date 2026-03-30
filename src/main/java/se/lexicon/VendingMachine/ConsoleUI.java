package se.lexicon.VendingMachine;

import java.util.Scanner;

public class ConsoleUI {

    private final IVendingMachine vendingMachine;
    private final Scanner scanner = new Scanner(System.in);

    public ConsoleUI(IVendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    public void start() {
        boolean running = true;

        while (running) {
            printMenu();
            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("=== Available Products ===");
                    vendingMachine.getProducts().forEach(System.out::println);
                    break;

                case "2":
                    System.out.print("Insert coin amount: ");
                    int amount = Integer.parseInt(scanner.nextLine());
                    vendingMachine.addCurrency(amount);
                    break;

                case "3":
                    System.out.print("Enter product ID to purchase: ");
                    int productId = Integer.parseInt(scanner.nextLine());
                    System.out.println(vendingMachine.buy(productId));
                    break;

                case "4":
                    int change = vendingMachine.endSession();
                    System.out.println("Returned change: " + change);
                    break;

                case "5":
                    System.out.println("Exiting...");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }

    private void printMenu() {
        System.out.println("\n===== Vending Machine =====");
        System.out.println("1. View products");
        System.out.println("2. Insert coins");
        System.out.println("3. Purchase product");
        System.out.println("4. Return change");
        System.out.println("5. Exit");
    }
}
