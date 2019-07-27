package creational.builder;

public class BuilderTest {

    public static void main(String[] args) {
        Truck.TruckBuilder builder = Truck.TruckBuilder.aTruck()
                .withBrand("Volvo")
                .withName("XC4000")
                .withNumOfPlaces(4)
                .withEngineVolume(5000)
                .withNumValves("16");

        Truck truck = builder.but()
                .withBrand("VW")
                .withVIN("ljfns;kjgdb").build();
        builder.but().withVIN("JP1234567890-=09876543").build();


        Car car = Car.builder()
                .brand("TFDSY")
                .build();

        System.out.println(car);


        String string = "Hej";

        String string2 = string;

//        string = "ajaja";

        String string3 = new String("Hej");

        System.out.println(string == string2);
        System.out.println(string == string3);

        String string4 =
                "a" + "b" + "c";

        new StringBuilder("a").append("b").append("c").toString();

    }
}
