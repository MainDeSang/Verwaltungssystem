//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Book hdr = new Book("Herr der Ringer", "J.K Rolling", "turm", 19.00 , 1235234 );
        Book book2 = new Book("Ein einsame Mann", "J.K Rolling", "turm", 19.00 , 1235234 );
        Customer kunde =  new Customer("Anton", 24);


        Library.setBook(hdr);
        Library.setBook(book2);

        Library.displayBooks();

    }
}