package H11;

import java.applet.Applet;
import java.awt.*;

public class H11_6 extends Applet {
  int cirkels;
  
    public void init(){
      
    }

    public void paint(Graphics g) {
      int eind = 6;
        for (int i = 1; i < eind ; i++)
            g.drawOval(50-i*10, 50-i*10,i * 20,i * 20);

    }
}