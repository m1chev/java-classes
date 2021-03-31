package oop;

public class CarDemo {
    public static void main(String[] args) {
        Car bmw = new Car();
        bmw.color = "black";
        bmw.currentGear = 5;
        bmw.currentSpeed = 250;
        bmw.maxSpeed = 320;
        bmw.price = 20000;

        Car honda = new Car();
        honda.maxSpeed = 240;
        honda.currentSpeed = 0;
        honda.color = "purple";
        honda.currentGear = 3;
        honda.isSportCar = true;
        honda.price = 30000;

        Car peugeot = new Car("Purple","207cc", true);

        System.out.println(honda);

        for (int i = 0; i < 5; i++) {
            honda.accelerate();
        }

        honda.changeColor("black");
        honda.changeGearDown();
        System.out.println(peugeot);

        boolean result = honda.isMoreExpensiveThen(bmw);
        System.out.println(result);

        double scrapPrice = honda.calculatedCarPriceForScrap(20);
        System.out.println(scrapPrice);
    }

}
