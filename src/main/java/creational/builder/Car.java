package creational.builder;


import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@ToString
@Getter
public class Car {
    private String brand;
    private String name;
    private String VIN;
    private int numOfPlaces;
    private int  engineVolume;
    private String numValves;
}
