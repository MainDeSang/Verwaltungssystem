import java.util.ArrayList;
import java.util.List;

public class Library {

    // Eigenschaft der Statischen Klasse Library
    private static final List<Book> listOfBooks = new ArrayList<>();;

    // Kunstruktor wurde Privat erstellt damit man kein Objekt aus der Klasse erstellen kann
    // und alle Eigenschaften sind einmalig in der Klasse Definiert
    private Library() {}

    //fügt Bücher der ArrayListe hinzu und speichert sie darin.
    public static void setBook(Book book) {
        listOfBooks.add(book);
    }
    //For Schleife um alle verfügbaren Bücher aus der ArrayListe anzeigen. Für die Sout Ausgabe wird die überschriebene
    //toString() Methode genutzt, welche in der Klasse Books überschrieben wurde, damit Text und nicht der Hashcode
    //ausgegeben wird.
    public static void displayBooks() {
        for (Book book : listOfBooks) {
            System.out.println(book.toString());
        }
    }

}
