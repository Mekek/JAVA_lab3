package people;


public class Ponchik extends Human{
    public Ponchik(String location, int satiety) {
        setLocation(location);
        setSatiety(satiety);
        setName("Пончик");
        setSleepy(true);
        System.out.println(getName() + " появился в ракете.");
    }


    public void sleep(){
        if (getSatiety() >= 2500) {
            System.out.println(getName() + " заснул c едой во рту.");
        }
        else {
            System.out.println(getName() + " заснул.");
        }
        setSleepy(false);
        setConscious(false);
    }
}
