package food;

import java.util.Objects;

public abstract class CosmicFood{
    private String name;
    private int calories;
    private double weight;
    private int numberOfServings;

    protected CosmicFood() {
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories(){
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getNumberOfServings(){
        return numberOfServings;
    }

    public void setNumberOfServings(int numberOfServings) {
        this.numberOfServings = numberOfServings;
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

    public abstract FoodType getType();

}
