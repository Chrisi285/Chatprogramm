package Client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Date;
import java.util.Scanner;

public class Client {

    private InetSocketAddress address;
    static PrintWriter pw;
    static Socket socket = new Socket();

    public Client(String hostname, int port) {

        address = new InetSocketAddress(hostname, port);
        try {
            vari_c.textfield.append("[Client] Verbinde zu Server\n");
            socket.connect(address, 5000);
            vari_c.textfield.append("[Client] Zu Server verbunden\n");
            receive();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void sendmessage(String msg) {
        try {
            Date date = new Date();
            String date_s = date.toString();
            PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
            pw.println("[" + vari_c.clientname + "]: " + msg);
            vari_c.textfield.append("["+date_s+"]  [" + vari_c.clientname + "]: " + msg + "\n  \n");
            pw.flush();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void receive() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Date date = new Date();
                    String date_s = date.toString();
                    Scanner s = new Scanner(new BufferedReader(new InputStreamReader(socket.getInputStream())));
                    if (s.hasNextLine()) {

                        vari_c.textfield.append("[" + date_s + "]  " + s.nextLine() + "\n \n");
                        receive();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
