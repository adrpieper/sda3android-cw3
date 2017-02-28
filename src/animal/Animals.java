package animal;

/**
 * Created by Adrian on 2017-02-28.
 */
public class Animals {

    public static void main(String[] args) {
        Animal[] animals = new Animal[]{
                new Cat(),
                new Dog(),
                new Hamster(),
                new Monkey()
        };

        for (Animal animal : animals) {
            animal.giveSound();
            System.out.println("Mam " + animal.getLegsAmount() + " nogi.");
        }

    }
}
