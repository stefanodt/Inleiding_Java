package H11;

import java.applet.Applet;
import java.awt.*;

public class H11_opdracht_1en2 extends Applet {

    public void init(){}

    public void paint(Graphics g) {
        int teller = 0;
        int y = 0;

        if (false)
            while (teller < 10) {
                y += 20;
                g.drawLine(50, y, 300, y);
                g.drawString("" + teller, 305, y);
                teller++;
            }
        for (int i = 0; i < 10; i++) {
            g.drawLine(20 + 20 * i, 10, 20 + 20 * i, 150);

        }
        int eind = 10;
        for (int i = 20; i > eind; i--) {
            g.drawString("" + i, 250, i * 20 - 200);
        }

    }
}
