package slash.code.template_method_pattern;

public class TestTemplateMethod {

    public static void main(String[] args) {
        ExcelFile obj= new ExcelFile();
        obj.redProcessAndSave();

        TextFile obj2= new TextFile();
        obj2.redProcessAndSave();
    }



}
