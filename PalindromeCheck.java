import java.util.Scanner;

class PalindromeCheck {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            long number = scanner.nextLong();
            long sum = 0;
            long reverse = 0; 
            long reverseDigit = 0;
            long sumDigit = 0;
            long reverseNumber = number;
            long sumNumber = number;

            while (reverseNumber != 0) {
                reverseDigit = reverseNumber % 10;
                reverse = reverse * 10 + reverseDigit;
                reverseNumber /= 10;
            }

            if(number != reverse){
                System.out.println(number + " is not palindrome");
                return;
            }

            while (sumNumber > 0) {
                sumDigit = sumNumber % 10;
                if (sumDigit % 2 == 0) {
                    sum += sumDigit;
                }
                sumNumber /= 10;
            }

            if (sum > 25) {
                    System.out.println(number + " is palindrome and the sum of even numbers is greater than 25");
                    return;
                } else {
                    System.out.println(number + " is palindrome and sum of even numbers is less than 25");
                    return;
                }
            
    }
}