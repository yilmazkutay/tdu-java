package OOP.privateoop;

public class Car {
   
    private String brand;
    private String color;
    private int wheel;
    private int door;

    public void setBrand (String brand) {

        this.brand = brand; // if the names are same then we should use "this.".
    }

    public String getBrand () {

        return this.brand;
    }
}
