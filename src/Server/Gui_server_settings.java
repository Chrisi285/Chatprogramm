package Server;

import javax.swing.*;
import javax.swing.border.Border;
import java.net.Inet4Address;
import java.net.InetAddress;

public class Gui_server_settings {
    public Gui_server_settings() {

        //Einstellungsfenster Server
        vari_s.jf_server_settings = new JFrame("Server - Settings");
        vari_s.jf_server_settings.setSize(350, 250);
        vari_s.jf_server_settings.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        vari_s.jf_server_settings.setResizable(false);
        vari_s.jf_server_settings.setLocationRelativeTo(null);
        vari_s.jf_server_settings.requestFocus();
        vari_s.jf_server_settings.setLayout(null);

        //IP Adresse des eigenen PC`s (Server) ermitteln
        try {
            vari_s.address = InetAddress.getLocalHost().getHostAddress();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //IP Adressen Label
        vari_s.ipadress = new JLabel("IP - Adresse: " + vari_s.address);
        vari_s.ipadress.setBounds(10, 50, 300, 25);
        vari_s.ipadress.setVisible(true);

        //Name Label
        vari_s.name = new JLabel("Name: ");
        vari_s.name.setBounds(10,20,80,20);
        vari_s.name.setVisible(true);

        //Name Textfeld
        vari_s.name_eingabe = new JTextField();
        vari_s.name_eingabe.setBounds(85,20,200,20);
        vari_s.name_eingabe.setVisible(true);

        //Port Label

        vari_s.port = new JLabel("Port:");
        vari_s.port.setBounds(10,80,50,20);
        vari_s.port.setVisible(true);

        //Port Eingabe

        vari_s.port_eingabe = new JTextField("8001");
        vari_s.port_eingabe.setBounds(85,80,100,20);
        vari_s.port_eingabe.setVisible(true);
        //Button Los
        vari_s.go = new JButton("Los!");
        vari_s.go.setBounds(130,140,80,40);
        vari_s.go.setVisible(true);
        vari_s.go.addActionListener(new ActionListener_s());


        vari_s.jf_server_settings.add(vari_s.ipadress);
        vari_s.jf_server_settings.add(vari_s.name);
        vari_s.jf_server_settings.add(vari_s.name_eingabe);
        vari_s.jf_server_settings.add(vari_s.go);
        vari_s.jf_server_settings.add(vari_s.port);
        vari_s.jf_server_settings.add(vari_s.port_eingabe);
        vari_s.jf_server_settings.setVisible(true);


    }
}
