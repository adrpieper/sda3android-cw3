package animal;

/**
 * Created by Adrian on 2017-02-28.
 */
public abstract class Animal {

    private final boolean isPet;

    protected Animal(boolean isPet) {
        this.isPet = isPet;
    }

    public boolean isPet() {
        return isPet;
    }

    public abstract void giveSound();

    public int getLegsAmount() {
        return 4;
    }
}
