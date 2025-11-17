// Abstract class
abstract class Car {
    String brand = "Toyota";

    abstract void startEngine();
    abstract void stopEngine();

    void showBrand() {
        System.out.println("Car Brand: " + brand);
    }
    abstract void gasCapacity();
    abstract void transMission();
}

// Subclass Toyota Vios
class ToyotaVios extends Car {

    @Override
    void startEngine() {
        System.out.println("Toyota Vios engine started using push button.");
    }

    @Override
    void stopEngine() {
        System.out.println("Toyota Vios engine stopped using break.");
    }

    void showModel() {
        System.out.println("Model: Toyota Vios 2024");
    }
    
    void gasCapacity() {
        System.out.println("Gas Capacity: 10.6 gallons");
    }
    void transMission() {
        System.out.println("Transmission: Automatic Transmission");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Car myCar = new ToyotaVios();   // Abstraction + Polymorphism

        myCar.showBrand();
        myCar.startEngine();
        myCar.stopEngine();
        myCar.gasCapacity();
        myCar.transMission();

        // To access showModel(), cast to ToyotaVios
        ((ToyotaVios) myCar).showModel();
    }
}
