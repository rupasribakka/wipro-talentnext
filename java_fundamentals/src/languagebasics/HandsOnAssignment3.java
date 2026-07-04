package languagebasics;

public class HandsOnAssignment3 {

    public static void main(String[] args) {

        int firstNumber = Integer.parseInt(args[0]);
        int secondNumber = Integer.parseInt(args[1]);

        int total = firstNumber + secondNumber;

        System.out.println("The sum of " + firstNumber + " and " + secondNumber + " is " + total);
    }
}