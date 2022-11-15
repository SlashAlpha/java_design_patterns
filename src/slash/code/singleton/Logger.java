package slash.code.singleton;

public class Logger {
    /*
    Singleton pattern is a creationnal pattern which allow only one instance of a class to be created and will be available for the whole application
    Reusable
     */
   private static Logger logger;

    private Logger() {
    }
    public static Logger getInstance(){
        if(logger==null){
            logger=new Logger();
        }
        return logger;
    }
}
