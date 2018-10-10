package H11;

import java.applet.Applet;
import java.awt.*;

public class H11_3 extends Applet {

    long pop[];



    public void init() {
        setSize(1920, 1080);
        pop = new long[92];
        for (int i = 0; i < pop.length ; i++) {
            if (i < 2)
                pop[i]=1;
            else
                pop[i]=pop[i-2]+pop[i-1];
        }

    }
    public void paint(Graphics g) {

      int i = 0;
        for(long num:pop){
            g.drawString("" + num,250,50+20 * i++);

        }


        }

    }

