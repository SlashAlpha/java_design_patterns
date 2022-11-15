package slash.code.prototypedesignpattern;

import java.util.ArrayList;
import java.util.List;

public class PrototypeDesign {

    /*
    The prototype pattern is required when object creation is time-consuming and costly operation.
    So with this pattern we create object with existing object itself.
    Shallow cloning and Deep cloning
     */


    public static void main(String[] args) throws CloneNotSupportedException {

        CoffeeShop cs=new CoffeeShop();
        cs.setShopName("Baristar");
        cs.loadStock();
        System.out.println(cs);

        CoffeeShop cs1= cs.clone();
        cs1.setShopName("GringoStar");

        System.out.println(cs1);

        cs.getCoffeeTypes().remove(0);
        System.out.println(cs);
        System.out.println(cs1);

    }
}

class Coffee{

    int coffeeId;
    String coffeeName;

    public int getCoffeeId() {
        return coffeeId;
    }

    public void setCoffeeId(int coffeeId) {
        this.coffeeId = coffeeId;
    }

    public String getCoffeeName() {
        return coffeeName;
    }

    public void setCoffeeName(String coffeeName) {
        this.coffeeName = coffeeName;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "coffeeId=" + coffeeId +
                ", coffeeName='" + coffeeName + '\'' +
                '}';
    }
}
class CoffeeShop implements Cloneable{
    String shopName;
    List<Coffee> coffeeTypes=new ArrayList<>();

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Coffee> getCoffeeTypes() {
        return coffeeTypes;
    }

    public void setCoffeeTypes(List<Coffee> coffeeTypes) {
        this.coffeeTypes = coffeeTypes;
    }

    @Override
    public String toString() {
        return "CoffeeShop{" +
                "shopName='" + shopName + '\'' +
                ", coffeeTypes=" + coffeeTypes +
                '}';
    }
    public void loadStock(){
        for(int i=0;i<=2;i++){
            Coffee c=new Coffee();
            c.setCoffeeId(i);
            c.setCoffeeName("CoffeeName"+i);
            getCoffeeTypes().add(c);
        }
    }

//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        //Shallow Cloning
//        return super.clone();
//    }

    @Override
    protected CoffeeShop clone() throws CloneNotSupportedException{
        //Deep cloning method
        CoffeeShop cShop=new CoffeeShop();
        for(Coffee c: this.getCoffeeTypes()){
            cShop.getCoffeeTypes().add(c);
        }
        return cShop;

    }
}


