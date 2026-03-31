import java.util.Scanner;

public class methods {
  
    public static void hello() {

        System.out.println("Indroduction to Methods");
    }

    public static void factorial() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int factorialofnumber = 1;

        while (number > 0) {

            factorialofnumber *= number;
            number--;
        }

        System.out.print("Factorial of the number you entered: " + factorialofnumber);
    }
    public static void main(String[] args) {

        hello();
        factorial();
    }
}
