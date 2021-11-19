import java.util.Scanner;

/**
 * Main
 */
public class Main {
    public int sum(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            Main m = new Main();
            int x = in.nextInt();
            int y = in.nextInt();
            System.out.println(m.sum(x, y));
        }
        in.close();

    }
}