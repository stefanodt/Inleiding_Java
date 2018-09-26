package h01;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;



public class H8 extends Applet {
    Button button;
    String Message;

    public void init(){
        Message = "Free Skin?";
        button = new Button();
        button.setLabel("CLICK ME FOR FREE SKIN");
        ButtonListener kl = new ButtonListener();
        button.addActionListener(kl);
        add(button);
    }

    public void paint(Graphics g){
        g.drawString (Message,50,60);
    }
    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Message = "Deze knop dit helemaal geen ene kut";
            repaint();


        }
      }
    }
