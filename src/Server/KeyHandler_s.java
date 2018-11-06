package Server;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler_s implements KeyListener {
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_ENTER){
            String text = vari_s.eingabe.getText();
            text.trim();
            System.out.println("Text ohne Zeilenumbruch:");
            System.out.println(text);

            if(!text.isBlank()){
                Server.send(text);
                vari_s.eingabe.setText("");
            }

        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
