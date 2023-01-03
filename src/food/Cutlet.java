package food;

public class Cutlet extends CosmicFood implements Edible{
    public Cutlet(String name, int numberOfServings){
        setName(name);
        setNumberOfServings(numberOfServings);
        setWeight(180);
        setCalories(200);
        System.out.println("Продукт " + name + " в количестве " + numberOfServings + " загружен в ракету.");
    }

    public FoodType getType() {
        return FoodType.SECOND;
    }

    @Override
    public void use() {
        if (getNumberOfServings() > 0) {
            setNumberOfServings(getNumberOfServings() - 1);
            System.out.println("Съеден(а) 1 " + getName());
        } else {
            System.out.println("Есть уже нечего...");
        }
    }
}
