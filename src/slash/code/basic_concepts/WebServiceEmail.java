package slash.code.basic_concepts;

public class WebServiceEmail  implements Email{
    @Override
    public void sendEmail() {
        System.out.println("Web Service Email");
    }
}
