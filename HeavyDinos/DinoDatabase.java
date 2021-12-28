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
    
}