package animal;

/**
 * Created by Adrian on 2017-02-28.
 */
public class Hamster extends Animal {

    public Hamster() {
        super(true);
    }

    @Override
    public void giveSound() {
        System.out.println("Hamster sound...");
    }
}
