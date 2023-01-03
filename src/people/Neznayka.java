package people;


public class Neznayka extends Human{

    public Neznayka(String location, int satiety) {
        setLocation(location);
        setSatiety(satiety);
        setName("Незнайка");
        setSleepy(false);
        System.out.println(getName() + " появился в ракете.");
    }

    public void sleep(){
        System.out.println(getName() + " заснул.");
        setSleepy(false);
        setConscious(false);
    }


}
