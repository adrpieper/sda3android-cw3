package animal;

/**
 * Created by Adrian on 2017-02-28.
 */
public class Cat extends Animal {

    public Cat() {
        super(true);
    }

    @Override
    public void giveSound() {
        System.out.println("Miał, miał!");
    }
}
