package InterfacesNewFeatures;

public interface FourWheeler {

    default void message() {
        System.out.println("Inside FourWheeler");
    }
}