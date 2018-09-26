package h8;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H8PraktijkOpdracht extends Applet {
    float uitkomst;
    TextField tekstvak;
    TextField tekstvak2;
    Button knop;
    Button knop2;
    Button knop3;
    Button knop4;

    public void init() {
        tekstvak = new TextField("", 20);
        tekstvak.addActionListener(new KnopListener());
        tekstvak2 = new TextField("", 20);
        tekstvak2.addActionListener(new KnopListener());
        add(tekstvak);
        add(tekstvak2);


        knop = new Button("+");
        KnopListener kl = new KnopListener();
        knop.addActionListener(kl);

        knop2 = new Button("-");
        Knop2Listener fd = new Knop2Listener();
        knop2.addActionListener(fd);

        knop3 = new Button("*");
        Knop3Listener er = new Knop3Listener();
        knop3.addActionListener(er);

        knop4 = new Button("/");
        Knop4Listener sd = new Knop4Listener();
        knop4.addActionListener(sd);


        add(knop);
        add(knop2);
        add(knop3);
        add(knop4);


    }

    public void paint(Graphics g) {
        g.drawString("uitkomst" + uitkomst, 100, 50);


    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            float input1 = Float.parseFloat(tekstvak.getText());
            float input2 = Float.parseFloat(tekstvak2.getText());
            uitkomst = input1 + input2;
            repaint();
        }
    }


    class Knop2Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            float input3 = Float.parseFloat(tekstvak.getText());
            float input4 = Float.parseFloat(tekstvak2.getText());
            uitkomst = input3 - input4;
            repaint();

        }
    }

    class Knop3Listener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            float input5 = Float.parseFloat(tekstvak.getText());
            float input6 = Float.parseFloat(tekstvak2.getText());
            uitkomst = input5 * input6;
            repaint();
        }
    }

    class Knop4Listener implements ActionListener{
        public void actionPerformed (ActionEvent e){
            float input7 = Float.parseFloat(tekstvak.getText());
            float input8 = Float.parseFloat(tekstvak2.getText());
            uitkomst = input7 / input8;
            repaint();
        }
    }



    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

        }
    }

        }





