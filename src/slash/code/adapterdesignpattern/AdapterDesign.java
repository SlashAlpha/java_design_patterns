package slash.code.adapterdesignpattern;

public class AdapterDesign {

    /*
    Adapter design pattern works as a bridge between two incompatible interfaces.
    This pattern involves a single class called adaptor between two incompatible interfaces
    Adapter allows two classes or different interfaces to work together without changing any code on either side.

     */
    public static void main(String[] args) {
        FrenchToEnglishTranslator translator=new FrenchToEnglishTranslator(new FrenchPerson());
        translator.speakEnglish();
    }

}

interface ISpeakFrench{
    public void speakFrench();
}
interface ISpeakEnglish{
    public void speakEnglish();
}


class FrenchPerson implements ISpeakFrench{

    @Override
    public void speakFrench() {
        System.out.println("baguette");
    }
}
class British implements ISpeakEnglish{
    @Override
    public void speakEnglish() {
        System.out.println("bread");
    }
}
class FrenchToEnglishTranslator implements ISpeakEnglish{
    ISpeakFrench french;

    public FrenchToEnglishTranslator(ISpeakFrench french) {
        this.french = french;
    }

    @Override
    public void speakEnglish() {
        this.french.speakFrench();
        System.out.println("Converting in my mind");
        System.out.println("bread");

    }
}

