public class MissingCheckOutException extends Exception {
    private static int finePrice = 50;
    public MissingCheckOutException(long lastCheckIn, long ticketPrice) {
        super("Missing check out (" + lastCheckIn + " minutes since last check in): Ticket price of " + ticketPrice + " DKK and a fine of " + finePrice + " DKK is deducted from your account");
    }
}
