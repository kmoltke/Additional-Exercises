import java.util.ArrayList;

/**
 * IceCreamShop
 */
public class IceCreamShop {
    private String name;
    private ArrayList<String> iceCreamVariants;

    public IceCreamShop(String name) {
        this.name = name;
        iceCreamVariants = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getVariants() {
        return iceCreamVariants;
    }

    public void addFlavours(String flavour) {
        if (!iceCreamVariants.contains(flavour)) iceCreamVariants.add(flavour);
    }

    public void removeFlavours(String flavour) {
        if (!iceCreamVariants.contains(flavour)) iceCreamVariants.remove(flavour);
    }

    public int amountOfVariants() {
        return iceCreamVariants.size();
    }

    public void printFlavours() {
        System.out.println(name + " has " + amountOfVariants() + "different flavours:");
        for (String variant : iceCreamVariants) {
            System.out.println(variant);
        }
    }
    
}