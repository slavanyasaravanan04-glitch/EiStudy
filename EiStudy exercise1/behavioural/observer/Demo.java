package behavioural.observer;

import java.util.Scanner;


public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NewsAgency newsAgency = new NewsAgency();

        System.out.println("=== Observer Pattern Demo ===");
        System.out.println("News Agency Subscription System");

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add subscriber");
            System.out.println("2. Publish news");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); // consume newline

                switch (choice) {
                    case 1:
                        System.out.print("Enter subscriber name: ");
                        String name = scanner.nextLine();
                        if (name.trim().isEmpty()) {
                            System.out.println("Error: Name cannot be empty!");
                            break;
                        }
                        NewsSubscriber subscriber = new NewsSubscriber(name);
                        newsAgency.addObserver(subscriber);
                        System.out.println("Subscriber " + name + " added successfully!");
                        break;

                    case 2:
                        System.out.print("Enter news: ");
                        String news = scanner.nextLine();
                        if (news.trim().isEmpty()) {
                            System.out.println("Error: News cannot be empty!");
                            break;
                        }
                        newsAgency.setNews(news);
                        break;

                    case 3:
                        System.out.println("Thank You!");
                        scanner.close();
                        return;

                    default:
                        System.out.println("Error: Invalid choice! Please enter 1, 2, or 3.");
                }
            } catch (Exception e) {
                System.out.println("Error: Invalid input! Please enter a number.");
                scanner.nextLine(); // clear invalid input
            }
        }
    }
}

