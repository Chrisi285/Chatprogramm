package Client;

import javax.swing.*;

public class Gui_client_settings {
    public Gui_client_settings() {

        vari_c.jf_client_settings = new JFrame("Chat - Clientsettings");
        vari_c.jf_client_settings.setSize(350, 210);
        vari_c.jf_client_settings.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        vari_c.jf_client_settings.setLayout(null);
        vari_c.jf_client_settings.setResizable(false);
        vari_c.jf_client_settings.setLocationRelativeTo(null);
        vari_c.jf_client_settings.requestFocus();
        vari_c.jf_client_settings.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);

        //JLabel Name
        vari_c.name = new JLabel("Name: ");
        vari_c.name.setBounds(10, 10, 70, 20);
        vari_c.name.setVisible(true);

        //JTextArea Name
        vari_c.name_eingabe = new JTextField();
        vari_c.name_eingabe.setBounds(100, 10, 200, 20);
        vari_c.name_eingabe.setVisible(true);

        //JLabel IP Adresse
        vari_c.ip_adress = new JLabel("<html><body>IP - Adresse <br> des Servers:</body></html>");
        vari_c.ip_adress.setBounds(10, 35, 90, 40);
        vari_c.ip_adress.setVisible(true);

        //JTextarea IP- Adresse
        vari_c.ip_adress_eingabe = new JTextField();
        vari_c.ip_adress_eingabe.setBounds(100, 52, 200, 20);
        vari_c.ip_adress_eingabe.setVisible(true);

        //JLabel Port:
        vari_c.port = new JLabel("Port:");
        vari_c.port.setBounds(10, 80, 90, 20);
        vari_c.port.setVisible(true);

        //JTextfield Port:
        vari_c.port_eingabe = new JTextField("8001");
        vari_c.port_eingabe.setBounds(100, 80, 200, 20);
        vari_c.port_eingabe.setVisible(true);

        //JButton Beginnen
        vari_c.begin = new JButton("Los!");
        vari_c.begin.setBounds(135, 115, 80, 40);
        vari_c.begin.setVisible(true);
        vari_c.begin.addActionListener(new ActionListener_c());

        //Hinzufügen zum Fenster
        vari_c.jf_client_settings.add(vari_c.name);
        vari_c.jf_client_settings.add(vari_c.name_eingabe);
        vari_c.jf_client_settings.add(vari_c.ip_adress);
        vari_c.jf_client_settings.add(vari_c.ip_adress_eingabe);
        vari_c.jf_client_settings.add(vari_c.begin);
        vari_c.jf_client_settings.add(vari_c.port);
        vari_c.jf_client_settings.add(vari_c.port_eingabe);
        vari_c.jf_client_settings.setVisible(true);
    }
}
