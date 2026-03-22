import java.util.Scanner;

// for (start; condition; increasing or decreasing)

public class forloop {
    public static void main(String[] args) {

       /* int i;

        for (i = 0; i <= 5; i++) {
            System.out.println("i = " + i);

        } */

        /* we can also define i inside the for loop. 

        for (int i = 0; i <= 5; i++) {
            System.out.println("i = " + i);

        } */

        int factorial = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            factorial *= i;
            
        }    

        System.out.print("Factorial of your number is: " + factorial);
  
    } 
}
