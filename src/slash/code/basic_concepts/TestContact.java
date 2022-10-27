package slash.code.basic_concepts;

public class TestContact {
    public static void main(String[] args) {
        Contact contact1=new Friend();
        contact1.name="bernard";
        ((Friend) contact1).number="555";

        Contact contact2=new Work();
        contact2.name="Sandjay";
        ((Work)  contact2).email="sandjayMail@gmail.com";

        System.out.println(contact1);
        System.out.println(contact2);

    }
}
