package slash.code.basic_concepts;

public class Employee {
    int empId;
    String empName;
    double salary;
    int grade;
    String company="IBM";
    Email email;


    public Employee(int empId, String empName,Email email) {
        this.empId = empId;
        this.empName = empName;
        this.email=email;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    public void notifyEmployee(){
        email.sendEmail();
    }
}
