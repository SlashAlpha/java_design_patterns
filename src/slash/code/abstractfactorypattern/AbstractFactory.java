package slash.code.abstractfactorypattern;

public class AbstractFactory {
    public static void main(String[] args) {
        DatabaseFactory factory=null;
        Database db=null;
        factory=DatabaseFactory.createDatabaseFactory("RDBMS");
        db =factory.getDatabase("oracle");
        System.out.println(db.connect());


        factory=DatabaseFactory.createDatabaseFactory("DBMS");
        db=factory.getDatabase("msaccess");
        System.out.println(db.connect());



    }


}

abstract class  DatabaseFactory{

    public abstract  Database getDatabase(String type);

    public static  DatabaseFactory createDatabaseFactory(String factoryType){

        if("RDBMS".equalsIgnoreCase(factoryType)) return new RDBMSDatabaseFactory();
        else return new DBMSDatabaseFactory();



    }
}

class RDBMSDatabaseFactory extends DatabaseFactory{
    @Override
    public Database getDatabase(String dbtype) {
        Database dc=null;
        if ("MySql".equalsIgnoreCase(dbtype)) return dc=new MySql();
        if("Oracle".equalsIgnoreCase(dbtype)) return dc=new Oracle();
        else return dc=new MySql();
    }
}
class DBMSDatabaseFactory extends DatabaseFactory{
    @Override
    public Database getDatabase(String dbtype) {
        Database dc=null;
        if("MsAccess".equalsIgnoreCase(dbtype)) return dc=new MsAccess();
        if ("XML".equalsIgnoreCase(dbtype)) return dc=new XML();
        if ("MongoDb".equalsIgnoreCase(dbtype)) return dc=new MongoDb();

        else return dc=new XML();
    }
}

 interface Database{
    public String connect();
}

class MsAccess implements Database {
    @Override
    public String connect() {
        return "Connection Successfull with MsAccess DB";
    }
}
class MongoDb implements Database {
    @Override
    public String connect() {
        return "Connection Successfull with MongoDb DB";
    }
}
class XML implements Database {
    @Override
    public String connect() {
        return "Connection Successfull with XML DB";
    }
}

class Oracle implements Database {
    @Override
    public String connect() {
        return "Connection Successfull with Oracle DB";
    }

}

class MySql implements Database{
    @Override
    public String connect() {
        return "Connection Successfull with MySql DB";
    }
}

