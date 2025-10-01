// models/Student.java
package models;

import interfaces.Observer;
import java.util.ArrayList;
import java.util.List;

/**
 * Student class that implements Observer pattern
 * Students get notified when new assignments are scheduled
 */
public class Student implements Observer {
    private String studentId;
    private String name;
    private List<String> submittedAssignments;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.submittedAssignments = new ArrayList<>();
    }

    // Getters
    public String getStudentId() { return studentId; }
    public String getName() { return name; }
    public List<String> getSubmittedAssignments() { return submittedAssignments; }

    /**
     * Observer pattern implementation
     * Called when a new assignment is scheduled in classroom
     */
    @Override
    public void update(String classroomName, models.Assignment assignment) {
        System.out.printf("Notification to Student %s (%s): New assignment '%s' scheduled in classroom '%s'. Due: %s%n",
                name, studentId, assignment.getTitle(), classroomName, assignment.getDueDate());
    }

    /**
     * Submit an assignment
     */
    public void submitAssignment(String assignmentTitle) {
        if (!submittedAssignments.contains(assignmentTitle)) {
            submittedAssignments.add(assignmentTitle);
            System.out.printf("Student %s submitted assignment: %s%n", name, assignmentTitle);
        } else {
            System.out.printf("Student %s has already submitted assignment: %s%n", name, assignmentTitle);
        }
    }

    @Override
    public String toString() {
        return String.format("Student ID: %s, Name: %s, Submitted Assignments: %s",
                studentId, name, submittedAssignments);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return studentId.equals(student.studentId);
    }

    @Override
    public int hashCode() {
        return studentId.hashCode();
    }
}