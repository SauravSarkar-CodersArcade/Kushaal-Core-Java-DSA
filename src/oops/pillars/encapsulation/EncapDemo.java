package oops.pillars.encapsulation;

public class EncapDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setEmpName("Kushaal");
        e1.setSalary(40000);
        System.out.println(e1.getEmpName());
        System.out.println(e1.getSalary());
    }
}
