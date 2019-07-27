package creational.builder;

public class Truck {

    private String brand;
    private String name;
    private String VIN;
    private int numOfPlaces;
    private int  engineVolume;
    private String numValves;


    public static final class TruckBuilder {
        private String brand;
        private String name;
        private String VIN;
        private int numOfPlaces;
        private int  engineVolume;
        private String numValves;

        private TruckBuilder() {
        }

        public static TruckBuilder aTruck() {
            return new TruckBuilder();
        }

        public TruckBuilder withBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public TruckBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public TruckBuilder withVIN(String VIN) {
            this.VIN = VIN;
            return this;
        }

        public TruckBuilder withNumOfPlaces(int numOfPlaces) {
            this.numOfPlaces = numOfPlaces;
            return this;
        }

        public TruckBuilder withEngineVolume(int engineVolume) {
            this.engineVolume = engineVolume;
            return this;
        }

        public TruckBuilder withNumValves(String numValves) {
            this.numValves = numValves;
            return this;
        }

        public TruckBuilder but() {
            return aTruck().withBrand(brand).withName(name).withVIN(VIN).withNumOfPlaces(numOfPlaces).withEngineVolume(engineVolume).withNumValves(numValves);
        }

        public Truck build() {
            Truck truck = new Truck();
            truck.VIN = this.VIN;
            truck.name = this.name;
            truck.brand = this.brand;
            truck.numOfPlaces = this.numOfPlaces;
            truck.engineVolume = this.engineVolume;
            truck.numValves = this.numValves;
            return truck;
        }
    }
}
