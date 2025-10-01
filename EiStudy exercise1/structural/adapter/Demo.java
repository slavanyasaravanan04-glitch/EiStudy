package structural.adapter;

import java.util.Scanner;


public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AudioPlayer audioPlayer = new AudioPlayer();

        System.out.println("=== Adapter Pattern Demo ===");
        System.out.println("Universal Media Player");

        while (true) {
            System.out.println("\nChoose media format to play:");
            System.out.println("1. MP3");
            System.out.println("2. VLC");
            System.out.println("3. MP4");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); // consume newline

                String format = "";
                switch (choice) {
                    case 1:
                        format = "mp3";
                        break;
                    case 2:
                        format = "vlc";
                        break;
                    case 3:
                        format = "mp4";
                        break;
                    case 4:
                        System.out.println("Thank You!");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Error: Invalid choice! Please enter 1-4.");
                        continue;
                }

                System.out.print("Enter file name: ");
                String fileName = scanner.nextLine();

                if (fileName.trim().isEmpty()) {
                    System.out.println("Error: File name cannot be empty!");
                    continue;
                }

                audioPlayer.play(format, fileName);

            } catch (Exception e) {
                System.out.println("Error: Invalid input! Please enter a number.");
                scanner.nextLine(); // clear invalid input
            }
        }
    }
}

