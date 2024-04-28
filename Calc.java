import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
     
     Scanner scanner = new Scanner(System.in);
     int first = 0;
     int second = 0;
     int choice = 1;
     char repeat = "";
   

    
   
    do{
        System.out.print("Enter the first number: ");
        first = scanner.nextInt();

        System.out.print("Enter the second number: ");
        second = scanner.nextInt();

        System.out.println("Enter number beside the operation to perform:  1. Add  2.Subtract  3.Multiply  4.Divide ");
        choice = scanner.nextInt();

        int result = calculate(first, second, choice);
        System.out.println(result);

        System.out.println("Do you want to try again(y/n)");
        repeat = scanner.next().charAt(1);
    
    }while(repeat == 'y');


        public static String calculate(int num1, int num2, int choice) {
            String s = "";
            int total = 0;
                switch(choice) {
                    case 1:
                        total = num1 + num2;
                        s = num1 + "+" + num2 + "=" + total;
                    return s;
                    case 3:
                          total = num1 * num2;
                        s = num1 + "*" + num2 + "=" + total;
                    return s;
                    case 4:
                         total = num1 / num2;
                        s = num1 + "/" + num2 + "=" + total;
                    return s;
                    case 2:
                          total = num1 - num2;
                        s = num1 + "-" + num2 + "=" + total;
                    return s;
                    default:
                        return s;
                }
        }
    }
}
