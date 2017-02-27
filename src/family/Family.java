package family;

/**
 * Created by Adrian on 2017-02-27.
 */
public class Family {

    public static void main(String[] args) {
        Mother mother = new Mother("Grażyna");
        Father father = new Father("Janusz");
        Son son = new Son("Sebastian");
        Daugther daugther = new Daugther("Angelika");

    }

    public static void introduce(Mother mother){
        System.out.println("I’m a mother. My name is " + mother.getName());
    };
    public static void introduce(Father father){
        System.out.println("I’m a father. My name is " + father.getName());
    };
    public static void introduce(Son son){
        System.out.println("I’m a son. My name is " + son.getName());
    };
    public static void introduce(Daugther daugther){
        System.out.println("I’m a daugther. My name is " + daugther.getName());
    };
}
