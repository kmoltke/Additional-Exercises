public class NegativePointsException extends Exception {
    public NegativePointsException() {
        super("Cannot add or revoke negative number of points");
    }
}
