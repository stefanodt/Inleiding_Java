package h8;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H8Opdracht1 extends Applet {
    TextField tekstvak;
    Button knop, knop2;
    String s;

    public void init() {
        tekstvak = new TextField("", 20);
        add(tekstvak);
        tekstvak.addActionListener( new TekstvakListener() );


        knop = new Button("Ok");
        knop2 = new Button("Reset");
        KnopListener kl = new KnopListener();
        TekstvakListener fd = new TekstvakListener();
        knop2.addActionListener(kl);
        knop.addActionListener(fd);
        add(knop);
        add(knop2);
        s = "";

    }

    public void paint(Graphics g) {
        if(s=="")
        g.drawString("type hier " + "en klik dan op Ok", 850, 60);
        else
        g.drawString(s,850,60);
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("");

        }
    }
    class TekstvakListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            repaint();
        }
    }
}

