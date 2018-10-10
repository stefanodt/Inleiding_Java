package H10;


import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

public class H10Opdracht4 extends Applet {
      TextField tekstvak;
      TextField tekstvak2;
      Label label;
      String s, tekst;
      int maanden;
      int dagen;


      public void init(){
          tekstvak = new TextField("",10);
          tekstvak2 = new TextField("",10);
          tekstvak.addActionListener( new TekstvakListener());
          tekstvak2.addActionListener (new TekstvakListener());
          tekst = "";
          label = new Label("type hier uw maand en jaar in");
          add(label);
          add(tekstvak);
          add(tekstvak2);
      }

      public void paint (Graphics g){
          g.drawString("maand:"+ tekstvak.getText(),50,60);

          String s = "";
          if(dagen > 0){
              s = s + dagen;
          }
          g.drawString("dagen:" + s,50,80);
      }
      class TekstvakListener implements ActionListener {


          public void actionPerformed(ActionEvent e) {
              s = tekstvak.getText();
              maanden = Integer.parseInt(s);
              switch (maanden) {
                  case 1:
                      tekst = "januari";
                      dagen = 31;
                      break;
                  case 2:
                      s = tekstvak2.getText();
                      int jaartal = Integer.parseInt(s);
                      if((jaartal % 4 == 0 && !(jaartal % 100 == 0)) || jaartal % 400 == 0){
                          dagen = 29;
                      }
                      else{
                          dagen = 28;
                      }
                      tekst = "februari";
                      break;

                  case 3:
                      tekst = "Maart";
                      dagen = 31;
                      break;
                  case 4:
                      tekst = "April";
                      dagen = 30;
                      break;
                  case 5:
                      tekst = "Mei";
                      dagen = 31;
                      break;
                  case 6:
                      tekst = "Juni";
                      dagen = 30;
                      break;
                  case 7:
                      tekst = "Juli";
                      dagen = 31;
                      break;
                  case 8:
                      tekst = "Augustus";
                      dagen = 31;
                      break;
                  case 9:
                      tekst = "September";
                      dagen = 30;
                      break;
                  case 10:
                      tekst = "Oktober";
                      dagen = 31;
                      break;
                  case 11:
                      tekst = "November";
                      dagen = 30;
                      break;
                  case 12:
                      tekst = "December";
                      dagen = 31;
                      break;
                  default:
                      tekst = "Dit is geen geldigen maand..!";
                      break;


              }
              repaint();
          }
      }

      }
