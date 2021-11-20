import java.util.ArrayList;

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

    
}
