package H6;

import java.awt.*;
import java.applet.*;
import java.text.DecimalFormat;


public class H6Praktijkopdracht extends Applet {

     double a;
     double b;
     double c;
     double d;

     DecimalFormat df = new
            DecimalFormat("#.#");

    public void init() {
        a = 5.9;
        b = 6.3;
        c = 6.9;
        d = (a+b+c)/3;










    }

    public void paint(Graphics g) {
        g.drawString("cijfer"+ a, 20,20);
        g.drawString("cijfer"+ b, 20, 35);
        g.drawString("cijfer"+ c,20,50);
        g.drawString("gemiddelde"+ df.format(d), 20,65);






    }




}
