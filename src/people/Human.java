package people;
import food.CosmicFood;

import java.util.Objects;

public abstract class Human{
    private String name;
    private String location;
    private int satiety;
    private boolean conscious = true;
    private boolean sleepy;

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name =  name;
    }

    public void setSleepy(boolean sleepy) {
        this.sleepy = sleepy;
    }
    public boolean getSleepy() {
        return sleepy;
    }

    public void setLocation (String location) {
        this.location = location;
    }
    public String getLocation (){
        return location;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setConscious(boolean conscious) {
        this.conscious = conscious;
    }

    public boolean getConscious() {
        return conscious;
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
                "под именем '" + name + '\'' +
                " находится в локации:'" + location + '\'' +
                ", сыт на " + satiety +
                ", находится в сознаии: " + conscious;
    }

    public void eat(CosmicFood dish, int amount){
        if (dish.getNumberOfServings() - amount >= 0){
            dish.eat(amount);
            if (satiety + dish.getCalories() * amount >= 2500){
                satiety += dish.getCalories() * amount;
                dish.setNumberOfServings(dish.getNumberOfServings() + (satiety - 2500) / dish.getCalories());
                if ((satiety - 2500) / dish.getCalories() != 0) {
                    System.out.println(name + " объелся. Он не доел " + dish.getName() + " в количестве " + (satiety - 2500) / dish.getCalories() + ". Эта еда вернулась на склад.");
                } else System.out.println(name + " объелся. Он не доел " + dish.getName() + ".");
                satiety = 2500;

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

    public void wakeUp() {
        setConscious(true);
        System.out.println(getName() + " проснулся.");
    }

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
