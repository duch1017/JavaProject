package com.itheima_03;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(12345);

        while (true) {
            byte[] bys = new byte[1024];
            DatagramPacket dp = new DatagramPacket(bys, bys.length);

            ds.receive(dp);

            String data = new String(dp.getData(), 0, dp.getLength());
            if ("886".equals(data)) {
                System.out.println("数据是：" + data);
                break;
            }
            System.out.println("数据是：" + data);
        }
        ds.close();
    }
}
