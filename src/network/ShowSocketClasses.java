package network;

import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class ShowSocketClasses {
    public static void main(String[] args) throws UnknownHostException {
        ServerSocket ss = null;
        Socket s;
        InetAddress address = InetAddress.getByName("www.geekband.com");
        System.out.println(address);
    }
}
