package Packages;

import com.automobile.fourwheeler.Logan;
import com.automobile.fourwheeler.Ford;

public class HandsOnAssignment4 {

    public static void main(String[] args) {

        Logan l = new Logan();

        System.out.println("Logan Details");
        System.out.println(l.getModelName());
        System.out.println(l.getRegistrationNumber());
        System.out.println(l.getOwnerName());
        System.out.println("Speed : " + l.speed());
        l.gps();

        System.out.println();

        Ford f = new Ford();

        System.out.println("Ford Details");
        System.out.println(f.getModelName());
        System.out.println(f.getRegistrationNumber());
        System.out.println(f.getOwnerName());
        System.out.println("Speed : " + f.speed());
        System.out.println("Temperature : " + f.tempControl());
    }
}