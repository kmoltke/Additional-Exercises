package Doggo;

/**
 * @author Kristian Moltke Reitzel
 * Doggo
 */
public class Doggo {
    private String name;

    public Doggo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void makeBark() {
        System.out.println(name + " said: Woof woof");
    }
    
}