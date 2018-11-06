package Client;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler_c implements KeyListener {


    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            String text = vari_c.eingabe.getText();
            text.trim();
            System.out.println("Text ohne Zeilenumbruch:");
            System.out.println(text);

            if(!text.isBlank()){
                Client.sendmessage(text);
                vari_c.eingabe.setText("");
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
