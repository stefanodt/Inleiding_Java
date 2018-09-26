package h8;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H8opdracht3 extends Applet {
    float uitkomst;
    TextField tekstvak;
    Button knop;
    Label label;

    public void init() {
        label = new Label("Type iets in het vakje");
        add(label);

        tekstvak = new TextField("",20);
        tekstvak.addActionListener(new KnopListener());
        add(tekstvak);


        knop = new Button("Ok");
        knop.addActionListener(new KnopListener());
        add(knop);

    }
    public void paint(Graphics g){
        g.drawString("Het getal inclusief BTW=" + uitkomst,100,50);
    }

       class KnopListener implements ActionListener{
            public void actionPerformed(ActionEvent e){
                float input = Float.parseFloat(tekstvak.getText());
                uitkomst = input /100*121;
                    repaint();

            }
       }
    }

