package creational.builder;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class Ship {

    private String brand;
    private String name;
    private String serialNumber;
    private final int engineVolume;
    private final int numOfPassengers;
    private final List<String> listOfPassengers;
}
