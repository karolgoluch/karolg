public class Person {
    private String name;

    public Person() {
        System.out.println("tworzymy person");

    }

    public Person(String name) {
        this.name=name;
    }

    public void introduce() {
        System.out.println("My name is "+name);
    }
}
