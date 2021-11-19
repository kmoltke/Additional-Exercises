import java.util.Scanner;

/**
 * This exercise will train your skill in using a scanner. The task is simple: Get the sum of two integers. All test cases contain an integer x and an integer y.

Your task is to scan the input, calculate, and then print the sum.

Hint: Remember to import the Scanner
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