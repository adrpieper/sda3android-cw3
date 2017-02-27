package person;

/**
 * Created by Adrian on 2017-02-27.
 */
public class PersonTest {

    public static void main(String[] args) {
        Integer integer = 5;
        Object o = new Object();
        Person p = new Person();

        Object[] objects = new Object[]{integer,o,p,3,10f};

        for (int i = 0 ; i < objects.length ; i++) {

            System.out.println(objects[i]);
        }

        Person person = new Person();
        person.setName("Adam");
        person.setSurname("Kowalski");
        person.setAge(30);
        System.out.println(person);
        System.out.println("person:");
        System.out.println(person.getName());
        System.out.println(person.getSurname());
        System.out.println(person.getAge());

    }
}
