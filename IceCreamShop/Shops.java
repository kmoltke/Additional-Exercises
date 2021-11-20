import java.util.ArrayList;
import java.util.stream.*;

public class Shops {
    private ArrayList<IceCreamShop> shops;

    public Shops() {
        shops = new ArrayList<>();
    }

    public ArrayList<IceCreamShop> getIceCreamShops() {
        return shops;
    }

    public void addShop(IceCreamShop shop) {
        if (!shops.contains(shop)) shops.add(shop);
    }

    public void removeShop(IceCreamShop shop) {
        if (shops.contains(shop)) shops.remove(shop);
    }

    public int amountOfShops() {
        return shops.size();
    }

    public ArrayList<IceCreamShop> shopsWithFlavour(String flavour) {
        ArrayList<IceCreamShop> shops;
        shops = this.shops.stream()
                .filter(s -> s.getVariants().contains(flavour))
                .collect(Collectors.toCollection(ArrayList::new));
        return shops;
    }

    public void printShops(String flavour) {
        if (shopsWithFlavour(flavour).isEmpty()) {
            System.out.println("Oh no, there are no shops with the " + flavour + " variant");
        }

        else {
            System.out.println("These are the shops that have the " + flavour + " variant:");
            shopsWithFlavour(flavour).stream()
                .map(IceCreamShop::getName)
                .forEach(System.out::println);
        }
    }
}
