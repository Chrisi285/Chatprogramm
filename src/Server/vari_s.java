package Server;

import javax.swing.*;
import java.awt.*;

public class vari_s {
    static JFrame jf_server;
    static JFrame jf_server_settings;
    static JTextArea textfield;
    static JTextArea eingabe;
    static JLabel chatbox;
    static JLabel writebox;
    static JButton send;
    static JLabel ipadress;
    static String address;
    static JLabel name;
    static JTextField name_eingabe;
    static JButton go;
    static JLabel port;
    static JTextField port_eingabe;
    static String servername;
    static JScrollPane scroll;


    public static String format (String msg){
        boolean format_s = true;


        StringBuffer formatted = new StringBuffer(msg);
        while(format_s){
            if(formatted.charAt(0)=='\n'){
                formatted.deleteCharAt(0);

            }
            format_s = false;
        }
        return formatted.toString();
    }

}
