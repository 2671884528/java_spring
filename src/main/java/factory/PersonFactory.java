package factory;

public class PersonFactory {
    public static Person getPerson(){
        return new Person();
    }
    public Person getPerson1(){
        return new Person();
    }
}
