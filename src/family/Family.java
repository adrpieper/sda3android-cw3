package family;

import java.util.Arrays;

/**
 * Created by Adrian on 2017-02-27.
 */
public class Family {

    public static void main(String[] args) {

        Mother mother = new Mother("Grażyna");
        Father father = new Father("Janusz");
        Son son = new Son("Sebastian");
        Daugther daugther = new Daugther("Angelika");

        FamilyMember[] members = new FamilyMember[]{mother,father,son,daugther};
        System.out.println("Rodzina: ");
        for (FamilyMember member : members) {
            member.introduceYourself();
        }

    }
}
