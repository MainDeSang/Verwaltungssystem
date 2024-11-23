import java.sql.SQLOutput;

public class Book {


    //Klassen Variablen
    private String title;
    private String author;
    private String publisher;
    private double price;
    private int isbn;


    //Konstruktor
    public Book(String title, String author, String publisher, double price, int isbn) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
        this.isbn = isbn;
    }

    //Klassen Methoden
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getIsbn() {
        return isbn;
    }
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }


    //Methode toString der Ursprungsklasse Object überschreiben, damit ein String mit dem Inhalt ausgegeben wird und
    //nicht wie ursprünglich Implementiert (Hashcode wird ausgegeben).
    @Override
    public String toString() {
        return "Title: " + this.title;
    }
}
