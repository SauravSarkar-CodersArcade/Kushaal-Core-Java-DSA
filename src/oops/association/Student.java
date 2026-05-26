package oops.association;
public class Student {
    String name, email, address, USN;
    Branch branch;
    Accounts accounts;
    TAPCell tapCell;
    public Student(String name, String email, String address, String USN,
                   Branch branch, Accounts accounts, TAPCell tapCell) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.USN = USN;
        this.branch = branch;
        this.accounts = accounts;
        this.tapCell = tapCell;

    }
    void studentDetails(){
        // Should display all data from all classes
        System.out.println("Name: " + this.name);
        System.out.println("Email: " + this.email);
        System.out.println("Address: " + this.address);
        System.out.println("USN: " + this.USN);
        System.out.println("Branch: " + this.branch.name);
        System.out.println("Department: " + this.branch.department);
        System.out.println("Year: " + this.branch.year);
        System.out.println("Semester: " + this.branch.semester);
        System.out.println("Tuition Fees: " + this.accounts.tuitionFees);
        System.out.println("Exam Fees: " + this.accounts.examFees);
        System.out.println("Hostel Fees: " + this.accounts.hostelFees);
        System.out.println("Placement Status: " + this.tapCell.placementStatus);
        System.out.println("Interviews Attended: " + this.tapCell.interviewsAttended);
        System.out.println("CTC/Package: " + this.tapCell.CTC);
    }

    public static void main(String[] args) {
        Accounts a1 = new Accounts(45000, 1000, 50000);
        Branch b1 = new Branch("CSE", "IOT", 3, 6);
        TAPCell t1 = new TAPCell(true, 5, "10LPA");
        Student s1 = new Student("Kushaal", "kgp@gmail.com",
                "Yelahanka", "20211CIT0148", b1, a1, t1);
        s1.studentDetails();
    }
}
