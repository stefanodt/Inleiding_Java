package H11;

import java.applet.Applet;
import java.awt.*;

public class H11_5 extends Applet {
  int vierkanten;

    public void init(){


    }

    public void paint(Graphics g){
        int eind = 6;
        for (int i = 1; i < eind ; i++) {
            g.drawRect(30*i,i * 30,30,30);
        }
    }





}

