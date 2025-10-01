package creational.builder;

import java.util.Scanner;

public class BuilderDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Computer Builder Demo ===");
        System.out.println("Let's build your custom computer!\n");

        try {
            System.out.print("Enter CPU (e.g., Intel i5, AMD Ryzen 7): ");
            String cpu = scanner.nextLine();

            System.out.print("Enter RAM (e.g., 8GB, 16GB): ");
            String ram = scanner.nextLine();

            System.out.print("Enter Storage (e.g., 256GB SSD, 1TB HDD): ");
            String storage = scanner.nextLine();

            Computer.ComputerBuilder builder = new Computer.ComputerBuilder(cpu, ram, storage);

            System.out.print("\nDo you want a dedicated GPU? (yes/no): ");
            String gpuChoice = scanner.nextLine();
            if (gpuChoice.equalsIgnoreCase("yes")) {
                System.out.print("Enter GPU model (e.g., NVIDIA RTX 3060, AMD RX 6700): ");
                String gpu = scanner.nextLine();
                builder.setGpu(gpu);
            }

            System.out.print("Include Bluetooth? (yes/no): ");
            String btChoice = scanner.nextLine();
            builder.setBluetooth(btChoice.equalsIgnoreCase("yes"));

            System.out.print("Include WiFi? (yes/no): ");
            String wifiChoice = scanner.nextLine();
            builder.setWifi(wifiChoice.equalsIgnoreCase("yes"));

            Computer computer = builder.build();

            System.out.println("\n" + "=".repeat(40));
            System.out.println("YOUR CUSTOM COMPUTER IS READY!");
            System.out.println("=".repeat(40));
            System.out.println(computer);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Please restart the program and provide valid inputs.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("\nThank you for using Computer Builder!");
        }
    }
}
