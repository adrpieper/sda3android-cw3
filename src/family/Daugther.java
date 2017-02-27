package family;


public class Daugther extends FamilyMember {

    public Daugther(String name) {
        super(name);
        System.out.println("tworzę obiekt córka");
    }

    @Override
    public void introduceYourself() {
        System.out.println("I’m a dauther. My name is " + getName());
    }
}
