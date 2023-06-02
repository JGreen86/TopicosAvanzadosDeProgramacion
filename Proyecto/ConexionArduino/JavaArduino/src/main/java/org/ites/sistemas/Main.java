package org.ites.sistemas;

import com.fazecast.jSerialComm.*;

public class Main {
    public static void main(String[] args) {
        //SerialPort comPort = SerialPort.getCommPort("COM4");
        SerialPort comPort = SerialPort.getCommPorts()[0];
        if (!comPort.isOpen())
            comPort.openPort();
        comPort.addDataListener(new SerialPortMessageListener() {
            @Override
            public byte[] getMessageDelimiter() {
                return new byte[] { (byte)0x3A, (byte) 0x3D};
            }

            @Override
            public boolean delimiterIndicatesEndOfMessage() {
                return true;
            }

            @Override
            public int getListeningEvents() {
                return SerialPort.LISTENING_EVENT_DATA_RECEIVED;
            }

            @Override
            public void serialEvent(SerialPortEvent event) {
                byte[] data = event.getReceivedData();
                String dataString = new String(data);
                System.out.println(dataString);
            }
        });
        try {
            Thread.sleep(60000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        comPort.removeDataListener();
        comPort.closePort();
    }
}