public class MissingCheckOutException extends Exception {
    public MissingCheckOutException(int lastCheckIn, int ticketPrice, int finePrice) {
        super("Missing check out (" + lastCheckIn + " minutes since last check in): Ticket price of " + ticketPrice + " DKK and a fine of " + finePrice + " DKK is deducted from your account");
    }
}
