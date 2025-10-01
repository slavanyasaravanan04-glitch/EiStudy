package behavioural.strategy;

import java.util.Scanner;


public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("=== Strategy Pattern Demo ===");
        System.out.println("Calculator with Different Strategies");

        while (true) {
            System.out.println("\nChoose operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            try {
                int choice = scanner.nextInt();

                if (choice == 5) {
                    System.out.println("Thank You!");
                    scanner.close();
                    return;
                }

                if (choice < 1 || choice > 5) {
                    System.out.println("Error: Invalid choice! Please enter 1-5.");
                    continue;
                }

                System.out.print("Enter first number: ");
                double a = scanner.nextDouble();
                System.out.print("Enter second number: ");
                double b = scanner.nextDouble();

                String operation = "";
                switch (choice) {
                    case 1:
                        calculator.setStrategy(new AddStrategy());
                        operation = "+";
                        break;
                    case 2:
                        calculator.setStrategy(new SubtractStrategy());
                        operation = "-";
                        break;
                    case 3:
                        calculator.setStrategy(new MultiplyStrategy());
                        operation = "*";
                        break;
                    case 4:
                        calculator.setStrategy(new DivideStrategy());
                        operation = "/";
                        break;
                }

                double result = calculator.calculate(a, b);
                System.out.println("Result: " + a + " " + operation + " " + b + " = " + result);

            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Error: Invalid input! Please enter valid numbers.");
                scanner.nextLine(); // clear invalid input
            }
        }
    }
}

