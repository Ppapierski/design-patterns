package creational.builder;

import java.util.ArrayList;
import java.util.List;

public class Plane {
    private String brand;
    private String name;
    private String serialNumber;
    private final int engineVolume;
    private final int numOfPassengers;
    private final List<String> listOfPassengers;

    private Plane(String brand,
                  String name,
                  String serialNumber,
                  int engineVolume,
                  int numOfPassengers, List<String> listOfPassengers) {
        this.brand = brand;
        this.name = name;
        this.serialNumber = serialNumber;
        this.engineVolume = engineVolume;
        this.numOfPassengers = numOfPassengers;
        this.listOfPassengers = listOfPassengers;
    }

    public static PlaneBuilder builder() {
        return new PlaneBuilder();
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public int getEngineVolume() {
        return engineVolume;
    }

    public int getNumOfPassengers() {
        return numOfPassengers;
    }

    public List<String> getListOfPassengers() {
        return new ArrayList<>(this.listOfPassengers);
    }

    private static class PlaneBuilder {

        // fields as in the base Plane class
        private String brand;
        private String name;
        private int engineVolume;
        private int numOfPassengers;
        private List<String> listOfPassengers;

        // should always be private
        private PlaneBuilder() {
        }

        public PlaneBuilder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public PlaneBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PlaneBuilder setEngineVolume(int engineVolume) {
            this.engineVolume = engineVolume;
            return this;
        }

        public PlaneBuilder setNumOfPassengers(int numOfPassengers) {
            this.numOfPassengers = numOfPassengers;
            return this;
        }

        public Plane build(String serialNumber) {
            if(serialNumber == null
                    || serialNumber.trim().isEmpty()){
                throw new IllegalArgumentException(
                        "You need to pass a value to serialNumber!!");
            }
            return new Plane(
                    this.brand,
                    this.name,
                    serialNumber,
                    this.engineVolume,
                    this.numOfPassengers,
                    listOfPassengers);
        }
    }

    public static void main(String[] args) {
        Plane plane = Plane.builder()
                .build(null);

    }

}
