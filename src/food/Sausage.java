package food;

public class Sausage extends CosmicFood implements Edible{
    public Sausage(String name, int numberOfServings){
        setName(name);
        setNumberOfServings(numberOfServings);
        setWeight(170);
        setCalories(210);
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
