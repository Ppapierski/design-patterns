package structural.adapter;

public class PhoneCharger implements PowePlug {
    private Voltage voltage = Voltage.EU_230;

    @Override
    public void supply(Socket socket) {
        if (!socket.getVoltage().equals(this.voltage)) {
            throw new IllegalArgumentException(
                    "Wrong Voltage! The Charger may explode!");
        }
        System.out.println("The phone can be charged now!");
    }
}
