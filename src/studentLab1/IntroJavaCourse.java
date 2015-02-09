package studentLab1;

import studentLab2.*;
import lab1.*;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroJavaCourse extends Course{
    
    //flag whether subject was covered.
    private boolean classes;
    private boolean constructors;
    private boolean wrappers;
    
    public IntroJavaCourse(String name, String courseNumber, String sectionNumber){
        super(name, courseNumber, sectionNumber);
    }

    public boolean isClasses() {
        return classes;
    }

    public void setClasses(boolean classes) {
        this.classes = classes;
    }

    public boolean isConstructors() {
        return constructors;
    }

    public void setConstructors(boolean constructors) {
        this.constructors = constructors;
    }

    public boolean isWrappers() {
        return wrappers;
    }

    public void setWrappers(boolean wrappers) {
        this.wrappers = wrappers;
    }
    
}
