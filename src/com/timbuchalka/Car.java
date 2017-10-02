package com.timbuchalka;

/**
 * Created by KH389659 on 02/10/2017.
 */
public class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;




    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int accelerate() {
        int horsePowers = (int) (Math.random() *10000) + 1;
        return horsePowers;
    }

    public String description() {

        return "Have no Description";
    }

    public String brakeSystem() {

        return "Have no Brake System";
    }
}
