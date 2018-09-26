package h01;

import java.applet.Applet;
import java.awt.*;

public class HalloRocDev extends Applet {

    public void init() {
      setBackground(Color.white);
    }

      public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Steef!", 50, 60);

        g.setColor(Color.RED);
        g.drawString("di toro", 50, 70 );
    }

 }
