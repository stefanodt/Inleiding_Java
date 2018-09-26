package H6;

import java.awt.*;
import java.applet.*;


public class H6Opdracht3 extends Applet {
      int a = 2147483647;
      int b= 2;


      public void init() {
          a = a*b;




      }
      public void paint(Graphics g) {
          g.drawString("2147483647*2="+ a, 20,20);
      }


}
