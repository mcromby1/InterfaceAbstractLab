/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentLab1;

/**
 *
 * @author Matthew
 */
public class StartUp {

    public static void main(String[] args) {

        Course[] programmingCourses = {new IntroToProgrammingCourse("Intro to Programming with VB", "10-300-123", "345"),
            new IntroJavaCourse("Intro to Java with Objects", "20-350-234", "355"),
            new AdvancedJavaCourse("Design Patterns in Java", "30-400-345", "365")};

        for (Course c:programmingCourses) {
            if (c instanceof IntroToProgrammingCourse) {
                ((IntroToProgrammingCourse) c).setTeacher("Mr. Howard");
                ((IntroToProgrammingCourse) c).setCredits(2);
                ((IntroToProgrammingCourse) c).setPrerequisites("");
                ((IntroToProgrammingCourse) c).setPrimatives(true);
            } else if (c instanceof IntroJavaCourse) {
                ((IntroJavaCourse) c).setTeacher("Ms. Hollander");
                ((IntroJavaCourse) c).setCredits(3);
                ((IntroJavaCourse) c).setPrerequisites("10-300-123");
                ((IntroJavaCourse) c).setClasses(true);
            } else if (c instanceof AdvancedJavaCourse) {
                ((AdvancedJavaCourse) c).setTeacher("Mr. Jones");
                ((AdvancedJavaCourse) c).setCredits(4);
                ((AdvancedJavaCourse) c).setPrerequisites("20-350-234");
            }
        }

        for (Course c : programmingCourses) {
            System.out.println(c.getCourseName() + ", " + c.getCredits()
                    + ", " + c.getPrerequisites() + ", " + c.getTeacher());
        }

    }

}
