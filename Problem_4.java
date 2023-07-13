package t2021_2_1;
public class Problem_4 {
    public static void main(String[] args) {
        
        
        int[] numbers = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};
        int[] multiples = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int[] counts = new int[multiples.length];

        for (int i = 0; i < multiples.length; i++) {
            int multiple = multiples[i];
            int count = 0;
            for (int j = 0; j < numbers.length; j++) {
                int number = numbers[j];
                if (number % multiple == 0) {
                    count++;
                }
            }
            counts[i] = count;
        }
System.out.println("{");
        for (int i = 0; i < multiples.length; i++) {
            System.out.println(multiples[i] + ": " + counts[i]+", ");
        }
        System.out.println("}");
    }
}