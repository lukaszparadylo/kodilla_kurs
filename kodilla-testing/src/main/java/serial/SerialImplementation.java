package serial;
import com.fazecast.jSerialComm.*;

import java.util.Arrays;

public class SerialImplementation {

    private SerialPort userPort;

    public void getCommPorts() {
        System.out.println(SerialPort.getVersion());
        for (SerialPort i : SerialPort.getCommPorts()) {
            //System.out.println(i.getDescriptivePortName());
        }
         userPort = SerialPort.getCommPort("COM19");
        userPort.openPort();

        if (userPort.isOpen()) {
            System.out.println("Port initialized!");
            //timeout not needed for event based reading
            //userPort.setComPortTimeouts(SerialPort.TIMEOUT_READ_SEMI_BLOCKING, 100, 0);
        } else {
            System.out.println("Port not available");
            return;
        }
    }

    public void addListener(){
        userPort.addDataListener(new SerialPortDataListener() {
            @Override
            public int getListeningEvents() {
                return SerialPort.LISTENING_EVENT_DATA_AVAILABLE;
            }

            public void serialEvent(SerialPortEvent event) {
                if (event.getEventType() != SerialPort.LISTENING_EVENT_DATA_AVAILABLE)
                    return;
                byte[] newData = new byte[userPort.bytesAvailable()];
                int numRead = userPort.readBytes(newData, newData.length);
                String s = new String(newData);
                System.out.println("Respond " + s);
            }
        });
    }

    public void writeSerialPort(){
        byte[] data = new byte[]{'1'};
        System.out.println("Write " + new String(data));
        userPort.writeBytes(data,data.length);
    }
}

