package structural.adapter;

public class ToEuAdapter implements Socket{

    Socket socket;

    public ToEuAdapter(Socket socket) {
        this.socket = socket;
    }

    @Override
    public Voltage getVoltage() {
        return Voltage.EU_230;
    }
}
