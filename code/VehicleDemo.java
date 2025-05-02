class Vehicle {
    String brand;
    int speed;

    Vehicle(String brand) {
        this.brand = brand;
        this.speed = 0;
    }

    void accelerate() {
        speed += 10;
        System.out.println(brand + " accelerated to " + speed + " km/h");
    }

    void brake() {
        speed = Math.max(speed - 10, 0);
        System.out.println(brand + " slowed down to " + speed + " km/h");
    }
}

class Car extends Vehicle {
    int numOfDoors;

    Car(String brand, int numOfDoors) {
        super(brand);
        this.numOfDoors = numOfDoors;
    }
}

class Bike extends Vehicle {
    boolean hasCarrier;

    Bike(String brand, boolean hasCarrier) {
        super(brand);
        this.hasCarrier = hasCarrier;
    }

    @Override
    void accelerate() {
        speed += 5;
        System.out.println(brand + " (bike) accelerated to " + speed + " km/h");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 4);
        Bike bike = new Bike("Yamaha", true);

        car.accelerate();  // Toyota accelerated to 10
        car.brake();       // Toyota slowed down to 0
        bike.accelerate(); // Yamaha (bike) accelerated to 5
        bike.brake();      // Yamaha slowed down to 0
    }
}

