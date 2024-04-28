import java.util.Scanner;

public class TomAndJerry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 2 != 0 && number >= 20 && number <= 30) {
            System.out.println("Tom");
        } else if (number % 2 == 0 && number >= 20 && number <= 30) {
            System.out.println("Jerry");
        }
        
    }
}
