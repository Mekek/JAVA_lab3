package people;
import food.CosmicFood;

import java.util.Objects;

public abstract class Human{
    protected String name;
    protected String location;
    protected int satiety;
    protected boolean conscious = true;

    public String getName(){
        return name;
    }

    public String getLocation(){
        return location;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return name.equals(human.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, location, satiety, conscious);
    }

    @Override
    public String toString() {
        return "Персонаж " +
                "под именем \'" + name + '\'' +
                " находится в локации:'" + location + '\'' +
                ", сыт на" + satiety +
                ", находится в сознаии:" + conscious +
                '}';
    }

    public void eat(CosmicFood dish, int amount){
        if (dish.getNumberOfServings() - amount >= 0){
            dish.eat(amount);
            if (satiety + dish.getCalories() >= 2500){
                System.out.println(name + "объелся. Он не доел " + dish + ".");
                satiety += dish.getCalories();
            }
            else {
                satiety += dish.getCalories();
                System.out.println(name + " съел " + dish.getName() + " в количестве: " + amount);
            }
        }
        else {
            System.out.println("На ракете нет такого количества еды...");
        }

    }

    public void go(String place){
        System.out.println(name + " перешёл из " + location + " в " + place + ".");
        location = place;
    }

    public abstract void sleep();

    public void showHunger() {
        if (satiety > 2000) {
            System.out.println(name + " не голоден.");
            System.out.println(name + " сыт на " + satiety + "/2500.");

        }
        else {
            System.out.println(name + " сыт на " + satiety + "/2500.");
        }
    }
}
