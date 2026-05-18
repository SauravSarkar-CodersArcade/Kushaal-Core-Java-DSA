package oops.pillars.abstraction.abstractClassesAndMethods;
abstract class Vehicle {
    /**
     * An abstract class can have two types of methods
     * 1. Abstract Method - We cannot write anything inside the body
     * 2. Normal Method - We can write data in the body
     */
    void color(){
        System.out.println("All vehicles have their own colour based on owner!");
    }
    abstract void numberOfWheels();
}
class Car extends Vehicle{
    @Override
    void numberOfWheels(){
        System.out.println("Cars have four wheels.");
    }
}
class Bike extends Vehicle {
    @Override
    void numberOfWheels(){
        System.out.println("Bikes have two wheels.");
    }
}
