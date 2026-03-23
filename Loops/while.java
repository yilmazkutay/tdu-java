import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {

        int i = 0;

        /* while (i < 10) {
            System.out.println("i = " + i);
            i++;

        } */

        int factorial = 1;
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        while (number > 0) {
            factorial *= number;
            number--;

        }

        System.out.print("Factorial of your number: " + factorial);
    }
}
