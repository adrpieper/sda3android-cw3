package family;

import java.util.Arrays;

/**
 * Created by Adrian on 2017-02-27.
 */
public class Family {

    private Mother mother = new Mother("Grażyna");
    private Father father = new Father("Janusz");
    private Son son = new Son("Sebastian");
    private Daugther daugther = new Daugther("Angelika");

    public void introduce(){
        FamilyMember[] members = new FamilyMember[]{mother,father,son,daugther};
        System.out.println("Rodzina: ");
        for (FamilyMember member : members) {
            member.introduceYourself();
        }
    }

    public static void main(String[] args) {
        Family family = new Family();
        family.mother.setName("Janina");
        family.introduce();
        Family family1 = new Family();
        family1.introduce();
    }
}
