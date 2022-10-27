package slash.code.basic_concepts;

public class Test {
    public static void main(String[] args) {

//        System.out.println("aObj");
//        A aObj= new A();
//        aObj.methodA();


        System.out.println("bObj");
        B bObj=new B();
        bObj.methodA();
        bObj.methodB();

       //superclass obj = new Subclass();
        int x = 10;
        A obj=new B();
        obj.methodA();
        obj.methodB();


    }
}
