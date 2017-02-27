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
            introduce(member);
        }
    }

    public static void introduce(FamilyMember member) {
        if (member instanceof Mother) {
            introduce((Mother) member);
        }
        else if (member instanceof Father) {
            introduce((Father) member);
        }
        else if (member instanceof Son) {
            introduce((Son) member);
        }
        else if (member instanceof Daugther) {
            introduce((Daugther) member);
        }
    }

    public static void introduce(Mother mother){
        System.out.println("I’m a mother. My name is " + mother.getName());
    }
    public static void introduce(Father father) {
        System.out.println("I’m a father. My name is " + father.getName());
    }
    public static void introduce(Son son){
        System.out.println("I’m a son. My name is " + son.getName());
    }
    public static void introduce(Daugther daugther){
        System.out.println("I’m a daugther. My name is " + daugther.getName());
    }
}
