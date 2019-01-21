package H12;

import java.applet.Applet;
import java.awt.*;

public class H12_2 extends Applet {
    int[] buttons;
    Button button;
    public void init() {
        buttons =  new int[26];

        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = 100 * i + 100;

            button = new Button("olleh");
            add(button);
        }


    }

    public void paint(Graphics g) {
        for (int i = 0; i < buttons.length; i++) {
        }
    }
}
