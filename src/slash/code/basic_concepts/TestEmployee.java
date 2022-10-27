package slash.code.basic_concepts;

public class TestEmployee {

    public static void main(String[] args) {
        Employee emp=new Employee(123,"john",new OutlookEmail());

        emp.notifyEmployee();
        Employee emp2=new Employee(123,"john",new WebServiceEmail());
        emp2.notifyEmployee();

    }
}
