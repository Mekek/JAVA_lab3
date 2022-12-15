package food;

public class Cutlet extends CosmicFood implements Edible{

    protected final double weight = 180;
    protected final double calories = 200;
    public Cutlet(String name, int calories, int numberOfServings){
        super.name = name;
        super.numberOfServings = numberOfServings;

        System.out.println("Продукт " + name + " в количестве " + numberOfServings + " загружен в ракету.");
    }

    public FoodType getType() {
        return FoodType.SECOND;
    }

    @Override
    public void use() {
        if (numberOfServings > 0) {
            numberOfServings -= 1;
            System.out.println("Съеден(а) 1 " + name);
        } else {
            System.out.println("Есть уже нечего...");
        }
    }
}
