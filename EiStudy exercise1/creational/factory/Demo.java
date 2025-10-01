package creational.factory;

import java.util.Scanner;


public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Factory Pattern Demo ===");
        System.out.println("Shape Factory System");

        while (true) {
            System.out.println("\nChoose shape to create:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            try {
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter radius: ");
                        double radius = scanner.nextDouble();
                        if (radius <= 0) {
                            System.out.println("Error: Radius must be positive!");
                            break;
                        }
                        Shape circle = ShapeFactory.createShape("circle", radius);
                        circle.draw();
                        System.out.printf("Area: %.2f\n", circle.getArea());
                        break;

                    case 2:
                        System.out.print("Enter width: ");
                        double width = scanner.nextDouble();
                        System.out.print("Enter height: ");
                        double height = scanner.nextDouble();
                        if (width <= 0 || height <= 0) {
                            System.out.println("Error: Width and height must be positive!");
                            break;
                        }
                        Shape rectangle = ShapeFactory.createShape("rectangle", width, height);
                        rectangle.draw();
                        System.out.printf("Area: %.2f\n", rectangle.getArea());
                        break;

                    case 3:
                        System.out.print("Enter side length: ");
                        double side = scanner.nextDouble();
                        if (side <= 0) {
                            System.out.println("Error: Side length must be positive!");
                            break;
                        }
                        Shape square = ShapeFactory.createShape("square", side);
                        square.draw();
                        System.out.printf("Area: %.2f\n", square.getArea());
                        break;

                    case 4:
                        System.out.println("Thank You!");
                        scanner.close();
                        return;

                    default:
                        System.out.println("Error: Invalid choice! Please enter 1-4.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Error: Invalid input! Please enter valid numbers.");
                scanner.nextLine(); // clear invalid input
            }
        }
    }
}
