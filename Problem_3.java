package t2021_2_1;
import java.util.Scanner;

public class Problem_3{
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);

        System.out.print("Enter the value of x: ");
        int x = m.nextInt();

        for (int i = 1; i <= x; i++) {
            if (i % 2 != 0) {
                System.out.print(i);
                if (i != x - 1 && i != x) {
                    System.out.print(", ");
                }
            }
        }
    }
}
