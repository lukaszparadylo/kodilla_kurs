package modBus;

import com.intelligt.modbus.jlibmodbus.*;
import com.intelligt.modbus.jlibmodbus.exception.ModbusIOException;
import com.intelligt.modbus.jlibmodbus.exception.ModbusNumberException;
import com.intelligt.modbus.jlibmodbus.exception.ModbusProtocolException;
import com.intelligt.modbus.jlibmodbus.master.ModbusMasterRTU;
import com.intelligt.modbus.jlibmodbus.serial.*;
import com.intelligt.modbus.jlibmodbus.utils.DataUtils;
import com.intelligt.modbus.jlibmodbus.utils.FrameEvent;
import com.intelligt.modbus.jlibmodbus.utils.FrameEventListener;
import serial.SerialImplementation;

public class BusMod {
    ModbusMaster m;
    byte[] tab3={1};
    FrameEvent frameEvent = new FrameEvent(tab3);
    public static void main(String[] args) throws ModbusIOException, ModbusProtocolException, SerialPortException, ModbusNumberException, InterruptedException {

        BusMod modbus = new BusMod();
        modbus.getCommPorts();
        modbus.modbusConfig();

    }

    SerialParameters sp= new SerialParameters();
    public void getCommPorts() {
        sp.setDevice("COM5");
        sp.setBaudRate(com.intelligt.modbus.jlibmodbus.serial.SerialPort.BaudRate.BAUD_RATE_115200);
        sp.setDataBits(8);
        sp.setParity(SerialPort.Parity.NONE);
        sp.setStopBits(0);

    }
    public void modbusConfig() throws SerialPortException, ModbusIOException, ModbusNumberException, ModbusProtocolException, InterruptedException {

        m = ModbusMasterFactory.createModbusMasterRTU(sp);
        m.connect();
        int[] tab = {0xFB5A};
        int[] tab2 = {0};
        listener.frameReceivedEvent(frameEvent);
        listener.frameSentEvent(frameEvent);
        while(true){
            m.writeMultipleRegisters(0x03,0x0A,tab);
            //tab2 = m.readHoldingRegisters(0x03,0x0A,1);
            //System.out.println(tab2[0]);
            Thread.sleep(1000);
        }
    }
    FrameEventListener listener = new FrameEventListener() {
        @Override
        public void frameSentEvent(FrameEvent event) {
            System.out.println("frame sent " + DataUtils.toAscii(event.getBytes()));
        }

        @Override
        public void frameReceivedEvent(FrameEvent event) {
            System.out.println("frame recv " + DataUtils.toAscii(event.getBytes()));
        }
    };
}

