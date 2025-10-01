// models/Classroom.java
package models;

import interfaces.Subject;
import java.util.ArrayList;
import java.util.List;

/**
 * Classroom class that implements Subject pattern
 * Notifies all students when new assignments are scheduled
 */
public class Classroom implements Subject {
    private String className;
    private List<Student> students;
    private List<Assignment> assignments;
    private List<Student> observers;

    public Classroom(String className) {
        this.className = className;
        this.students = new ArrayList<>();
        this.assignments = new ArrayList<>();
        this.observers = new ArrayList<>();
    }

    // Getters
    public String getClassName() { return className; }
    public List<Student> getStudents() { return students; }
    public List<Assignment> getAssignments() { return assignments; }

    /**
     * Add student to classroom and register as observer
     */
    public boolean addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
            registerObserver(student);
            return true;
        }
        return false;
    }

    /**
     * Schedule a new assignment and notify all students
     */
    public void scheduleAssignment(Assignment assignment) {
        assignments.add(assignment);
        notifyObservers(assignment);
    }

    // Observer pattern methods
    @Override
    public void registerObserver(Student student) {
        if (!observers.contains(student)) {
            observers.add(student);
        }
    }

    @Override
    public void removeObserver(Student student) {
        observers.remove(student);
    }

    @Override
    public void notifyObservers(Assignment assignment) {
        for (Student student : observers) {
            student.update(className, assignment);
        }
    }

    @Override
    public String toString() {
        return String.format("Classroom: %s | Students: %d | Assignments: %d",
                className, students.size(), assignments.size());
    }
}