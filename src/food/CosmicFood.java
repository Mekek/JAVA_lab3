package food;

import java.util.Objects;

public abstract class CosmicFood{
    protected String name;
    protected int calories;
    protected double weight;
    protected int numberOfServings;

    protected CosmicFood() {
    }

    public void eat(int amount){
        numberOfServings -= amount;

        if (numberOfServings == 0){
            System.out.println("Внимание! На ракете закончился продукт: " + name);
        }
    }

    @Override
    public String toString() {
        return "Космическая еда " +
                "под назавнием:'" + name + '\'' +
                ", калорийность:" + calories +
                ", вес:" + weight +
                ", количество порций:" + numberOfServings;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, calories, weight, numberOfServings);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CosmicFood that = (CosmicFood) o;
        return calories == that.calories;
    }

    public String getName(){
        return name;
    }

    public int getCalories(){
        return calories;
    }

    public int getNumberOfServings(){
        return numberOfServings;
    }

    public abstract FoodType getType();

}
