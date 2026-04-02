package OOP.publicoop;

public class Test {
    public static void main(String[] args) {
        
        Car car = new Car();
        
        car.brand = "Audi";
        car.color = "Black";
        car.wheel = 4;
        car.door = 4;
        // we can easily access to our features (public).

        System.out.println(car.brand);
    } 
}
