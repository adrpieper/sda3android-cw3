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
                new Monkey(true),
                new Monkey(false),
        };

        for (Animal animal : animals) {
            animal.giveSound();
            System.out.println("Mam " + animal.getLegsAmount() + " nogi.");
            if (animal.isPet()) {
                System.out.println("Jestem zwierzęciem domowym");

            }else{
                System.out.println("Jestem zwierzęciem dzikim");
            }
        }

    }
}
