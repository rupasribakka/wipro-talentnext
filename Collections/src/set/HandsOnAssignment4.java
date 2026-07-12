package set;

import java.util.TreeSet;

public class HandsOnAssignment4 {

    TreeSet<String> H1 = new TreeSet<>();

    public TreeSet<String> saveCountryNames(String countryName) {
        H1.add(countryName);
        return H1;
    }

    public String getCountry(String countryName) {

        for (String country : H1) {
            if (country.equals(countryName)) {
                return country;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        HandsOnAssignment4 obj = new HandsOnAssignment4();

        obj.saveCountryNames("India");
        obj.saveCountryNames("USA");
        obj.saveCountryNames("Japan");

        System.out.println(obj.getCountry("India"));
        System.out.println(obj.getCountry("China"));
    }
}