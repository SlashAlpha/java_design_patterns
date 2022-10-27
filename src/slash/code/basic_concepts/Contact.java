package slash.code.basic_concepts;

public class Contact {
    public String name;

    public String toString() {
        if (this instanceof Friend ){
        return "Friend Name: " +name+
                " number :" + ((Friend)this).number ;}
        if (this instanceof Work ){
            return "Friend Name: " +name+
                    " email :" + ((Work)this).email ;}
        return "NAC";
    }

}
