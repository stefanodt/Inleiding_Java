package H11;

import java.applet.Applet;
import java.awt.*;

public class H11_4 extends Applet {
    int tafel3;





    public void init() {

        }


    public void paint(Graphics g){
        tafel3 = 3;
        for (int i = 1; i <= 10 ; i++) {
            g.drawString("" + tafel3*i,250,50 + 20*i);
        }

        }

    }


