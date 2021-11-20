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
}
