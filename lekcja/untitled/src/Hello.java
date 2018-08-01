import java.util.ArrayList;
import java.util.List;

public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello Worldjfsdkjnfjds!");
        Person person = new Person("Janusz");
//        person.introduce();

        Person person2 = new Person("Stefan");
//        person2.introduce();

        List <Person> lista = new ArrayList<>();
        lista.add(person);
        lista.add(person2);

        for (Person p:lista) {
            p.introduce();

        }
    }
}


