public class Customer {

    //Finale Klassenvariablen
    private String name;
    private int age;

    
    
    //Konstruktor
    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    
    //Setter und Getter Methoden
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
