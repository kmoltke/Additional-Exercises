public class Main {
    public static void main(String[] args) {
		RejseKort r;
		r = new RejseKort();
		r.depositMoney(1000);
		r.checkIn(0, 0, 1000);
		r.checkIn(0, 0, 1200);
		r.checkIn(0, 0, 1400);
		r.checkIn(0, 0, 1600);
        






        // r.depositMoney(100);
        // r.checkIn(20, 30, 5);
        // r.checkIn(5, 10, 10);
        // r.checkIn(20, 50, 15);
        // r.checkIn(2, 3, 20);
        // r.checkIn(30, 7, 30);
        // // System.out.println(r.isCheckedIn(8));
        // r.checkOut(20, 15, 40);
        // r.checkIn(5, 2, 50);
    }
}
