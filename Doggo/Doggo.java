package Doggo;

/**
 * @author Kristian Moltke Reitzel
 * Doggo
 */
public class Doggo {
    private String name;
    private boolean goodBoi;

    public Doggo(String name) {
        this.name = name;
        goodBoi = false;
    }

    public String getName() {
        return name;
    }

    public void makeBark() {
        System.out.println(name + " said: Woof woof");
    }

    public void makeGoodBoi(){
        goodBoi = true;
    }

    public boolean isGoodBoi() {
        return goodBoi;
    }

    public void whosAGoodBoi() {
        String good = name + " is such a goood boii";
        String bad = name + " is not a good boi :(";
        System.out.println(goodBoi ? good : bad);
    }
}