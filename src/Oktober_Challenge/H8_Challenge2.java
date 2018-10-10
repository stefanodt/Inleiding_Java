package Oktober_Challenge;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class H8_Challenge2 extends Applet {

    double omzet;
    double order;

    Button Bier;
    Button Fris;
    Button Wijn;
    Button koffie;
    Button binn_gedist;
    Button buit_gedist;
    Button Nieuwe_bestelling;


    public void init(){

        setSize(1920,1080);

        Fris = new Button("Fris");
        FrisListener de = new FrisListener();
        Fris.addActionListener(de);
        add(Fris);

        Bier = new Button("Bier");
        BierListener fd = new BierListener();
        Bier.addActionListener(fd);
        add(Bier);

        koffie = new Button("Koffie");
        KoffieListener df = new KoffieListener();
        koffie.addActionListener(df);
        add(koffie);

        Wijn = new Button("Wijn");
        WijnListener ef = new WijnListener();
        Wijn.addActionListener(ef);
        add(Wijn);

        binn_gedist = new Button("binn gedist");
        binn_gedistListener cd = new binn_gedistListener();
        binn_gedist.addActionListener(cd);
        add(binn_gedist);

        buit_gedist = new Button("buit. gedist");
        buit_gedistListener sd = new buit_gedistListener();
        buit_gedist.addActionListener(sd);
        add(buit_gedist);

        Nieuwe_bestelling = new Button ("Nieuwe Bestelling");
        Nieuwe_bestellingListener fg = new Nieuwe_bestellingListener();
        Nieuwe_bestelling.addActionListener(fg);
        add(Nieuwe_bestelling);


    }

    public void paint(Graphics g) {

        g.drawString("Bestelling totaal "+ order,50,60);
        g.drawString("Totaal omgezet "+ omzet,50,75);
    }

    class FrisListener  implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            double Fris = 2.25;
            order = Fris + order;
            omzet = Fris + omzet;
           repaint();
        }
    }
    class BierListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            double Bier = 2.50;
            omzet = Bier + omzet;
            order = Bier + order;
           repaint();
        }
    }

    class WijnListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            double Wijn = 2.75;
            omzet = Wijn + omzet;
            order = Wijn + order;
          repaint();
        }
    }
    class KoffieListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            double Koffie = 2;
            omzet = Koffie + omzet;
            order = Koffie + order;
         repaint();
        }
    }
    class binn_gedistListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            double binn_gedist = 3;
            omzet = binn_gedist + omzet;
            order = binn_gedist + order;
         repaint();
        }
    }
    class buit_gedistListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            double buit_gedist = 3.75;
            omzet = buit_gedist + omzet;
            order = buit_gedist + order;
         repaint();

        }
    }
    class Nieuwe_bestellingListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            double reset = 0.0;
            order = reset;
         repaint();
        }

    }

}
