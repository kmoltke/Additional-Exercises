public class CardBlockedException extends Exception {
    public CardBlockedException() {
        super("Error: Cannot check in; Too many missed checkouts: Card blocked");
    }
}
