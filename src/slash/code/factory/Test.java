package slash.code.factory;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number :");
        double num1=input.nextDouble();
        System.out.println("Enter second number :");
        double num2 = input.nextDouble();

//        Divide obj= new Divide();
//        Add objAdd= new Add();
//        Subtract objSubtract= new Subtract();
//        obj.compute(num1,num2);
//        objAdd.compute(num1,num2);
//        objSubtract.compute(num1,num2);

        System.out.println("Enter calculation needed Add,Subtract or Divide");

        CalculateFactory factory=new CalculateFactory();
        Calculate obj = factory.getCalculation(input.next());
        obj.compute(num1,num2);




    }
}
