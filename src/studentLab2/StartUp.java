package studentLab2;

/**
 *
 * @author Matthew
 */
public class StartUp {

    public static void main(String[] args) {

        Course[] classes = {new IntroToProgrammingCourse("Intro to Primatives and logic", "20-344"),
            new IntroJavaCourse("Objects in Java","22-125"), new AdvancedJavaCourse("Design Patterns with Java", "25-543")
        };

        ((IntroToProgrammingCourse)classes[0]).setCredits(2);
        ((IntroJavaCourse)classes[1]).setCredits(4);
        ((AdvancedJavaCourse)classes[2]).setCredits(4);
        
        ((IntroJavaCourse)classes[1]).setPrerequisites("20-344");
        ((AdvancedJavaCourse)classes[2]).setPrerequisites("22-125");
        
        ((IntroToProgrammingCourse)classes[0]).setMaxNumStudents(20);
        ((IntroJavaCourse)classes[1]).setMaxNumStudents(20);
        ((AdvancedJavaCourse)classes[2]).setMaxNumStudents(20);
        
        for (Course s: classes){
            s.enrollInClass(10);
        }
        
      System.out.println(((IntroToProgrammingCourse)classes[0]).getCourseName() + ", " 
              +((IntroToProgrammingCourse)classes[0]).getNumOfStudents());
      System.out.println(((IntroJavaCourse)classes[1]).getCourseName() + ", " 
              +((IntroJavaCourse)classes[1]).getNumOfStudents());
      System.out.println(((AdvancedJavaCourse)classes[2]).getCourseName() + ", " 
              +((AdvancedJavaCourse)classes[2]).getNumOfStudents());
      
        
    }
    
}
