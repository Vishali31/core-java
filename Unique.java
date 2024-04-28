import java.util.Scanner;

public class Unique {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        
        boolean isUnique = true;
        int[] digits = new int[10]; 
        while (number > 0) {
            int digit = number % 10;
            if (digits[digit] > 0) {
                isUnique = false;
                break;
            }
            digits[digit]++;
            number /= 10;
        }

        
        if (isUnique) {
            System.out.println("The integer is unique.");
        } else {
            System.out.println("The integer is not unique.");
        }
    }
}