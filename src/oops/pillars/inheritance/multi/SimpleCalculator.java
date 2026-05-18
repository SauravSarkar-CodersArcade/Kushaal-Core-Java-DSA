package oops.pillars.inheritance.multi;
public class SimpleCalculator { // Grand parent
    void add(int a, int b){
        System.out.println(a+b);
    }
    void subtract(int a, int b){
        System.out.println(a-b);
    }
}
class AdvancedCalculator extends SimpleCalculator{ // Parent
    void product(int a, int b){
        System.out.println(a*b);
    }
    void division(int a, int b){
        System.out.println(a/b);
    }
}
class SuperAdvancedCalculator extends AdvancedCalculator { // Child
    void square(int x){
        System.out.println(x * x);
    }
    void cube(int x){
        System.out.println(x * x * x);
    }

    public static void main(String[] args) {
        System.out.println("=======================================================");
        SimpleCalculator c1 = new SimpleCalculator();
        c1.add(1,2);
        c1.subtract(10,5);
        System.out.println("=======================================================");
        AdvancedCalculator c2 = new AdvancedCalculator();
        c2.add(1,2);
        c2.subtract(20,5);
        c2.product(12,6);
        c2.division(100,10);
        System.out.println("=======================================================");
        SuperAdvancedCalculator c3 = new SuperAdvancedCalculator();
        c3.add(1,2);
        c3.subtract(20,4);
        c3.product(10,20);
        c3.division(5,7);
        c3.square(100);
        c3.cube(3);
        System.out.println("=======================================================");
    }
}
