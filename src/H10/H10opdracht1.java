package H10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H10opdracht1 extends Applet {
    TextField tekstvak;
    Label label;
    String tekst;
    float uitkomst = -2146740985;

    public void init(){
        tekstvak = new TextField("",5);
        tekstvak.addActionListener(new VakListener());
        tekst = "";

        label = new Label("Type hier het getal");

        add(label);
        add(tekstvak);

    }

    public void paint(Graphics g){
        if (uitkomst == -2146740985)
            return;
        else
            g.drawString("" + uitkomst,50,45);

    }

    class VakListener implements ActionListener{
        public void actionPerformed( ActionEvent e ) {

            float getalinvoer = Float.parseFloat(tekstvak.getText());
                if ( uitkomst < getalinvoer )
                    uitkomst = getalinvoer;
                repaint();
            }

    }
}
