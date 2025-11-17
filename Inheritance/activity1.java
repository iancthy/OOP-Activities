class Vehicle {
    String brand;

    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {
    String model;
    String transmission;
    String engine;
    String gas;

    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Transmission: " + transmission);
        System.out.println("Engine: " + engine);
        System.out.println("Gas Capacity: " + gas);
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.brand = "Toyota";
        myCar.model = "Vios 2025";
        myCar.transmission = "Continuously Variable Transmission (CVT)";
        myCar.engine = "1.5L 4-cylinder engine";
        myCar.gas = "40L";
        
        myCar.start();
        myCar.displayInfo();
    }
}
