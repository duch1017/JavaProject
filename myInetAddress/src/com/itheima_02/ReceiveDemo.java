package com.itheima_02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(10086);

        byte[] bys = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bys, bys.length);

        ds.receive(dp);

//        byte[] data = dp.getData();
//        int length = dp.getLength();
//        String dataString = new String(data, 0, length);
//        System.out.println("数据是：" + dataString);
        System.out.println("数据是：" + new String(dp.getData(), 0, dp.getLength()));

        ds.close();
    }
}
