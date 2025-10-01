// models/Assignment.java
package models;

/**
 * Represents an assignment with basic details
 * Simple POJO class for assignment data
 */
public class Assignment {
    private String title;
    private String description;
    private String dueDate;

    public Assignment(String title, String description, String dueDate) {
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
    }

    // Getters
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public String getDueDate() { return dueDate; }

    @Override
    public String toString() {
        return String.format("Assignment: %s | Description: %s | Due: %s",
                title, description, dueDate);
    }
}