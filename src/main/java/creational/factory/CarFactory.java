package creational.factory;

import creational.builder.Car;

import java.util.List;

public class CarFactory {

    public Car getCar(){
        return Car.builder()
                .brand("Volvo")
                .name("V60")
                .numValves("16")
                .engineVolume(2000)
                .build();
    }
}
