package Server;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListener_s implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vari_s.send) {
            if(!vari_s.eingabe.getText().isBlank()){
                Server.send(vari_s.eingabe.getText());
                vari_s.eingabe.setText("");
            }

        } else if (e.getSource() == vari_s.go) {
            if (!vari_s.name_eingabe.getText().isEmpty() && !vari_s.port_eingabe.getText().isEmpty()) {
                String port_string = vari_s.port_eingabe.getText();
                vari_s.servername = vari_s.name_eingabe.getText();
                vari_s.eingabe.setEditable(true);
                vari_s.send.enableInputMethods(true);
                int port = Integer.parseInt(port_string);
                Server server = new Server(port);
                server.startListening();
                vari_s.jf_server_settings.setVisible(false);

            } else {
                JOptionPane.showMessageDialog(null, "Bitte alle Felder ausfüllen!", "InfoBox: Fehler!", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}
