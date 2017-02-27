package family;

public abstract class FamilyMember {
    private String name;

    public FamilyMember(String name) {
        this.name = name;
        System.out.println("tworzę członka rodziny");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void introduceYourself();
}
