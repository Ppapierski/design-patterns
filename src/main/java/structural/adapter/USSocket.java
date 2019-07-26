package structural.adapter;

public class USSocket implements Socket {

    private  Voltage voltage = Voltage.US_110;

    public  Voltage getVoltage() {
        return voltage;
    }
}
