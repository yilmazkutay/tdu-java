public class parameter {

    public static void hello(String name) {

        System.out.println("Hello " + name);
    }

    public static void addition(int a, int b) {

        int sum = a + b;

        System.out.print("Sum of the numbers you entered: " + sum);
    }

    public static void main(String[] args) {
        
        hello("Kutay");
        addition(10, 34);
    }
}
