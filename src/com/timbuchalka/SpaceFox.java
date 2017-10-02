package com.timbuchalka;

/**
 * Created by KH389659 on 02/10/2017.
 */
public class SpaceFox extends Car {

    public SpaceFox() {
        super("SpaceFox", 4);
    }

    @Override
    public String description() {
        return "This car it's a Amazing Car";
    }

    @Override
    public String brakeSystem() {
        return "ABS system";
    }



}
