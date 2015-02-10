package studentLab2;

/**
 *
 * @author Matthew
 */
public interface Course {
    
    public abstract String getCourseName();
    
    public abstract void setCourseName(String courseName);
    
    public abstract int getNumOfStudents();
    
    public abstract int getMaxNumStudents();
    
    public abstract void setMaxNumStudents(int maxNumStudents);
    
    public abstract String getCourseNumber();
    
    public abstract void setCourseNumber(String courseNumber);
    
    public abstract double getCredits();
    
    public abstract void setCredits(double credits);
    
    public abstract void enrollInClass(int e);
        
}
