package com.timbuchalka;

/**
 * Created by KH389659 on 02/10/2017.
 */
public class Jetta extends Car {

    public Jetta() {
        super("Jetta", 5);
    }

    @Override
    public String description() {
        return "It's a Nice Car, 4 doors and have so much Powers Horse";
    }

    @Override
    public String brakeSystem() {
        return "ABS System Very Powerfull and Board Computer";
    }




}
