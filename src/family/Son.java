package family;


public class Son extends FamilyMember{
    public Son(String name) {
        super(name);
        System.out.println("tworzę obiekt syn");
    }

    @Override
    public void introduceYourself() {
        System.out.println("I’m a son. My name is " + getName());
    }

}
