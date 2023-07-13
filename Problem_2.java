package t2021_2_1;
import java.util.Scanner;

public class Problem_2 {
    public static void main(String[] args) {
        Scanner y = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a = y.nextInt();

        for (int i = 1; i <= a; i++) {
            System.out.print(2 * i - 1);
            if (i != a) {
                System.out.print(", ");
            }
        }
    }
}

