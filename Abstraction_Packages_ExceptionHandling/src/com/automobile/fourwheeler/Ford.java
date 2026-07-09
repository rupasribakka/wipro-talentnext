package com.automobile.fourwheeler;

import com.automobile.Vehicle;

public class Ford extends Vehicle {

    public String getModelName() {
        return "Ford";
    }

    public String getRegistrationNumber() {
        return "AP01BB2222";
    }

    public String getOwnerName() {
        return "Sri";
    }

    public int speed() {
        return 120;
    }

    public int tempControl() {
        return 22;
    }
}