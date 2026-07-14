package MethodReference;

public class HandsOnAssignment3 {

    public static void main(String[] args) {

        PrimeChecker pc = PrimeCheck::new;

        pc.check(17);
        pc.check(20);
    }
}