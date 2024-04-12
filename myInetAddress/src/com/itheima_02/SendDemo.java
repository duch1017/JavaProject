package com.itheima_02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();

        byte[] bys = "hello,udp我来了".getBytes();

//        int length = bys.length;
//        InetAddress address = InetAddress.getByName("192.168.100.10");
//        int port = 10086;
//        DatagramPacket dp = new DatagramPacket(bys, length, address, port);

        DatagramPacket dp = new DatagramPacket(bys, bys.length, InetAddress.getByName("duch"), 10086);

        ds.send(dp);

        ds.close();
    }
}
