package studentLab2;

/**
 * Describe responsibilities here.
 *
 * @author your name goes here
 * @version 1.00
 */
public class IntroJavaCourse implements Course {

    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;
    private int numOfStudents;
    private int maxNumStudents;

    public IntroJavaCourse(String courseName, String courseNumber) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getNumOfStudents() {
        return numOfStudents;
    }

    public int getMaxNumStudents() {
        return maxNumStudents;
    }

    public void setMaxNumStudents(int maxNumStudents) {
        this.maxNumStudents = maxNumStudents;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        this.credits = credits;
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    public void enrollInClass(int e) {
        if (numOfStudents < maxNumStudents) {
            if ((maxNumStudents - numOfStudents) > e) {
                numOfStudents += e;
            } else {
                numOfStudents += (maxNumStudents - numOfStudents);
            }
        }
    }

}
