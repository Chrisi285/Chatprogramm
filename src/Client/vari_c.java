package Client;

import javax.swing.*;

public class vari_c {

    static JFrame jf_client;
    static JFrame jf_client_settings;
    static JTextArea textfield;
    static JTextArea eingabe;
    static JLabel chatbox;
    static JLabel writebox;
    static JButton send;
    static JLabel name;
    static JTextField name_eingabe;
    static JLabel ip_adress;
    static JTextField ip_adress_eingabe;
    static JButton begin;
    static JLabel port;
    static JTextField port_eingabe;
    static String clientname;
    static JScrollPane scroll;



    public static String format (String msg){
        boolean format_s = true;

        StringBuffer formatted = new StringBuffer(msg);
        while(format_s){
        if(formatted.charAt(1)=='\n'){
            formatted.deleteCharAt(1);
        }
        format_s = false;
        }
        System.out.println(formatted);
            return formatted.toString();


    }
}
