package Server;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.util.Scanner;

public class Server {

    private int port;
    static PrintWriter pw_s;
    static Socket remoteClient;

    public Server(int port){
        this.port = port;

    }

    public void startListening(){
        new Thread(new Runnable() {
            @Override
            public void run() {

                    try {

                        vari_s.textfield.append("[Server]: Server startet...\n");
                        ServerSocket serverSocket = new ServerSocket(port);
                        vari_s.textfield.append("[Server] Warten auf Verbindung...\n");
                        remoteClient = serverSocket.accept();
                        System.out.println("Client verbunden");
                        // empfangen(remoteClient);
                        vari_s.textfield.append("[Server] Client verbunden: " + remoteClient.getRemoteSocketAddress() + "\n");

                        vari_s.jf_server.repaint();
                        empfangen(remoteClient);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

            }
        }).start();
    }

    public  void empfangen(Socket remoteClient){
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Date date = new Date();
                    String date_s = date.toString();
                    Scanner s = new Scanner(new BufferedReader(new InputStreamReader(remoteClient.getInputStream())));
                    if (s.hasNextLine()) {
                        vari_s.textfield.append("[" + date_s + "]  " + s.nextLine() + " \n \n");
                        empfangen(remoteClient);
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }).start();

    }

    public static void send(String msg){
        new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    Date date = new Date();
                    String date_s = date.toString();
                    System.out.println("Methode gestartet");
                    pw_s = new PrintWriter(new OutputStreamWriter(remoteClient.getOutputStream()));
                    pw_s.println("[" + vari_s.servername + "]: " + msg);
                    pw_s.flush();
                    vari_s.textfield.append("[" + date_s + "]  [" + vari_s.servername+"]: " + msg +"\n \n");

                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }).start();

    }
}
