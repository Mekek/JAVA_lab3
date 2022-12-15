package people;


public class Neznayka extends Human{

    public Neznayka(String location, int satiety) {
        this.location = location;
        this.satiety = satiety;
        name = "Незнайка";
        System.out.println(name + " заспавнился в ракете.");
    }

    public boolean sleepy = false;
    public void sleep(){
        System.out.println(name + " заснул.");
        sleepy = false;
    }
}
