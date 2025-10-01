// VirtualClassroomApp.java
import manager.ClassroomManager;
import java.util.Scanner;

public class VirtualClassroomApp {
    private ClassroomManager classroomManager;
    private Scanner scanner;
    private boolean isRunning;

    public VirtualClassroomApp() {
        this.classroomManager = ClassroomManager.getInstance();
        this.scanner = new Scanner(System.in);
        this.isRunning = true;
    }

    public void start() {
        System.out.println("=== Virtual Classroom Manager ===");

        while (isRunning) {
            displayMenu();
            int choice = getIntInput("Choose an option: ");
            handleChoice(choice);
        }

        scanner.close();
    }

    private void displayMenu() {
        System.out.println("\n1. Add a classroom");
        System.out.println("2. Add a student to classroom");
        System.out.println("3. Schedule an assignment");
        System.out.println("4. Submit assignment");
        System.out.println("5. List all classrooms");
        System.out.println("6. Exit");
    }

    private void handleChoice(int choice) {
        switch (choice) {
            case 1:
                addClassroom();
                break;
            case 2:
                addStudent();
                break;
            case 3:
                scheduleAssignment();
                break;
            case 4:
                submitAssignment();
                break;
            case 5:
                listAllClassrooms();
                break;
            case 6:
                exit();
                break;
            default:
                System.out.println("Invalid option! Please choose 1-6.");
        }
    }

    private void addClassroom() {
        System.out.print("Enter classroom name: ");
        String className = scanner.nextLine().trim();

        if (className.isEmpty()) {
            System.out.println("Error: Classroom name cannot be empty!");
            return;
        }

        if (classroomManager.addClassroom(className)) {
            System.out.println("Classroom '" + className + "' added successfully!");
        } else {
            System.out.println("Error: Classroom '" + className + "' already exists!");
        }
    }

    private void addStudent() {
        System.out.print("Enter student ID: ");
        String studentId = scanner.nextLine().trim();

        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine().trim();

        System.out.print("Enter classroom name: ");
        String className = scanner.nextLine().trim();

        // Input validation
        if (studentId.isEmpty() || studentName.isEmpty() || className.isEmpty()) {
            System.out.println("Error: All fields are required!");
            return;
        }

        if (!classroomManager.classroomExists(className)) {
            System.out.println("Error: Classroom '" + className + "' does not exist!");
            return;
        }

        if (classroomManager.addStudent(studentId, studentName, className)) {
            System.out.println("Student " + studentName + " added to classroom " + className + " successfully!");
        } else {
            System.out.println("Error: Student " + studentName + " is already in classroom " + className + "!");
        }
    }

    private void scheduleAssignment() {
        System.out.print("Enter classroom name: ");
        String className = scanner.nextLine().trim();

        if (!classroomManager.classroomExists(className)) {
            System.out.println("Error: Classroom '" + className + "' does not exist!");
            return;
        }

        System.out.print("Enter assignment title: ");
        String title = scanner.nextLine().trim();

        System.out.print("Enter assignment description: ");
        String description = scanner.nextLine().trim();

        System.out.print("Enter due date: ");
        String dueDate = scanner.nextLine().trim();

        if (title.isEmpty() || dueDate.isEmpty()) {
            System.out.println("Error: Assignment title and due date are required!");
            return;
        }

        if (classroomManager.scheduleAssignment(className, title, description, dueDate)) {
            System.out.println("Assignment scheduled successfully!");
        } else {
            System.out.println("Error: Failed to schedule assignment!");
        }
    }

    private void submitAssignment() {
        System.out.print("Enter student ID: ");
        String studentId = scanner.nextLine().trim();

        System.out.print("Enter assignment title: ");
        String assignmentTitle = scanner.nextLine().trim();

        if (studentId.isEmpty() || assignmentTitle.isEmpty()) {
            System.out.println("Error: Student ID and assignment title are required!");
            return;
        }

        if (!classroomManager.studentExists(studentId)) {
            System.out.println("Error: Student with ID '" + studentId + "' does not exist!");
            return;
        }

        if (classroomManager.submitAssignment(studentId, assignmentTitle)) {
            // Success message is handled in the Student class
        } else {
            System.out.println("Error: Failed to submit assignment!");
        }
    }

    private void listAllClassrooms() {
        classroomManager.listAllClassrooms();
    }

    private void exit() {
        System.out.println("Thank you for using Virtual Classroom Manager. Goodbye!");
        isRunning = false;
    }

    /**
     * Helper method to get integer input with error handling
     */
    private int getIntInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number.");
            }
        }
    }

    public static void main(String[] args) {
        VirtualClassroomApp app = new VirtualClassroomApp();
        app.start();
    }
}