package structural.decorator;

import java.util.Scanner;


public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Coffee coffee = new SimpleCoffee();

        System.out.println("=== Decorator Pattern Demo ===");
        System.out.println("Coffee Shop Ordering System");

        while (true) {
            System.out.println("\nCurrent order: " + coffee.getDescription() + " - ₹" + String.format("%.2f", coffee.getCost()));
            System.out.println("\nChoose add-on:");
            System.out.println("1. Add Milk (+₹20)");
            System.out.println("2. Add Sugar (+₹10)");
            System.out.println("3. Add Whipped Cream (+₹30)");
            System.out.println("4. Finish order");
            System.out.println("5. Start new order");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            try {
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        coffee = new MilkDecorator(coffee);
                        System.out.println("Added Milk!");
                        break;

                    case 2:
                        coffee = new SugarDecorator(coffee);
                        System.out.println("Added Sugar!");
                        break;

                    case 3:
                        coffee = new WhippedCreamDecorator(coffee);
                        System.out.println("Added Whipped Cream!");
                        break;

                    case 4:
                        System.out.println("\n=== ORDER COMPLETE ===");
                        System.out.println("Final order: " + coffee.getDescription());
                        System.out.println("Total cost: ₹" + String.format("%.2f", coffee.getCost()));
                        System.out.println("Thank you for your order!");
                        coffee = new SimpleCoffee(); // Reset for new order
                        break;

                    case 5:
                        coffee = new SimpleCoffee();
                        System.out.println("Starting new order...");
                        break;

                    case 6:
                        System.out.println("Thank You!");
                        scanner.close();
                        return;

                    default:
                        System.out.println("Error: Invalid choice! Please enter 1-6.");
                }
            } catch (Exception e) {
                System.out.println("Error: Invalid input! Please enter a number.");
                scanner.nextLine(); // clear invalid input
            }
        }
    }
}

