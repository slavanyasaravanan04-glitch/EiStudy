// interfaces/Subject.java
package interfaces;

import models.Student;
import models.Assignment;

/**
 * Subject interface for implementing the Observer pattern
 * Classrooms will implement this to manage student observers
 */
public interface Subject {
    void registerObserver(Student student);
    void removeObserver(Student student);
    void notifyObservers(Assignment assignment);
}