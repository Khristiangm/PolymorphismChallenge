package com.timbuchalka;

public class Main {

    public static Car randomCar() {
        int randomNumber = (int) (Math.random() * 3) + 1;
        if (randomNumber == 1) {
            return new Jetta();
        } else if (randomNumber == 2) {
            return new Clio();
        } else if (randomNumber == 3) {
            return new SpaceFox();
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            Car car = randomCar();
            System.out.println("Car#" + i + ":" + car.getName() + "\n" +
                    "Accelerate: " + car.accelerate() + "\n" +
                    "Break System: " + car.brakeSystem() + "\n" +
                    "Description: " + car.description());
            System.out.println("------------------------------------------------------------------");
        }
    }
}
