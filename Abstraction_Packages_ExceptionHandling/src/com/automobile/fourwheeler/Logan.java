package com.automobile.fourwheeler;

import com.automobile.Vehicle;

public class Logan extends Vehicle {

    public String getModelName() {
        return "Logan";
    }

    public String getRegistrationNumber() {
        return "AP01AA1111";
    }

    public String getOwnerName() {
        return "Rupa";
    }

    public int speed() {
        return 100;
    }

    public void gps() {
        System.out.println("GPS Facility Available");
    }
}