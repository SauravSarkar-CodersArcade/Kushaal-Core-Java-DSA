package oops.pillars.abstraction.abstractClassesAndMethods;
abstract class Shape {
    abstract void area(int x); // 100%
}
class Square extends Shape{
    @Override
    void area(int l){
        System.out.println(Math.pow(l,2));
    }
}
class Circle extends Shape{
    @Override
    void area(int r){
        System.out.println(Math.PI * Math.pow(r,2));
    }
}
class Main{
    public static void main(String[] args) {
        new Square().area(5);
        new Circle().area(10);
    }
}