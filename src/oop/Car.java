package oop;

public class Car {
    int maxSpeed;
    int currentSpeed;
    String color;
    int currentGear;
    Person owner;
    String model;
    int price;
    boolean isSportCar;

    public Car() {
    }

    public Car(String color, String model, boolean isSportCar) {
        this.color = color;
        this.model = model;
        this.isSportCar = isSportCar;
    }

    double calculatedCarPriceForScrap(double metalPrice) {
        double coefficient = 0.2;

        if (this.color.equals("white") || this.color.equals("black")) {
            coefficient += 0.05;
        }
        if (isSportCar) {
            coefficient += 0.05;
        }
        return coefficient * metalPrice;
    }

    boolean isMoreExpensiveThen(Car car) {
        return car.price < this.price;
    }

    void accelerate() {
        currentSpeed = currentSpeed + 5;
        System.out.println("Current speed is " + currentSpeed);
    }

    void gearCheck(int gear) {
        if (gear < 1 || gear > 5) {
            System.out.println("Gear cannot be changed!");
        }
    }
    void changeGearUp() {
        if (currentGear < 5) {
            currentGear ++;
            System.out.println("Current gear is " + currentGear);
        } else {
            System.out.println("Gear cannot be changed!");
        }
    }

    void changeGearDown() {
        if (currentGear > 2) {
            currentGear --;
            System.out.println("Current gear is " + currentGear);
        } else {
            System.out.println("Gear cannot be changed!");
        }
    }

    void changeGear(int nextGear) {
        currentGear = nextGear;
        System.out.println("Current gear is " + currentGear);
    }

    void changeColor(String newColor) {
        color = newColor;
    }

    @Override
    public String toString() {
        return "Car{" +
                "maxSpeed=" + maxSpeed +
                ", currentSpeed=" + currentSpeed +
                ", color='" + color + '\'' +
                ", currentGear=" + currentGear +
                ", owner=" + owner +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", isSportCar=" + isSportCar +
                '}';
    }
}
