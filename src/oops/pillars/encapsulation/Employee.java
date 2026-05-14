package oops.pillars.encapsulation;
public class Employee {
    private String empName;
    private int salary;
    // setters - set attributes
    public void setEmpName(String empName){
        this.empName = empName;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    // getters - fetch attributes
    public String getEmpName(){
        return this.empName;
    }
    public int getSalary(){
        return this.salary;
    }
}
