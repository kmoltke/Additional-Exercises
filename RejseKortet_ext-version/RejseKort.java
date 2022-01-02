import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Kristian Moltke Reitzel
 * 
 *         RejseKort
 * 
 */
public class RejseKort {
    private long balance;
    private boolean isCheckedIn;
    private long timeStamp;
    private Set<Long> xCoords;
    private Set<Long> yCoords;
    private int missingCheckOuts;
    private boolean isBlocked;
    private final int FINEPRICE = 50;

    public RejseKort() {
        balance = 100;
        isCheckedIn = false;
        isBlocked = false;
        xCoords = new HashSet<>();
        yCoords = new HashSet<>();
    }

    public void depositMoney(int dkk) {
        try {
            if (dkk < 0)
                throw new NegativeAmountException();
            balance += dkk;
            System.out.println(dkk + " DKK deposited. New balance: " + balance + " DKK");

        } catch (NegativeAmountException e) {
            System.out.println(e.getMessage());
        }

    }

    public boolean isCheckedIn(long timeStamp) {
        return isCheckedIn && timeTraveled(timeStamp) <= 120 ? true : false;
    }

    public long timeTraveled(long timeStamp) {
        return timeStamp - this.timeStamp;
    }

    public void checkIn(long x, long y, int timeStamp) {
        try {
            if (isBlocked)
                throw new CardBlockedException();

            if (isCheckedIn && timeTraveled(timeStamp) > 120)
                throw new MissingCheckOutException(timeTraveled(timeStamp), calculatePrice());

            if (balance < 100)
                throw new NotEnoughMoneyException(balance);

            addCoordinates(x, y);
            if (isCheckedIn) {
                System.out.println(
                        "Continued journey (" + Math.abs(timeTraveled(timeStamp)) + " minutes since last check in)");
                this.timeStamp = timeStamp;
            }

            else {
                isCheckedIn = true;
                this.timeStamp = timeStamp;
                System.out.println("Checked in");
            }

        } catch (NotEnoughMoneyException e) {
            System.out.println(e.getMessage());
        } catch (MissingCheckOutException e) {
            handleMissingCheckOut(x, y, e);
            checkIn(x, y, timeStamp);
        } catch (CardBlockedException e) {
            System.out.println(e.getMessage());
        }

    }

    private void handleMissingCheckOut(long x, long y, MissingCheckOutException e) {
        setBalance();
        balance = balance - FINEPRICE;
        isCheckedIn = false;
        missingCheckOuts++;
        if (missingCheckOuts >= 3) isBlocked = true;
        System.out.println(e.getMessage());
    }

    public void checkOut(long x, long y, int timeStamp) {
        try {
            if (isCheckedIn && timeTraveled(timeStamp) > 120)
                throw new MissingCheckOutException(timeTraveled(timeStamp), calculatePrice());
            if (!isCheckedIn)
                throw new NotCheckedInException();
            addCoordinates(x, y);
            setBalance();
            isCheckedIn = false;
            System.out.println(
                    "Checked out! " + Math.abs(timeTraveled(timeStamp)) + " minutes since last check in. Price is "
                            + calculatePrice() + " DKK, remaining balance is " + balance + " DKK");

        } catch (NotCheckedInException e) {
            System.out.println(e.getMessage());
        } catch (MissingCheckOutException e) {
            handleMissingCheckOut(x, y, e);
        }
    }

    private void setBalance() {
        balance = balance - Math.abs(calculatePrice());
    }

    public void addCoordinates(long x, long y) {
        xCoords.add(x);
        yCoords.add(y);
    }

    public long calculatePrice() {
        long maxX = Collections.max(xCoords);
        long maxY = Collections.max(yCoords);
        long minX = Collections.min(xCoords);
        long minY = Collections.min(yCoords);
        long result = 12 + (maxX - minX + maxY - minY) * 3;
        if (result <= 12) {
            return 12;
        }
        return result <= 50 ? result : 50;
    }
}