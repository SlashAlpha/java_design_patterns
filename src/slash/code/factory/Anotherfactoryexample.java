package slash.code.factory;

public class Anotherfactoryexample {

    public static void main(String[] args) {

        Database db=null;
        db= DatabaseFactory.getDatabase("RDBMS");

        System.out.println("Database : "+db.getClass().getSimpleName());
        System.out.println(db.connect());

        db= DatabaseFactory.getDatabase("DBMS");

        System.out.println("Database : "+db.getClass().getSimpleName());
        System.out.println(db.connect());

    }


}

class  DatabaseFactory{
    public static Database getDatabase(String  dbType){
        Database dc=null;
        if("RDBMS".equalsIgnoreCase(dbType)) dc=new RDBMS();
        else
            dc = new DBMS();

        return dc;
    }
}

interface Database{
    public String connect();
}

class DBMS implements Database{
    @Override
    public String connect() {
        return "Connection Successfull with DBMS";
    }
}

class RDBMS implements  Database{
    @Override
    public String connect() {
        return "Connection Successfull with RDBMS";
    }

}
class DB{
    private  String properties;
    private static final String p1="RDBMS PROPERTIES";
    private static final String p2="DBMS PROPERTIES";

    private DB(String type) {
        this.properties=type;
    }

    public static DB getRDBMS(){
       return new DB(p1);
    }
    public static DB getDBMS(){
        return new DB(p2);
    }

}

