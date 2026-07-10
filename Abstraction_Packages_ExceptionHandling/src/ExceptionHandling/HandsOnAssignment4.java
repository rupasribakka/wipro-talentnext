package ExceptionHandling;

class InvalidCountryException extends Exception {

    public InvalidCountryException() {
        super();
    }

    public InvalidCountryException(String message) {
        super(message);
    }
}

public class HandsOnAssignment4 {

    public void registerUser(String userName, String userCountry)
            throws InvalidCountryException {

        if (!userCountry.equalsIgnoreCase("India")) {
            throw new InvalidCountryException(
                    "User Outside India cannot be registered");
        }

        System.out.println("User registration done successfully");
    }

    public static void main(String[] args) {

        HandsOnAssignment4 user = new HandsOnAssignment4();

        try {
            user.registerUser("Mickey", "US");
        }
        catch (InvalidCountryException e) {
            System.out.println(e.getMessage());
        }

        try {
            user.registerUser("Mini", "India");
        }
        catch (InvalidCountryException e) {
            System.out.println(e.getMessage());
        }
    }
}