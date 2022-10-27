package slash.code.basic_concepts;

public class OutlookEmail implements Email{
    @Override
    public void sendEmail() {
        System.out.println("OutlookEmail");
    }
}
