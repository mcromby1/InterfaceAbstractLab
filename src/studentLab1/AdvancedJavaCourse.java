package studentLab1;

import studentLab2.*;
import lab1.*;

/**
 * Describe responsibilities here.
 *
 * @author your name goes here
 * @version 1.00
 */
public class AdvancedJavaCourse extends Course {

    //flag whether subject covered.
    private boolean chapter1;
    private boolean chapter2;
    private boolean chapter3;

    public AdvancedJavaCourse(String courseName, String courseNumber, String sectionNumber) {
        super(courseName, courseNumber, sectionNumber);
    }

    public boolean isChapter1() {
        return chapter1;
    }

    public void setChapter1(boolean chapter1) {
        this.chapter1 = chapter1;
    }

    public boolean isChapter2() {
        return chapter2;
    }

    public void setChapter2(boolean chapter2) {
        this.chapter2 = chapter2;
    }

    public boolean isChapter3() {
        return chapter3;
    }

    public void setChapter3(boolean chapter3) {
        this.chapter3 = chapter3;
    }

}
