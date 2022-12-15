package food;

public class TomatoJuice extends CosmicFood implements NonEdible {

    protected final double weight = 120;
    protected final double calories = 60;
    public TomatoJuice(String name, int numberOfServings) {
        super.name = name;
        super.numberOfServings = numberOfServings;
        System.out.println("Продукт " + name + " в количестве " + numberOfServings + " загружен в ракету.");
    }

    public FoodType getType() {
        return FoodType.DRINK;
    }


    @Override
    public void throwAway() {
        if (numberOfServings > 0) {
            numberOfServings -= 1;
            System.out.println("Выкинул " + name + ". Кто вообще ЭТО ест?");
        } else {
            System.out.println("Какой-то добрый человек уже выкинул эту гадость за тебя.");
        }
    }
}