package family;


public class Father extends FamilyMember{

    public Father(String name) {
        super(name);
        System.out.println("tworzę obiekt ojciec");
    }

    @Override
    public void introduceYourself() {
        System.out.println("I’m a father. My name is " + getName());
    }

}
