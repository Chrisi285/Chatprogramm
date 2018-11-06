package Client;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListener_c implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vari_c.send) {
            String text = vari_c.eingabe.getText();
            text.trim();
            System.out.println("Text ohne Zeilenumbruch:");
            System.out.println(text);

            if(!text.isBlank()){
                Client.sendmessage(text);
                vari_c.eingabe.setText("");
            }

        } else if (e.getSource() == vari_c.begin) {
            if (!vari_c.name_eingabe.getText().isEmpty() && !vari_c.port_eingabe.getText().isEmpty()) {
                String port_string = vari_c.port_eingabe.getText();
                vari_c.clientname = vari_c.name_eingabe.getText();
                vari_c.eingabe.setEditable(true);
                vari_c.send.enableInputMethods(true);
                int port = Integer.parseInt(port_string);
                vari_c.jf_client_settings.setVisible(false);
                Client client = new Client(vari_c.ip_adress_eingabe.getText(), port);
            } else {
                JOptionPane.showMessageDialog(null, "Bitte alle Felder ausfüllen!", "Fehler!", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}
