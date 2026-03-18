package Dependency;

/**
 * Represents Course Scheduling.
 * 
 * UML Concept: Dependency
 * - CourseSchedule temporarily uses Course
 * - No permanent relationship stored
 */
public class CourseSchedule {

    public void addCourse(Course c) {
        // Dependency: using Course as a parameter
        System.out.println("Course added: " + c.name);
    }
}
