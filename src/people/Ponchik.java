package people;


public class Ponchik extends Human{
    public Ponchik(String location, int satiety) {
        this.location = location;
        this.satiety = satiety;
        name = "Пончик";
        System.out.println(name + " заспавнился в ракете.");
    }

    public boolean sleepy = true;
    public void sleep(){
        if (satiety >= 2500) {
            System.out.println(name + " заснул c едой во рту.");
        }
        else {
            System.out.println(name + " заснул.");
        }
        sleepy = false;
    }
}
