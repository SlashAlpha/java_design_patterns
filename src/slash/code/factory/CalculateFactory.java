package slash.code.factory;

import java.util.Locale;

public class CalculateFactory {

    public Calculate getCalculation(String type){
        Calculate obj = null;
        if(type.toLowerCase().equals("add")){
            obj = new Add();

        }
        if(type.toLowerCase().equals("subtract")){
            obj = new Subtract();

        }
        if(type.toLowerCase().equals("divide")){
            obj = new Divide();

        }
        return obj;
    }
}
