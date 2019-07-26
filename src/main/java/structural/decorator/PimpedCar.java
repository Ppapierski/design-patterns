package structural.decorator;

public class PimpedCar implements RacingCar{
 NotSoFastCar car;

    public PimpedCar(NotSoFastCar car) {
        this.car = car;
    }

    // todo implement and make it go FASTER!
    @Override
    public int getMaxSpeed() {
        return 0;
    }

    // todo implement and make it go FASTER!
    @Override
    public void race() {

    }
}
