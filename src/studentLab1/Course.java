/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentLab1;

import studentLab2.*;
import lab1.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Matthew
 */
public abstract class Course {
    
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;
    private String teacher;
    private String sectionNumber;
    
    public Course(String courseName, String courseNumber, String sectionNumber){
        this.courseName = courseName;
        this.courseNumber = courseNumber;
        this.sectionNumber = sectionNumber;
    }
    
    public final String getCourseNumber() {
        return courseNumber;
    }
    
    public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }
    
    public final double getCredits() {
        return credits;
    }

    public final void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }

    public final String getCourseName() {
        return courseName;
    }

    public final void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    }
    
     public final String getCapitalizedCourseName() {
        return this.getCourseName().toUpperCase();
    }


    public final String getPrerequisites() {
        return prerequisites;
    }

    public final void setPrerequisites(String prerequisites) {
        if(prerequisites == null /*|| prerequisites.length() == 0*/) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null"/* or empty string*/);
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }

    public final String getTeacher() {
        return teacher;
    }

    public final void setTeacher(String teacher) {
        if(teacher == null || teacher.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.teacher = teacher;
    }

    public final String getSectionNumber() {
        return sectionNumber;
    }

    public final void setSectionNumber(String sectionNumber) {
        if(sectionNumber == null || sectionNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.sectionNumber = sectionNumber;
    }
    
    
    
}
