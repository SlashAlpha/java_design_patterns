package slash.code.template_method_pattern;

public abstract class DataProcessor {
    public void redProcessAndSave(){
        readData();
        processData();
        saveData();
    }
    public abstract void readData();
    public abstract void processData();
    public void saveData(){
        System.out.println("Save data to Db");
    }
}
