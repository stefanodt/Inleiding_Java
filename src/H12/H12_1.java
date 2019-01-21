package H12;

import java.awt.*;
import java.applet.Applet;

public class H12_1 extends Applet {
   double salaris[];

   public void init() {
       salaris = new double [10];

       for(int i = 0; i < salaris.length; i++ ) {
        salaris[i] = 100 * i + 100;
   }
}


public void paint(Graphics g) {
    for (int i = 0; i < salaris.length; i++) {
        g.drawString(""+salaris[i],50,20 * i + 20);
    }
    g.drawString(""+ 1000 / 10,100,20);
}
}


