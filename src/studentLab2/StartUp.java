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
        
        
        
        
        classes[0].enrollInClass(2);
        
    }
    
}
