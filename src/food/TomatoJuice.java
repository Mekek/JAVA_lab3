package food;

public class TomatoJuice extends CosmicFood implements NonEdible {
    public TomatoJuice(String name, int numberOfServings) {
        setName(name);
        setNumberOfServings(numberOfServings);
        setWeight(120);
        setCalories(60);
        System.out.println("Продукт " + name + " в количестве " + numberOfServings + " загружен в ракету.");
    }

    public FoodType getType() {
        return FoodType.DRINK;
    }


    @Override
    public void throwAway() {
        if (getNumberOfServings() > 0) {
            setNumberOfServings(getNumberOfServings() - 1);
            System.out.println("Выкинул " + getName() + ". Кто вообще ЭТО ест?");
        } else {
            System.out.println("Какой-то добрый человек уже выкинул эту гадость за тебя.");
        }
    }
}