public class usingreturn {

    public static int addition (int a, int b) {

        return a + b;
    }
    
    public static void main(String[] args) {

        System.out.print("Sum of a and b: " + addition(10, 34));
        // if we use "return" then we can write our method like this.
        // thus we can use the value of our function in other functions.
    }
}
