// interfaces/Observer.java
package interfaces;

import models.Assignment;

/**
 * Observer interface for implementing the Observer pattern
 * Students will implement this to receive assignment notifications
 */
public interface Observer {
    void update(String classroomName, Assignment assignment);
}