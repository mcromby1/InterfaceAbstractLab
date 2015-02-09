package studentLab1;

import studentLab2.*;
import lab1.*;

/**
 * Describe responsibilities here. NOTE: this class has NO PREREQUISITES!
 * Do not change this fact.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroToProgrammingCourse extends Course{
    
    //Set whether topics were covered yet.
    private boolean primatives;
    private boolean ifLogic;
    private boolean loops;
    private boolean arrays;
    
    public IntroToProgrammingCourse(String courseName, String courseNumber, String sectionNumber) {
        super(courseName, courseNumber, sectionNumber);
    }

    public boolean isPrimatives() {
        return primatives;
    }

    public void setPrimatives(boolean primatives) {
        this.primatives = primatives;
    }

    public boolean isIfLogic() {
        return ifLogic;
    }

    public void setIfLogic(boolean ifLogic) {
        this.ifLogic = ifLogic;
    }

    public boolean isLoops() {
        return loops;
    }

    public void setLoops(boolean loops) {
        this.loops = loops;
    }

    public boolean isArrays() {
        return arrays;
    }

    public void setArrays(boolean arrays) {
        this.arrays = arrays;
    }
    
}
