package animal;

/**
 * Created by Adrian on 2017-02-28.
 */
public class Monkey extends Animal {

    public Monkey(boolean isPet) {
        super(isPet);
    }

    @Override
    public void giveSound() {
        System.out.println("Monkey sound...");
    }

    @Override
    public int getLegsAmount() {
        return 2;
    }
}
