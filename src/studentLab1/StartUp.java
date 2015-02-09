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

        IntroToProgrammingCourse firstYearCourse = new IntroToProgrammingCourse("Intro to Programming with VB", "10-300-123", "345");
        IntroJavaCourse secondYearCourse = new IntroJavaCourse("Intro to Java with Objects", "20-350-234", "355");
        AdvancedJavaCourse thirdYearCourse = new AdvancedJavaCourse("Design Patterns in Java", "30-400-345", "365");

//        Course[] programmingCourses = {new IntroToProgrammingCourse("Intro to Programming with VB", "10-300-123", "345"),
//        new IntroJavaCourse("Intro to Java with Objects", "20-350-234","355"),
//        new AdvancedJavaCourse("Design Patterns in Java", "30-400-345", "365")};
        
        firstYearCourse.setCredits(3);
        firstYearCourse.setTeacher("Mr. Roberts");
        secondYearCourse.setCredits(4);
        secondYearCourse.setPrerequisites("10-300-123");
        secondYearCourse.setTeacher("Ms. Harrison");
        thirdYearCourse.setCredits(4);
        thirdYearCourse.setPrerequisites("20-350-234");
        thirdYearCourse.setTeacher("Ms. Harrison");
        
        firstYearCourse.setPrimatives(true);
        firstYearCourse.setIfLogic(true);
        secondYearCourse.setClasses(true);

//        programmingCourses[1].setCredits(3);
//        programmingCourses[1].setTeacher("Mr. Roberts");
//        programmingCourses[2].setCredits(4);
//        programmingCourses[2].setPrerequisites("10-300-123");
//        programmingCourses[2].setTeacher("Ms. Harrison");
//        programmingCourses[3].setCredits(4);
//        programmingCourses[3].setPrerequisites("20-350-234");
//        programmingCourses[3].setTeacher("Ms. Harrison");
        
        System.out.println(firstYearCourse.getTeacher());
        System.out.println(secondYearCourse.isClasses());
        System.out.println(thirdYearCourse.getCourseName());
    }

}
