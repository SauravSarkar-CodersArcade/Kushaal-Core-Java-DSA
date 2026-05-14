package oops.pillars.inheritance.single;
public class Animal { // Parent - Super
    void eat(){
        System.out.println("Animals eat some food!");
    }
    void sound(){
        System.out.println("Animals make some sound!");
    }
}
class Cat extends Animal{ // Child - Sub
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        cat.sound();
    }
}
