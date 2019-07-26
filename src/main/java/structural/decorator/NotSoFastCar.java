package structural.decorator;

public class NotSoFastCar implements RacingCar{
    @Override
    public int getMaxSpeed() {
        return 50;
    }

    @Override
    public void race() {
        System.out.println("Going as fast as i can... At least it's safe. ");
    }
}
