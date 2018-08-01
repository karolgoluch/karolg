public class Person {
    private String name;

    public Person() {
        System.out.println("tworzymy person");

    }

    Person(String name) {
        this.name=name;
    }

    void introduce() {
        System.out.println("My name is "+name);
    }
}
