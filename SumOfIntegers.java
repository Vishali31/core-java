import java.util.Scanner;

public class SumOfIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                sum += scanner.nextInt();
            } else {
                System.out.println("Non-integer value entered.");
                break;
            }
        }

        System.out.println("Total sum of integers: " + sum);
    }
}
