package oops.nestedClasses;
import java.time.LocalDate;
// Local Inner Class - Inside A Method - evaluate() - Scope { Within Here}
public class Exam {
    void evaluate(int marks){
        class GradeCalculator{
            String calculate(){
                if(marks >= 75) return "Distinction";
                else if (marks >= 60) return "First Class";
                else return "Pass";
            }
        }
        GradeCalculator gc = new GradeCalculator();
        System.out.println(gc.calculate());
    }

    void displayExamDate(){
        LocalDate date = LocalDate.now().plusDays(50);
        System.out.println("The exam date is: " + date);
    }

    public static void main(String[] args) {
        Exam exam = new Exam();
        exam.displayExamDate();
        exam.evaluate(55);
        exam.evaluate(80);
        exam.evaluate(65);
    }
}
/**
 * ℹ️Points to remember
 * ⭐ Grade Logic is scoped to the "evaluate" method
 * ⭐ It avoids polluting the class with lots of helper methods
 * ⭐ It helps to design the codebase in a cleaner way
 */
