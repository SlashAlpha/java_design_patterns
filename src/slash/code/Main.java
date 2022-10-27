package slash.code;

import slash.code.singleton.Logger;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Logger obj1= Logger.getInstance();
        Logger obj2= Logger.getInstance();
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
    }
}
