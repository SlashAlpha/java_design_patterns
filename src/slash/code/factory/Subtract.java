package slash.code.factory;

public class Subtract implements Calculate{
    @Override
    public void compute(double a, double b) {
        System.out.println(a+"-"+b+" is "+(a-b));
    }
}
