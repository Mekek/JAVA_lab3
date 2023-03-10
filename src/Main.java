import people.*;
import food.*;

public class Main {
    public static void main(String[] args) {
        Soup soup1 = new Soup("борщ (красный)", 10);
        Soup soup2 = new Soup("борщ (оранжевый)", 10);
        Cutlet cutlet = new Cutlet("Котлета по-киевски", 12);
        Sausage sausage = new Sausage("Баварская колбаска к пиву", 11);
        TomatoJuice tomatoJuice = new TomatoJuice("Томатный сок", 10);
        System.out.println();


        System.out.println("Проверка equals, hashCode, toString для еды.");
        System.out.println(soup1.equals(soup2));
        System.out.println(soup1.hashCode());
        System.out.println(tomatoJuice);
        System.out.println();


        Neznayka neznayka = new Neznayka("главная палуба", 2100);
        Ponchik ponchik = new Ponchik("главная палуба", 350);
        System.out.println();


        System.out.println("Проверка equals, hashCode, toString для персонажей.");
        System.out.println(neznayka.equals(ponchik));
        System.out.println(ponchik.hashCode());
        System.out.println(neznayka);
        System.out.println();

        neznayka.go("пищеблок");
        ponchik.go("пищеблок");
        System.out.println();

        neznayka.showHunger();
        ponchik.showHunger();
        System.out.println();

        neznayka.eat(cutlet, 1);
        neznayka.showHunger();
        ponchik.eat(sausage, 11);
        ponchik.showHunger();
        System.out.println();


        System.out.println("Незнайка хочет спать? " + neznayka.getSleepy());
        System.out.println("Пончик хочет спать? " + ponchik.getSleepy());
        System.out.println();

        ponchik.sleep();
    }
}

