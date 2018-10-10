package Oktober_Challenge;

import org.w3c.dom.css.Rect;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

public class H8_staafdiagram extends Applet {
    TextField Valerieinvoer;
    TextField jeroeninvoer;
    TextField hansinvoer;
    Button Toon;

    Label label;
    Label label2;
    Label label3;

    Float uitkomst1;
    Float uitkomst2;
    Float uitkomst3;


    public void init(){

        setSize(1920,1080);

        label = new Label("Valerie");
        label2 = new Label("Jeroen");
        label3 = new Label("Hans");
        Valerieinvoer = new TextField("",10);
        jeroeninvoer = new TextField("",10);
        hansinvoer = new TextField("",10);
        ToonListener de = new ToonListener();
        Valerieinvoer.addActionListener(de);
        jeroeninvoer.addActionListener(de);
        hansinvoer.addActionListener(de);

        add(label);
        add(Valerieinvoer);
        add(label2);
        add(jeroeninvoer);
        add(label3);
        add(hansinvoer);

        Toon = new Button("Toon");
        Toon.addActionListener(de);
        add(Toon);
    }

    public void paint(Graphics g) {

        g.setColor(Color.BLACK);

        //:GrafiekFrame
        g.drawLine(500,200,500,750);
        g.drawLine(500,750,1100,750);

        //:Streepjes
        g.drawLine(500,300,510,300);
        g.drawLine(500,375,510,375);
        g.drawLine(500,450,510,450);
        g.drawLine(500,525,510,525);
        g.drawLine(500,600,510,600);
        g.drawLine(500,675,510,675);

        //:Getallen
        g.drawString("20",475,675);
        g.drawString("40",475,600);
        g.drawString("60",475,525);
        g.drawString("80",475,450);
        g.drawString("100",475,375);
        g.drawString("120",475,300);

        g.drawString("Valerie",600,775);
        g.drawString("Jeroen",700,775);
        g.drawString("hans",800,775);


        float gewicht1 = uitkomst1;
        float gewicht2 = uitkomst2;
        float gewicht3 = uitkomst3;

        //:Rectangles
        g.setColor(Color.ORANGE);
        g.fillRect(600,750-(int)(100*gewicht1/26),50,(int)(100*gewicht1/26));

        g.setColor(Color.BLUE);
        g.fillRect(700,750-(int)(100*gewicht2/26),50,(int)(100*gewicht2/26));

        g.setColor(Color.GREEN);
        g.fillRect(800,750-(int)(100*gewicht3/26),50,(int)(100*gewicht3/26));




    }
    class ToonListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            float gewicht1 = Float.parseFloat(Valerieinvoer.getText());
            uitkomst1 = gewicht1;
            float gewicht2 = Float.parseFloat(jeroeninvoer.getText());
            uitkomst2 = gewicht2;
            float gewicht3 = Float.parseFloat(hansinvoer.getText());
            uitkomst3 = gewicht3;
            repaint();



        }
    }


}
