package oops;
public class StudentCon {
    // Class Variables
    String name;
    int marks;
    String email;

    public StudentCon(String name, int marks, String email){
        // LHS [class vars] = RHS [constructor parameters] // Ambiguity = confusion
        this.name = name;
        this.marks = marks;
        this.email = email;
    }
    void show(){
        System.out.println("Hello Java Community!");
    }
    public static void main(String[] args) {
        // 400 lines = 100 objects
        // 1 line = 1 obj 100 lines = 100 objects
        StudentCon s1 = new StudentCon("Kushaal", 45, "kgp@gmail.com");
        s1.show();

    }
}
