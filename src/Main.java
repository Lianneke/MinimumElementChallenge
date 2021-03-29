import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        readInteger();
        ;
    }

    public static int readInteger() {
        System.out.println("How many numbers do you want to enter?\r");
        int number = scanner.nextInt();
        readElements(number);
        return number;
    }

    public static int[] readElements(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] numbers = new int[number];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();

        }
        System.out.println("The smallest element = " + findMin(numbers));
        return numbers;
    }

    public static int findMin(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }

}
