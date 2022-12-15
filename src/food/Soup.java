package food;

public class Soup extends CosmicFood implements Edible{

    protected final double weight = 300;
    protected final double calories = 180;
    public Soup(String name, int calories, int numberOfServings){
        super.name = name;
        super.numberOfServings = numberOfServings;
        System.out.println("Продукт " + name + " в количестве " + numberOfServings + " загружен в ракету.");
    }

    public FoodType getType() {
        return FoodType.FIRST;
    }

    @Override
    public void use() {
        if (numberOfServings > 0) {
            numberOfServings -= 1;
            System.out.println("Съеден(а) 1 " + name);
        }
        else {
            System.out.println("Есть уже нечего...");
        }
    }
}
