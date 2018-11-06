package Server;

import javax.swing.*;
import java.awt.*;

public class Gui_s {
    public Gui_s() {
        //Chatfenster Server
        vari_s.jf_server = new JFrame("Chat - Server");
        vari_s.jf_server.setSize(800, 600);
        vari_s.jf_server.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        vari_s.jf_server.setLayout(null);
        vari_s.jf_server.setResizable(false);
        vari_s.jf_server.setLocationRelativeTo(null);
        vari_s.jf_server.requestFocus();

        //Textfeld
        vari_s.textfield = new JTextArea();
        vari_s.scroll = new JScrollPane(vari_s.textfield,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        vari_s.scroll.setBounds(50, 40, 700, 310);
        vari_s.scroll.setVisible(true);
        vari_s.textfield.setLineWrap(true);
        vari_s.textfield.setWrapStyleWord(true);
        vari_s.textfield.setEditable(false);

        //Eingabefeld
        vari_s.eingabe = new JTextArea();
        vari_s.eingabe.setBounds(50, 400, 700, 80);
        vari_s.eingabe.setVisible(true);
        vari_s.eingabe.setEditable(false);
        vari_s.eingabe.setLineWrap(true);
        vari_s.eingabe.setWrapStyleWord(true);
        vari_s.eingabe.addKeyListener(new KeyHandler_s());

        //JLabel Chatbox
        vari_s.chatbox = new JLabel("Chatverlauf");
        vari_s.chatbox.setBounds(50, 20, 80, 15);
        vari_s.chatbox.setVisible(true);


        //JLabel Eingabe
        vari_s.writebox = new JLabel("Eingabebox");
        vari_s.writebox.setBounds(50, 380, 80, 15);
        vari_s.writebox.setVisible(true);


        //Button senden
        vari_s.send = new JButton("Send!");
        vari_s.send.setBounds(670, 490, 80, 25);
        vari_s.send.setVisible(true);
        vari_s.send.addActionListener(new ActionListener_s());
        vari_s.send.enableInputMethods(false);

        vari_s.jf_server.add(vari_s.scroll);
        vari_s.jf_server.add(vari_s.eingabe);
        vari_s.jf_server.add(vari_s.chatbox);
        vari_s.jf_server.add(vari_s.writebox);
        vari_s.jf_server.add(vari_s.send);
        vari_s.jf_server.addKeyListener(new KeyHandler_s());
        vari_s.jf_server.setVisible(true);
    }
}
