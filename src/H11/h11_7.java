package H11;

import java.applet.Applet;
import java.awt.*;

public class h11_7 extends Applet {
    int cirkels;

    public void init(){

    }

    public void paint(Graphics g){
        int eind = 51;
        for (int i = 1; i < eind ; i++)
            g.drawOval(1000-i*3, 500-i*3,i * 6,i * 6);

    }
}
