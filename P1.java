import java.util.Arrays;
import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        Arrays.sort(numbers);

        System.out.println("Minimum: " + numbers[0]);
        System.out.println("Maximum: " + numbers[4]);
    }
}
