package structural.decorator;

public class PimpedCar implements RacingCar {
    NotSoFastCar car;
    boolean isNitroOn;

    public PimpedCar(NotSoFastCar car) {
        this.car = car;
    }

    public void turnNitroOn() {
        this.isNitroOn = true;
    }

    public void turnNitroOff() {
        this.isNitroOn = false;
    }

    @Override
    public int getMaxSpeed() {
        return isNitroOn ? car.getMaxSpeed() + 200 : car.getMaxSpeed() + 70;
    }

    @Override
    public void race() {
        System.out.println(
                isNitroOn ? "TOOO FAAAAAST" : "YEEEAH"
        );
    }
}
