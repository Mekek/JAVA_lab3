package food;

public class Soup extends CosmicFood implements Edible{
    public Soup(String name, int numberOfServings){
        setName(name);
        setNumberOfServings(numberOfServings);
        setWeight(300);
        setCalories(180);
        System.out.println("Продукт " + name + " в количестве " + numberOfServings + " загружен в ракету.");
    }

    public FoodType getType() {
        return FoodType.FIRST;
    }

    @Override
    public void use() {
        if (getNumberOfServings() > 0) {
            setNumberOfServings(getNumberOfServings() - 1);
            System.out.println("Съеден(а) 1 " + getName());
        }
        else {
            System.out.println("Есть уже нечего...");
        }
    }
}
