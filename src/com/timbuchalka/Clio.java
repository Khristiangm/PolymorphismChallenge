package com.timbuchalka;

/**
 * Created by KH389659 on 02/10/2017.
 */
public class Clio extends Car {

    public Clio() {

        super("Clio", 2);
    }

    @Override
    public String description() {
        return "This is a Piece of Shit";
    }

    @Override
    public String brakeSystem() {
        return "You can stop the car with yout tongue";
    }



}
