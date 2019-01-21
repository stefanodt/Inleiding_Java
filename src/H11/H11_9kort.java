package H11;

import com.sun.deploy.util.BlackList;

import java.applet.Applet;
import java.awt.*;


public class H11_9kort extends Applet {



    public void init() {
    setSize(1920,1080);

    }
    public void paint(Graphics g) {
        setBackground(Color.lightGray);

        g.fillRect(100,100,400,400);
        for (int i = 100; i <= 400 ; i+=100) {
            for (int j= 100; j <= 400 ; j+=100) {
              g.setColor(Color.white);
              g.fillRect(i, j,50,50);
        }
    }



        for (int i = 150; i < 500 ; i+=100) {
            for (int j = 150; j <= 500 ; j+=100) {
             g.setColor(Color.white);
             g.fillRect(i, j,50,50);
            }
            
        }

    }
}
