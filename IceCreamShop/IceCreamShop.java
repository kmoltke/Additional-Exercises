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
    
}