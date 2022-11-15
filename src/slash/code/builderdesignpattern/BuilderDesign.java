package slash.code.builderdesignpattern;

public class BuilderDesign {

    /*
    The builder pattern is a design pattern which provide a flexible solution to a various complex object creation problems in object-oriented programming .
    The intent of the Builder pattern is to isolate the construction of a complex object from its representation
     */

    public static void main(String[] args) {
        Mobile m=Manufacturer.createCompleteObject();
        System.out.println(m);

    }

}


class Mobile{

    private String memory;
    private String battery;
    private String wireless;
    private String screen;
    private String metalCase;



    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public String getWireless() {
        return wireless;
    }

    public void setWireless(String wireless) {
        this.wireless = wireless;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String getMetalCase() {
        return metalCase;
    }

    public void setMetalCase(String metalCase) {
        this.metalCase = metalCase;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "memory='" + memory + '\'' +
                ", battery='" + battery + '\'' +
                ", wireless='" + wireless + '\'' +
                ", screen='" + screen + '\'' +
                ", metalCase='" + metalCase + '\'' +
                '}';
    }
}

abstract class MobileBuilder{
    Mobile mobile;
    public void  setMobile(Mobile mobile){
        this.mobile=mobile;
    }
    public abstract void createMemory();
    public abstract void createBattery();
    public abstract void createWireless();
    public abstract void createScreen();
    public abstract void createMetalCase();


    public final Mobile buildMobile(){

        Mobile mob =new Mobile();
        setMobile(mob);
        createMemory();
        createBattery();
        createWireless();
        createScreen();
        createMetalCase();
        return mob;
    };

    public Mobile getMobile() {
        return mobile;
    }
}

class MobileConcreteBuilder extends MobileBuilder{



    @Override
    public void createMemory() {
        getMobile().setMemory("32GB");
        System.out.println("Memory created and installed");

    }

    @Override
    public void createBattery() {
        getMobile().setBattery("4500mAh");
        System.out.println("Battery created and installed");

    }

    @Override
    public void createWireless() {
        getMobile().setWireless("Bluetooth & Wifi");
        System.out.println("created Wirelesss features  and installed");
    }

    @Override
    public void createScreen() {

        getMobile().setScreen("Amoled");
        System.out.println("Screen created  and installed");

    }

    @Override
    public void createMetalCase() {

        getMobile().setScreen("Aluminium");
        System.out.println("Metal Case created  and installed");

    }
}

class Manufacturer{
    public static Mobile createCompleteObject(){
        MobileBuilder mobileBuilder=new MobileConcreteBuilder();
        return  mobileBuilder.buildMobile();
    }
}