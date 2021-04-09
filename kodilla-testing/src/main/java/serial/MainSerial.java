package serial;

public class MainSerial {
    public static void main(String[] args){
        SerialImplementation serialImplementation = new SerialImplementation();
        serialImplementation.getCommPorts();
        serialImplementation.addListener();
        serialImplementation.writeSerialPort();
    }
}
