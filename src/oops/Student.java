package oops;
public class Student {
    String name;
    int marks;
    String email;
    void show(){

    }
    public static void main(String[] args) {
        // new keyword is used for object creation
        // Classname obj = new Classname(); // Constructor // Heap Memory
        int[] arr = new int[5]; // 5x4 = 20 bytes of memory
        // 100 objects -> 400 lines
        // DRY => Don't repeat yourself
        Student s1 = new Student();
        s1.name = "Kushaal";
        s1.marks = 85;
        s1.email = "kgp@gmail.com";

        Student s2 = new Student();
        s2.name = "Saurav";
        s2.marks = 80;
        s2.email = "sjs@gmail.com";

    }
}
