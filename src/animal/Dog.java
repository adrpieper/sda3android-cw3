package animal;

/**
 * Created by Adrian on 2017-02-28.
 */
public class Dog extends Animal {
    public Dog() {
        super(isPet);
    }

    @Override
    public void giveSound() {
        System.out.println("Hau, Hau!");
    }
}
