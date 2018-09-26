package H6;

import java.awt.*;
import java.applet.*;


public class H6Opdracht1 extends Applet {
     int a;
     int b;
     int uitkomst;


    public void init() {
        a = 113;
        b = 4;
        uitkomst = a/b;
    }

    public void paint(Graphics g) {
     g.drawString("jan krijgt:28 euro",20,65);
     g.drawString("Ali krijgt:28 euro",20,50);
     g.drawString("Jeannette krijgt:28 euro",20,35);
     g.drawString("ik krijg:28 euro",20,20);
     g.drawString("113 euro wordt verdeelt in 4 personen dat is: 113/4 ="+ uitkomst,20,90);

    }

}