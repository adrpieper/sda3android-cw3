package family;

import java.util.Scanner;

/**
 * Created by Adrian on 2017-03-01.
 */
public class FamilySwitch {

    public static void main(String[] args) {

        System.out.println("Kto ma się przedstawić?");
        System.out.println("1 - tata");
        System.out.println("2 - mama");
        System.out.println("3 - syn");
        System.out.println("4 - córka");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        FamilyMember member = null;
        switch (i) {
            case 1 :
                member = new Father("Andrzej");
                break;
            case 2 :
                member = new Mother("Bożena");
                break;
            case 3 :
                member = new Son("Jurek");
                break;
            case 4 :
                member = new Daugther("Ania");
                break;
        }
        member.introduceYourself();


    }
}
