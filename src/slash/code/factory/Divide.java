package slash.code.factory;

public class Divide implements Calculate {



    public void compute(double a, double b){
        System.out.println(a+"/"+b+" is "+(a/b));
    }
}
