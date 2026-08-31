package Practicum;

abstract class Vehicle {
    String vehicleNumber;
    String brand;

    Vehicle(String vehicleNumber, String brand) {
          this.vehicleNumber = vehicleNumber;
          this.brand = brand; 
    }
    abstract void startEngine();

    final void showVehicleIdentity(String vehicleNumber, String brand) {
        if (vehicleNumber == null || vehicleNumber.isEmpty()) {
             System.out.println("Invalid Vehicle Number");
        }
        else {
             System.out.println("Vehicle Number: " + vehicleNumber);
        }
        if (brand == null || brand.isEmpty()) {
             System.out.println("Empty Brand Name");
        }
        else {
            System.out.println("Brand: " + brand);
        }
    }
}
class Car extends Vehicle {
    Car(String vehicleNumber, String brand) {
        super(vehicleNumber, brand);
    }
    void startEngine() {
        System.out.println("Car engine starting process.");
    }
}
class Bike extends Vehicle {
    Bike(String vehicleNumber, String brand) {
        super(vehicleNumber, brand);
    }
    void startEngine() {
        System.out.println("Bike engine starting process.");
    }
}
class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("KA-01-AB-1234", "Toyota");
        car.showVehicleIdentity(car.vehicleNumber, car.brand); System.out.println();

        Vehicle bike = new Bike("KA-02-CD-5678", "Honda");
        bike.showVehicleIdentity(bike.vehicleNumber, bike.brand); System.out.println();

        car.startEngine();
        bike.startEngine(); System.out.println();

        car.showVehicleIdentity(car.vehicleNumber, car.brand);
        bike.showVehicleIdentity(bike.vehicleNumber, bike.brand); System.out.println();

        car.showVehicleIdentity("KA-09-CD-9876", "Hyundai"); System.out.println();

        // Vehicle v = new Vehicle(...); Cannot be instantiated as Vehicle is an abstract class
        // Car class without startEngine(), Compilation error: Car must implement the abstract method startEngine()
        // Attempt to override the final method, Compilation error: Cannot override the final method showVehicleIdentity()

        bike.showVehicleIdentity("", "");
    }
}