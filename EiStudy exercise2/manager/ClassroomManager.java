// manager/ClassroomManager.java
package manager;

import models.Classroom;
import models.Student;
import models.Assignment;
import java.util.HashMap;
import java.util.Map;

/**
 * Singleton class that manages all classrooms
 * Only one instance exists throughout the application
 */
public class ClassroomManager {
    // Singleton instance
    private static ClassroomManager instance;
    private Map<String, Classroom> classrooms;
    private Map<String, Student> allStudents;

    // Private constructor for Singleton pattern
    private ClassroomManager() {
        classrooms = new HashMap<>();
        allStudents = new HashMap<>();
    }

    /**
     * Singleton instance getter
     */
    public static ClassroomManager getInstance() {
        if (instance == null) {
            instance = new ClassroomManager();
        }
        return instance;
    }

    /**
     * Add a new classroom
     */
    public boolean addClassroom(String className) {
        if (classrooms.containsKey(className)) {
            return false; // Classroom already exists
        }
        classrooms.put(className, new Classroom(className));
        return true;
    }

    /**
     * Add student to a classroom
     */
    public boolean addStudent(String studentId, String studentName, String className) {
        // Create or get student
        Student student = allStudents.get(studentId);
        if (student == null) {
            student = new Student(studentId, studentName);
            allStudents.put(studentId, student);
        }

        // Add to classroom
        Classroom classroom = classrooms.get(className);
        if (classroom != null) {
            return classroom.addStudent(student);
        }
        return false; // Classroom not found
    }

    /**
     * Schedule an assignment for a classroom
     */
    public boolean scheduleAssignment(String className, String title, String description, String dueDate) {
        Classroom classroom = classrooms.get(className);
        if (classroom != null) {
            Assignment assignment = new Assignment(title, description, dueDate);
            classroom.scheduleAssignment(assignment);
            return true;
        }
        return false; // Classroom not found
    }

    /**
     * Submit assignment by student
     */
    public boolean submitAssignment(String studentId, String assignmentTitle) {
        Student student = allStudents.get(studentId);
        if (student != null) {
            student.submitAssignment(assignmentTitle);
            return true;
        }
        return false; // Student not found
    }

    /**
     * List all classrooms with students and assignments
     */
    public void listAllClassrooms() {
        if (classrooms.isEmpty()) {
            System.out.println("No classrooms available.");
            return;
        }

        System.out.println("\n=== ALL CLASSROOMS ===");
        for (Classroom classroom : classrooms.values()) {
            System.out.println("\n" + classroom);

            // List students
            if (!classroom.getStudents().isEmpty()) {
                System.out.println("  Students:");
                for (Student student : classroom.getStudents()) {
                    System.out.println("    - " + student.getName() + " (" + student.getStudentId() + ")");
                }
            }

            // List assignments
            if (!classroom.getAssignments().isEmpty()) {
                System.out.println("  Assignments:");
                for (Assignment assignment : classroom.getAssignments()) {
                    System.out.println("    - " + assignment);
                }
            }
        }
    }

    /**
     * Get classroom by name
     */
    public Classroom getClassroom(String className) {
        return classrooms.get(className);
    }

    /**
     * Get student by ID
     */
    public Student getStudent(String studentId) {
        return allStudents.get(studentId);
    }

    /**
     * Check if classroom exists
     */
    public boolean classroomExists(String className) {
        return classrooms.containsKey(className);
    }

    /**
     * Check if student exists
     */
    public boolean studentExists(String studentId) {
        return allStudents.containsKey(studentId);
    }
}
