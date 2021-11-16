package Minions;

public class Minion {
    private String name;
    private boolean minionStatus;
    private int minionPoints;

    public Minion(String name) {
        this.name = name;
        minionPoints = 1;
        minionStatus = true;
    }

    public String getName() {
        return name;
    }

    public int getMinionPoints() {
        return minionPoints;
    }

    public String evilLaugh() {
        return "Muahahaha";
    }

    public void printMinionStatus() {
        if (minionStatus) {
            System.out.println(name + " is a minion.");
            System.out.println(evilLaugh());
        } else {
            System.out.println(name + " is not a minion... anymore.");
        }
    }

    public void undoMinion() {
        minionStatus = false;
        minionPoints = 0;
        System.out.println(name + " is no longer a minion and has lost all minion privileges.");
    }
}
