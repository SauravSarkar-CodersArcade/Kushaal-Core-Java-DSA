package oops.pillars.inheritance.single;
public class College {
    static String name = "Presidency";
    String address;
    int pinCode;
    public College(String address, int pinCode) {
        this.address = address;
        this.pinCode = pinCode;
    }
    int x = 100;
}
class Department extends College{
    String block;
    int lecturerCount;
    Department(String address, int pinCode, String block, int lecturerCount){
        super(address, pinCode); // If accessing data inside a constructor super needs a bracket
        this.block = block;
        this.lecturerCount = lecturerCount;
    }
    void departmentDetails(){
        System.out.println(block + " " + lecturerCount + " " + address + " " + pinCode + " " +
                College.name);
    }
    int x = 200;
    void show(){
        System.out.println(super.x);
        System.out.println(this.x);
    }

    public static void main(String[] args) {
        Department department = new Department("Bangalore", 560057, "Q", 20);
        department.departmentDetails();
        department.show();
    }
}
/*
* Points to remember
* ✅ super.something -> variables, methods from Parent Class
* ✔ super() -> constructor of the parent class
* ❌ Don't use super. for constructor
* ℹ These are important for interviews ️
* */