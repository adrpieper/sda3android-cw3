package family;


public class Mother extends FamilyMember{
    public Mother(String name) {
        super(name);
        System.out.println("tworzę obiekt matka");
    }

    @Override
    public void introduceYourself() {
        System.out.println("I’m a mother. My name is " + getName());
    }
}
