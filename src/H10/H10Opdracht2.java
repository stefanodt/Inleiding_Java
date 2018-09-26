package H10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H10Opdracht2 extends Applet {
    TextField tekstvak;
    Label label;
    float uitkomst = -2146740985;
    float uitkomst2 = 2146740985;

    public void init() {
        tekstvak = new TextField("", 5);
        tekstvak.addActionListener(new VakListener());


        label = new Label("type hier het getal");


        add(tekstvak);
    }

    public void paint(Graphics g) {
        if (uitkomst == -2146740985)
            return;
        else

            g.drawString("" + uitkomst, 50, 45);

        if (uitkomst == 2146740985)
            return;
        else
              g.drawString("" +uitkomst2,50,60);
    }

    class VakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            float getalinvoer = Float.parseFloat(tekstvak.getText());
            if (uitkomst < getalinvoer)
                uitkomst = getalinvoer;


            float getalinvoer2 = Float.parseFloat(tekstvak.getText());
            if(uitkomst2 > getalinvoer2)
            uitkomst2 = getalinvoer2;
            repaint();
        }
    }
}
