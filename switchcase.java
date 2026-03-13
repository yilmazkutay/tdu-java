import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        
        System.out.print("Please enter a number (1-4): ");
        Scanner scanner = new Scanner(System.in);

        int op = scanner.nextInt();

       if(op < 1 || op > 4) {
            System.out.println("INVALID NUMBER!");
            System.exit(1);
       
       }
       else {
            switch(op) {
                case 1:
                    System.out.print("Addition");
                    break;
                
                case 2:
                    System.out.print("Substraction");
                    break;

                case 3:
                    System.out.print("Multiplication");
                    break;

                case 4:
                    System.out.print("Division");
                    break;
            
                default:
                    System.out.print("Invalid Number");
                    break;
            }
       }

        System.out.println();

        System.out.print("Please enter two numbers: ");

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        switch(op) {
            case 1:
                System.out.print("Result: " + addition);
                break;

            case 2:
                System.out.print("Result: " + subtraction);
                break;

            case 3:
                System.out.print("Result: " + multiplication);
                break;

            case 4:
                System.out.print("Result: " + division);
                break;
        
            default:
                break;
        }        
    } 
}
