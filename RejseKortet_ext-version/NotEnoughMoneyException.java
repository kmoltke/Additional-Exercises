public class NotEnoughMoneyException extends Exception{
    public NotEnoughMoneyException(long balance) {
        super("Not enough money in account to check in. Please deposit at least " + Math.abs(balance - 100) + " DKK");
    }
}
