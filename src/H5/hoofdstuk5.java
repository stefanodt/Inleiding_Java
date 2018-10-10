package H5;

import java.applet.Applet;
import java.awt.*;

public class hoofdstuk5 extends Applet{
      //declaratie
      Color blue;
      Color black;
      int i1=50;
      int i2=120;


      public void init() {
        setBackground(Color.white);
        //initialisatie
          blue = Color.magenta;
          black = Color.black;
          i1 = 100;
          i2 = 200;


    }

    public void paint(Graphics g) {

        g.setColor(Color.black);
        g.drawLine(1700, 600, 1200, 600);
        g.drawLine(1200, 190, 1200, 600);
        g.drawLine(1190, 550, 1200, 550);
        g.drawLine(1190, 500, 1200, 500);
        g.drawLine(1190, 450, 1200, 450);
        g.drawLine(1190, 400, 1200, 400);
        g.drawLine(1190, 350, 1200, 350);
        g.drawLine(1190, 300, 1200, 300);
        g.drawLine(1190, 250, 1200, 250);


        g.drawString("0", 1190, 600);
        g.drawString("15", 1170, 550);
        g.drawString("30", 1170, 500);
        g.drawString("45", 1170, 450);
        g.drawString("60", 1170, 400);
        g.drawString("75", 1170, 350);
        g.drawString("90", 1170, 300);
        g.drawString("105", 1170, 250);
        g.drawString("120", 1170, 200);


        g.setColor(Color.green);
        g.fillRect(1250, 400, 50, 90);
        g.setColor(Color.pink);
        g.fillRect(1300, 400, 50, 90);
        g.setColor(Color.orange);
        g.fillRect(1350, 400, 50, 90);

        g.setColor(Color.green);
        g.drawString("Valerie", 1250, 610);

        g.setColor(Color.pink);
        g.drawString("Hans", 1300, 610);

        g.setColor(Color.orange);
        g.drawString("Jeroen", 1350, 610);

        g.setColor(Color.black);
        g.drawString("Kilogram", 1150, 190);


      }

    }