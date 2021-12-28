import java.util.HashMap;
import java.util.Map;

/**
 * DinoDatabase
 */
public class DinoDatabase {
    private Map<String, Integer> db;

    public DinoDatabase() {
        db = new HashMap<>();
    }

    public int size() {
        return db.size();
    }

    public void addDino(String name, int weight) {
        if (db.containsKey(name)) {
            System.out.println(name + " cannot be added. It is already in the database!");
        } else {
            db.put(name, weight);
            System.out.println(name + " added. Weight: " + weight + "kg");
        }
    }

    public void updateDino(String name, int weight) {
        if (db.containsKey(name)) {
            db.put(name, weight);
            System.out.println(name + " updated. Weight: " + weight + "kg");
        } else {
            System.out.println(name + " cannot be updated. It is not in the database!");
        }
    }

    public void removeDino(String name) {
        String msg = db.remove(name) == null ? name + " cannot be removed. It is not in the database!" : name + " removed";
        System.out.println(msg);
    }

    public static void main(String[] args) {
        DinoDatabase ddb = new DinoDatabase();
        ddb.addDino("testDino", 25);
        ddb.removeDino("testDino");
        ddb.removeDino("testDino");
    }
}