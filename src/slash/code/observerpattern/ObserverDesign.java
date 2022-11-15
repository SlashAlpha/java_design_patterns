 package slash.code.observerpattern;

import java.util.ArrayList;
import java.util.Iterator;

public class ObserverDesign {

/*
Behavioural pattern
-------------------
Observer Design pattern defines one to many dependencies between Objects
so when one object change s its state, all of its dependent objects
 gets notified or updated automatically;

 */

    public static void main(String[] args) {
        Book book=new Book("GooseBumps","Horror","Xyz",200,"SoldOut");
        EndUser user1=new EndUser("Thomas",book);
        EndUser user2=new EndUser("Martin",book);
        EndUser user3=new EndUser("Bernadette",book);
        ArrayList<Observer>suscribers=book.getObsList();
        for (Iterator<Observer> itr=suscribers.iterator();itr.hasNext();){
            EndUser eu= (EndUser) itr.next();
            System.out.println(eu.getName()+" has suscribed for "+book.getName()+" book");
        }
        System.out.println(book.getInStock());
        System.out.println("Book"+book.getName()+" is now availabe");
        book.setInStock("Back in stock");



    }
}

interface SubjectLibrary{
    public void suscribeObserver(Observer obs);
    public void unsuscribeObserver(Observer obs);
    public void notifyObserver();

}

interface Observer{
    public void update(String avail);
}
class Book implements SubjectLibrary{
    private String name;
    private String type;
    private String author;
    private double price;
    private String inStock;
    private ArrayList<Observer>obsList=new ArrayList<Observer>();

    public Book(String name, String type, String author, double price, String inStock) {
        this.name = name;
        this.type = type;
        this.author = author;
        this.price = price;
        this.inStock = inStock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getInStock() {
        return inStock;
    }

    public void setInStock(String inStock) {
        this.inStock = inStock;
        System.out.println("Availability changed from Sold Out to Back In Stock");
        notifyObserver();
    }

    public ArrayList<Observer> getObsList() {
        return obsList;
    }

    public void setObsList(ArrayList<Observer> obsList) {
        this.obsList = obsList;
    }

    @Override
    public void suscribeObserver(Observer obs) {
        obsList.add(obs);

    }

    @Override
    public void unsuscribeObserver(Observer obs) {
        obsList.remove(obs);

    }

    @Override
    public void notifyObserver() {
        System.out.println("Book name='" + this.name + '\'' +
                ",Book type='" + this.type + '\'' +
                ",Book author='" + this.author + '\'' +
                ",Book price=" + this.price +
                ",Book inStock='" + this.inStock + '\'' );

        for (Observer o:obsList){
            o.update(this.inStock);
        }

    }


}

class EndUser implements Observer{
   private String name;

    public EndUser(String name,SubjectLibrary subject) {
        this.name = name;
        subject.suscribeObserver(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(String avail) {
        System.out.println("Hello "+name+" ! We are glad to notify you that your book is now "+avail);
    }
}
