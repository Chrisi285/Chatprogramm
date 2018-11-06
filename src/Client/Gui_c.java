package Client;

import javax.swing.*;

public class Gui_c {
    public Gui_c(){
        vari_c.jf_client = new JFrame("Chat - Client");
        vari_c.jf_client.setSize(800, 600);
        vari_c.jf_client.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        vari_c.jf_client.setLayout(null);
        vari_c.jf_client.setResizable(false);
        vari_c.jf_client.setLocationRelativeTo(null);
        vari_c.jf_client.requestFocus();


        //Scrollpane


        //Textfeld
        vari_c.textfield = new JTextArea();
        vari_c.scroll = new JScrollPane(vari_c.textfield,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        vari_c.scroll.setBounds(50, 40, 700, 310);
        vari_c.scroll.createHorizontalScrollBar();
        vari_c.scroll.setVisible(true);
        vari_c.textfield.setLineWrap(true);
        vari_c.textfield.setWrapStyleWord(true);
        vari_c.textfield.setEditable(false);

        //Eingabefeld
        vari_c.eingabe = new JTextArea();
        vari_c.eingabe.setBounds(50,400,700,80);
        vari_c.eingabe.setVisible(true);
        vari_c.eingabe.setEditable(false);
        vari_c.eingabe.setLineWrap(true);
        vari_c.eingabe.setWrapStyleWord(true);
        vari_c.eingabe.addKeyListener(new KeyHandler_c());


        //JLabel Chatbox

        vari_c.chatbox = new JLabel("Chatverlauf");
        vari_c.chatbox.setBounds(50,20,80,15);
        vari_c.chatbox.setVisible(true);

        //JLabel Eingabe
        vari_c.writebox = new JLabel("Eingabebox");
        vari_c.writebox.setBounds(50,380,80,15);
        vari_c.writebox.setVisible(true);


        //Button senden
        vari_c.send = new JButton("Send!");
        vari_c.send.setBounds(670,490,80,25);
        vari_c.send.setVisible(true);
        vari_c.send.addActionListener(new ActionListener_c());
        vari_c.send.enableInputMethods(false);

        //Hinzufügen zum Fenster
        vari_c.jf_client.add(vari_c.scroll);
        //vari_c.jf_client.add(vari_c.textfield);
        vari_c.jf_client.add(vari_c.eingabe);
        vari_c.jf_client.add(vari_c.chatbox);
        vari_c.jf_client.add(vari_c.writebox);
        vari_c.jf_client.add(vari_c.send);

        vari_c.jf_client.setVisible(true);
    }
}
