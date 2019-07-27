package creational.factory;

import creational.builder.Ship;

import java.util.List;

public class ShipFactory {

    Ship getShip(){
        return Ship.builder()
                .brand("brand")
                .name("TITANIC")
                .engineVolume(50000)
                .build();
    }

    Ship getBigShip(int numOfPassengers){
        return Ship.builder()
                .brand("brand")
                .name("TITANIC")
                .engineVolume(50000)
                .numOfPassengers(numOfPassengers)
                .build();
    }

    public static void main(String[] args) {
        List.of(1,2,3,4,5);
    }
}
