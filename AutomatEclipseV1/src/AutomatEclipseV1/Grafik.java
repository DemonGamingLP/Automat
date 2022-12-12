package AutomatEclipseV1;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Grafik implements MouseListener , MouseMotionListener
{
    JFrame F;
    Graphics G;
    Automat A;

    /**
     * Attribute,welche in diesem Programm verwendet werden.
     */
    
    int Gezeichnet=0;//Attribut, um Automat einmalig per Mausklick zu zeichnen.

    /**
     * Farben und Schriftarten, welche in diesem Programm verwendet werden.
     */
    Color Cola = new Color(51,11,12);//Cola Flüssigkeit
    Color Fanta = new Color(255,200,5);//Fanta Flüssigkeit
    Color Wasser = new Color(212,241,249);//Wasser Flüssigkeit
    Color AS = new Color(250,173,0);//Apfelschorle Flüssigkeit
    Color EP = new Color(186,130,0);//Eistee Pfirsich Flüssigkeit
    Color EZ = new Color(224,157,0);//Eistee Zitrone Flüssigkeit
    Color Pepsi = new Color(51,11,12);//Pepsi Flüssigkeit
    Color CZ = new Color(51,11,12);//Cola Zero Flüssigkeit
    Color CL = new Color(51,11,12);//Cola Light Flüssigkeit

    Color Hintergrund = new Color(238,238,238);//Hintergrund
    Color Hellblau = new Color(168,204,215);//Hellblau
    Color TürkisGrün = new Color(32,178,170);//Türkis-Grün
    Color Schwarz = new Color(0,0,0);//Schwarz
    Color Rot = new Color (244,0,0);//Rot
    Color Gold = new Color(212,175,55);//Gold
    Color Silber = new Color(192,192,192);//Silber
    Color Hellgrau = new Color(208,208,208);//Hellgrau
    Color Dunkelgrau = new Color(166,166,166);//Dunkelgrau
    Color Hellgrün = new Color(127,255,0);//Hellgrün
    Font Normal = new Font("TimesRoman", Font.PLAIN, 11);//Normale Schrift
    Font Groß = new Font("TimesRoman", Font.PLAIN, 25);//Große Schrift
    Font KlTx = new Font("TimesRoman", Font.PLAIN, 4);//Schrift Kl Tx
    Font GrTx = new Font("TimesRoman", Font.PLAIN, 25);//Schrift Gr Tx
    Font EKAN = new Font("TimesRoman", Font.PLAIN, 10);//Etwas-kleiner-als-Normal Schrift
    /**
     * Koordinaten für jegliche Polygons, welche in diesem Programm verwendet werden.
     */
    int xs[]={600,560,560,600};//x von Polygon s
    int ys[]={60,100,600,560};//y von Polygon s
    int xo[]={140,180,600,560};//x o von Polygon o
    int yo[]={100,60,60,100};//y o von Polygon o 

    int xd1[]={201,223,223,215,215,209,209,201};//x von Polygon Flasche Cola
    int xd2[]={285,307,307,299,299,293,293,285};//x von Polygon Flasche Fanta
    int xd3[]={369,391,391,383,383,377,377,369};//x von Polygon Flasche Wasser
    int xd4[]={201,223,223,215,215,209,209,201};//x von Polygon Flasche Apfelschorle
    int xd5[]={285,307,307,299,299,293,293,285};//x von Polygon Flasche Eistee Pfirsich
    int xd6[]={369,391,391,383,383,377,377,369};//x von Polygon Flasche Eistee Zitrone
    int xd7[]={201,223,223,215,215,209,209,201};//x von Polygon Flasche Pepsi
    int xd8[]={285,307,307,299,299,293,293,285};//x von Polygon Flasche Cola Zero
    int xd9[]={369,391,391,383,383,377,377,369};//x von Polygon Flasche Cola Light

    int yd1[]={210,210,180,168,150,150,168,180};//y von Polygon Flasche Cole
    int yd2[]={210,210,180,168,150,150,168,180};//y von Polygon Flasche Fanta
    int yd3[]={210,210,180,168,150,150,168,180};//y von Polygon Flasche Wasser
    int yd4[]={334,334,304,292,274,274,292,304};//y von Polygon Flasche Apfelschorle
    int yd5[]={334,334,304,292,274,274,292,304};//y von Polygon Flasche Eistee Pfirsich
    int yd6[]={334,334,304,292,274,274,292,304};//y von Polygon Flasche Eistee Zitrone
    int yd7[]={458,458,428,416,398,398,416,428};//y von Polygon Flasche Pepsi
    int yd8[]={458,458,428,416,398,398,416,428};//y von Polygon Flasche Cola Zero
    int yd9[]={458,458,428,416,398,398,416,428};//y von Polygon Flasche Cola Light

    int xGelOK[]={450,470,465,455};//Geldausgabe Offene Klappe X
    int yGelOK[]={440,440,445,445};//Geldausgabe Offene Klappe Y

    int xGetOK[]={170,422,412,180};//Getränkausgabe Offene Klappe X
    int yGetOK[]={520,520,530,530};//Getränkausgabe Offene Klappe Y

    
    
    /**
     * Konstruktor
     */
    Grafik()
    {
        F=new JFrame();
        F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        F.setPreferredSize(new Dimension (1920,1036));
        F.pack();
        F.setVisible(true);
        F.addMouseListener(this);
        F.addMouseMotionListener(this);
        G=F.getGraphics();
        A=new Automat(G);
        
    }

    /**
     * Zeichnet den Automat.
     * A: Außen, F: Füllung,  R: Rand, I: Innen, s: Seite, o: Oben,
     * u: Unten, 
     */
    void AutomatZeichnenV1()
    {
    	
    	
    	Gezeichnet=1;//Setzt int Gezeichnet auf 1
    	
        G.setFont(Normal);//Standart Schriftart
        G.setColor(Gold);//Gold
        G.fillOval(1075,60,79,79);//10 ct Münze A F
        G.fillOval(1075,150,89,89);//20 ct Münze A F
        G.fillOval(1075,247,97,97);//50 ct Münze A F
        G.fillOval(1075,355,93,93);//1€ Münze A F

        G.setColor(Silber);//Silber
        G.fillOval(1075,460,103,103);//2€ Münze A F

        G.setColor(Schwarz);//Schwarz
        G.drawOval(1075,60,79,79);//10 ct Münze A R
        G.drawOval(1075,150,89,89);//20 ct Münze A R
        G.drawOval(1075,247,97,97);//50 ct Münze A R
        G.drawOval(1075,355,93,93);//1€ Münze A R
        G.drawOval(1075,460,103,103);//2€ Münze A R

        G.setColor(Silber);//Silber
        G.fillOval(1070,460,103,103);//2€ Münze I A F


        G.setColor(Gold);//Gold
        G.fillOval(1070,60,79,79);//10 ct Münze I F
        G.fillOval(1070,150,89,89);//20 ct Münze I F
        G.fillOval(1070,247,97,97);//50 ct Münze I F
        G.fillOval(1070,355,93,93);//1€ Münze I A F
        G.fillOval(1081,471,81,81);//2€ Münze I I F

        G.setColor(Schwarz);//Schwarz
        G.drawOval(1070,60,79,79);//10 ct Münze I R
        G.drawOval(1070,150,89,89);//20 ct Münze I R
        G.drawOval(1070,247,97,97);//50 ct Münze I R
        G.drawOval(1070,355,93,93);//1€ Münze I R
        G.drawOval(1070,460,103,103);//2€ Münze I R

        G.setColor(Silber);//Silber
        G.fillOval(1081,366,71,71);//1€ Münze I I F

        G.setColor(Hellgrau);//Hellgrau
        G.fillRect(140,100,420,500);//Basis Fläche Auto F 
        G.fillPolygon(xs,ys,4);//Basis Fläche Seite F
        G.fillPolygon(xo,yo,4);//Basis Fläche Oben F

        G.setColor(Gold);//Gold
        G.fillOval(456,180,20,20);//Münzschlitz A F

        G.setColor(Schwarz);//Schwarz
        G.fillRect(465,185,3,11);//Münzschlitz I F

        G.setColor(Dunkelgrau);//Dunkelgrau
        G.fillRect(456,205,75,75);//Tastenfeld F
        G.fillRect(450,440,20,20);//Münzausgabe F
        G.fillOval(500,180,20,20);//Geldrückgabe Knopf F

        G.setColor(Hellgrün);//Hellgrün
        G.fillOval(488,111,10,10);//Leuchte F

        G.setColor(Hellblau);//Hellblau
        G.fillRect(455,145,75,21);//Textfeld F
        G.fillRect(170,128,252,372);//Fenster F
        G.fillRect(170,520,252,30);//Getränk Ausgabe F
        G.fillRect(666,56,400,200);//Vergrößerung Textfeld F

        G.setColor(Cola);//Cola Flüssigkeit
        G.fillPolygon(xd1,yd1,xd1.length);//Cola Flasche F
        G.setColor(Fanta);//Fanta Flüssigkeit
        G.fillPolygon(xd2,yd2,xd2.length);//Fanta Flasche F
        G.setColor(Wasser);//Wasser Flüssigkeit
        G.fillPolygon(xd3,yd3,xd3.length);//Wasser Flasche F
        G.setColor(AS);//Apfelschorle Flüssigkeit
        G.fillPolygon(xd4,yd4,xd4.length);//Apfelschorle Flasche F
        G.setColor(EP);//Eistee Pfirsich Flüssigkeit
        G.fillPolygon(xd5,yd5,xd5.length);//Eistee Pfirsich Flasche F
        G.setColor(EZ);//Eistee Zitrone Flüssigkeit
        G.fillPolygon(xd6,yd6,xd6.length);//Eistee Zitrone Flasche F
        G.setColor(Pepsi);//Pepsi Flüssigkeit
        G.fillPolygon(xd7,yd7,xd7.length);//Pepsi Flasche F
        G.setColor(CZ);//Cola Zero Flüssigkeit
        G.fillPolygon(xd8,yd8,xd8.length);//Cola Zero Flasche F
        G.setColor(CL);//Cola Light Flüssigkeit
        G.fillPolygon(xd9,yd9,xd9.length);//Cola Light Flasche F

        G.setColor(Schwarz);//Schwarz
        G.drawLine(254,128,254,499);//1.Vertikal Trennung Fenster
        G.drawLine(338,128,338,499);//2.Vertikal Trennung Fenster
        G.drawLine(170,252,422,252);//1.Horizontal Trennung Fenster
        G.drawLine(170,376,422,376);//2.Horizontal Trennung Fenster
        G.drawRect(140,100,420,500);//Basis Fläche Auto R
        G.drawPolygon(xs,ys,4);//Polygon s R
        G.drawPolygon(xo,yo,4);//Polygon o R
        G.drawRect(456,205,75,75);//Tastenfeld R
        G.drawRect(450,440,20,20);//Münzausgabe R
        G.drawRect(455,145,75,21);//Textfeld R
        G.drawRect(464,184,4,12);//Münzschlitz I R
        G.drawOval(488,111,10,10);//Leuchte R
        G.drawRect(170,128,252,372);//Fenster R
        G.drawRect(170,520,252,30);//Getränk Ausgabe R
        G.drawOval(456,180,20,20);//Münzschlitz A R
        G.drawOval(500,180,20,20);//Geldrückgabe Knopf R
        G.drawLine(481,205,481,280);//1.Vertikal Trennung Tastenfeld
        G.drawLine(506,205,506,280);//2.Vertikal Trennung Tastenfeld
        G.drawLine(456,230,531,230);//1.Horizontal Trennung Tastenfeld
        G.drawLine(456,255,531,255);//2.Horizontal Trennung Tastenfeld
        G.drawLine(530,156,666,56);//Vergrößerung Oben
        G.drawLine(530,156,666,256);//Vergrößerung Unten
        G.drawRect(666,56,400,200);//Vergrößerung Textfeld R

        G.drawRect(177,220,67,20);//Cola Schild u
        G.drawRect(261,220,67,20);//Fanta Schild u
        G.drawRect(345,220,67,20);//Wasser Schild u
        G.drawRect(177,344,67,20);//Apfelschorle Schild u
        G.drawRect(261,344,67,20);//Eistee Pfirsich Schild u
        G.drawRect(345,344,67,20);//Eistee Zitrone Schild u
        G.drawRect(177,468,67,20);//Pepsi Schild u
        G.drawRect(261,468,67,20);//Cola Zero Schild u
        G.drawRect(345,468,67,20);//Cola Light Schild u

        G.drawRect(177,132,67,15);//Cola Schild o
        G.drawRect(261,132,67,15);//Fanta Schild o
        G.drawRect(345,132,67,15);//Wasser Schild o
        G.drawRect(177,256,67,15);//Apfelschorle Schild o
        G.drawRect(261,256,67,15);//Eistee Pfirsich Schild o
        G.drawRect(345,256,67,15);//Eistee Zitrone Schild o
        G.drawRect(177,380,67,15);//Pepsi Schild o
        G.drawRect(261,380,67,15);//Cola Zero Schild o
        G.drawRect(345,380,67,15);//Cola Light Schild o        

        G.drawPolygon(xd1,yd1,xd1.length);//Cola Flasche R
        G.drawPolygon(xd2,yd2,xd2.length);//Fanta Flasche R
        G.drawPolygon(xd3,yd3,xd3.length);//Wasser Flasche R
        G.drawPolygon(xd4,yd4,xd4.length);//Apfelschorle Flasche R
        G.drawPolygon(xd5,yd5,xd5.length);//Eistee Pfirsich Flasche R
        G.drawPolygon(xd6,yd6,xd6.length);//Eistee Zitrone Flasche R
        G.drawPolygon(xd7,yd7,xd7.length);//Pepsi Flasche R
        G.drawPolygon(xd8,yd8,xd8.length);//Cola Zero Flasche R
        G.drawPolygon(xd9,yd9,xd9.length);//Cola Light Flasche R

        G.drawString("1",465,222);//Tastenfeld "1"
        G.drawString("2",490,222);//Tastenfeld "2"
        G.drawString("3",515,222);//Tastenfeld "3"
        G.drawString("4",465,247);//Tastenfeld "4"
        G.drawString("5",490,247);//Tastenfeld "5"
        G.drawString("6",515,247);//Tastenfeld "6"
        G.drawString("7",465,272);//Tastenfeld "7"
        G.drawString("8",490,272);//Tastenfeld "8"
        G.drawString("9",515,272);//Tastenfeld "9"
        G.drawString("R",508,195);//Geldrückgabe Knopf "R"

        G.setFont(Groß);//Große Schrift
        G.drawString("10ct",1083,109);//10 ct Münze "10ct"
        G.drawString("20ct",1090,205);//20 ct Münze "20ct"
        G.drawString("50ct",1095,304);//50 ct Münze "50ct"
        G.drawString("1€",1103,408);//1€ Münze "1€"
        G.drawString("2€",1109,518);//2€ Münze "2€"

        G.setFont(Normal);//Normale Schrift
        G.drawString("1 | 1,50€",193,235);//Preis und Nummer von Cola
        G.drawString("2 | 1,20€",277,235);//Preis und Nummer von Fanta
        G.drawString("3 | 0,80€",361,235);//Preis und Nummer von Wasser
        G.drawString("4 | 1,00€",193,359);//Preis und Nummer von Apfelschorle
        G.drawString("5 | 1,10€",277,359);//Preis und Nummer von Eistee Pfirsich
        G.drawString("6 | 1,30€",361,359);//Preis und Nummer von Eistee Zitrone
        G.drawString("7 | 1,20€",193,483);//Preis und Nummer von Pepsi
        G.drawString("8 | 1,50€",277,483);//Preis und Nummer von Cola Zero
        G.drawString("9 | 1,50€",361,483);//Preis und Nummer von Cola Light

        G.setFont(EKAN);
        G.drawString("Cola ",200,144);//Name Cola
        G.drawString("Fanta",283,144);//Name Fanta
        G.drawString("Wasser",363,144);//Name Wasser
        G.drawString("Apfelschorle",184,268);//Name Apfelschorle
        G.drawString("Eistee Pfirsich",262,268);//Name Eistee Pfirsich
        G.drawString("Eistee Zitrone",347,268);//Name Eistee Zitrone
        G.drawString("Pepsi",200,392);//Name Pepsi
        G.drawString("Cola Zero",273,392);//Name Cola Zero
        G.drawString("Cola Light",355,392);//Name Cola Light

        G.setFont(Normal);//Normale Schrift
    	
    }
    
   /* void SpielZeichnen()
    {
    	int test;
    	
    	for(;;)
    	{
    		test=(int) (Math.random()*1981);
    		System.out.println(test);
    		
    	}
    }*/
    
    public void mouseClicked(MouseEvent E)
    {	
    	int x=E.getX();
        int y=E.getY();
        System.out.println(x+","+y);
            //SpielZeichnen();
    }

    /**
     * Folgendes Zeichnet den Automat beim ersten Klick auf 
     * die Fläche, wenn dieser noch nie gezeichnet wurde.
     */
    public void mousePressed(MouseEvent E)
    {
        if(Gezeichnet==0)
        {
            AutomatZeichnenV1();//Zeichnet Automat
        }
    }

    public void mouseEntered(MouseEvent E)
    {   
    
    }

    public void mouseMoved(MouseEvent E)
    {  
        if(Gezeichnet==1)
        {
            if(E.getX()>450 && E.getX()<470 && E.getY()>440 && E.getY()<460)
            {
                G.setColor(Hellgrau);//Hellgrau
                G.fillRect(450,440,20,20);//Münzausgabe F
                G.setColor(Dunkelgrau);//Dunkelgrau
                G.fillPolygon(xGelOK,yGelOK,yGelOK.length);//Klappe von Münzausgabe nach innen F
                G.setColor(Schwarz);//Schwarz
                G.drawRect(450,440,20,20);//Münzausgabe R
                G.drawLine(450,460,455,455);//Diagonale
                G.drawLine(455,455,470,455);//Horizontale
                G.drawLine(455,455,455,445);//Vertikale
                G.drawPolygon(xGelOK,yGelOK,yGelOK.length);//Klappe von Münzausgabe nach innen R
                if(A.GelIF==1)//Wenn nach Geldrückgabe() von Automat Rückgeld ausgegeben wurde. 
                {
                    G.setColor(Gold);//Gold
                    G.fillRect(452,455,15,3);//1. Münze F
                    G.fillRect(452,452,15,3);//2.Münze F
                    G.setColor(Schwarz);//Schwarz
                    G.drawRect(452,455,15,3);//1.Münze R
                    G.drawRect(452,452,15,3);//2.Münze R
                }
            }
            else if(E.getX()>440 && E.getX()<480 && E.getY()>430 && E.getY()<470)
            {
                G.setColor(Dunkelgrau);//Dungelgrau
                G.fillRect(450,440,20,20);//Münzausgabe geschlossen F
                G.setColor(Schwarz);//Schwarz
                G.drawRect(450,440,20,20);//Münzausgabe geschlossen R

            }

            if(E.getX()>170 && E.getX()<422 && E.getY()>520 && E.getY()<550)
            {
                G.setColor(Hellgrau);//Hellgrau
                G.fillRect(170,520,252,30);//Getränkeausgabe F
                G.setColor(Hellblau);//Hellblau
                G.fillPolygon(xGetOK,yGetOK,yGetOK.length);//Klappe von Getränkeausgabe nach innen F
                G.setColor(Schwarz);//Schwarz               
                G.drawRect(170,520,252,30);//Getränkeausgabe R
                G.drawPolygon(xGetOK,yGetOK,yGetOK.length);//Klappe von Getränkeausgabe nach innen R
                if(A.GetIF>0)//wenn ausgeben() von Automat vorher erfolgreich ein Getränk ausgegeben hat.
                {
                    if(A.GetIF==1)//Wenn code bei ausgeben = 1 war
                    {
                        G.setColor(Cola);//Cola Flüssigkeit
                    }
                    else if(A.GetIF==2)//Wenn code bei ausgeben = 2 war
                    {
                        G.setColor(Fanta);//Fanta Flüssigkeit
                    }
                    else if(A.GetIF==3)//Wenn code bei ausgeben = 3 war
                    {
                        G.setColor(Wasser);//Wasser Flüssigkeit
                    }
                    else if(A.GetIF==4)//Wenn code bei ausgeben = 4 war
                    {
                        G.setColor(AS);//Apfelschorle Flüssigkeit
                    }
                    else if(A.GetIF==5)//Wenn code bei ausgeben = 5 war
                    {
                        G.setColor(EP);//Eistee Pfirsich Flüssigkeit
                    }
                    else if(A.GetIF==6)//Wenn code bei ausgeben = 6 war
                    {
                        G.setColor(EZ);//Eistee Zitrone Flüssigkeit
                    }
                    else if(A.GetIF==7)//Wenn code bei ausgeben = 7 war
                    {
                        G.setColor(Pepsi);//Pepsi Flüssigkeit
                    }
                    else if(A.GetIF==8)//Wenn code bei ausgeben = 8 war
                    {
                        G.setColor(CZ);//Cola Zero Flüssigkeit
                    }
                    else if(A.GetIF==9)//Wenn code bei ausgeben = 9 war
                    {
                        G.setColor(CL);//Cola Light Flüssigkeit
                    }
                    G.fillRect(285,530,22,20);//Halbe Flasche F
                    G.setColor(Schwarz);//Schwarz
                    G.drawRect(285,530,22,20);//Halbe Flasche R
                }
            }
            else if(E.getX()>160 && E.getX()<432 && E.getY()>510 && E.getY()<560)
            {
                G.setColor(Hellblau);//Hellblau
                G.fillRect(170,520,252,30);//Getränkeausgabe geschlossen F
                G.setColor(Schwarz);//Schwarz
                G.drawRect(170,520,252,30);//Getränkeausgabe geschlossen R
            }
        }
    }

    public void mouseDragged(MouseEvent E)
    {
        mouseMoved(E);
    }

    public void mouseExited(MouseEvent E)
    {

    }

    public void mouseReleased(MouseEvent E)
    {
    	int münze10X = Math.abs(E.getX() - 1110);
        int münze10Y = Math.abs(E.getY() - 100); 
        int münze10XVer = Math.abs(E.getX() - 1115);
        int münze10YVer = Math.abs(E.getY() - 100);
        
        int münze20X = Math.abs(E.getX() - 1115);
        int münze20Y = Math.abs(E.getY() - 195); 
        int münze20XVer = Math.abs(E.getX() - 1120);
        int münze20YVer = Math.abs(E.getY() - 195);
        
        int münze50X = Math.abs(E.getX() - 1119);
        int münze50Y = Math.abs(E.getY() - 296); 
        int münze50XVer = Math.abs(E.getX() - 1124);
        int münze50YVer = Math.abs(E.getY() - 296);
        
        int münze100X = Math.abs(E.getX() - 1117);
        int münze100Y = Math.abs(E.getY() - 402); 
        int münze100XVer = Math.abs(E.getX() - 1122);
        int münze100YVer = Math.abs(E.getY() - 402);
        
        int münze200X = Math.abs(E.getX() - 1122);
        int münze200Y = Math.abs(E.getY() - 512); 
        int münze200XVer = Math.abs(E.getX() - 1127);
        int münze200YVer = Math.abs(E.getY() - 512);
        
        int münzschlitzX=Math.abs(E.getX()-466);
        int münzschlitzY=Math.abs(E.getY()-190);
        
        int geldrückgabeKX=Math.abs(E.getX()-510);
        int geldrückgabeKY=Math.abs(E.getY()-190);
     
        
        double hypotenuse10 = Math.sqrt(Math.pow(münze10X,2) + Math.pow(münze10Y,2));
        double hypotenuseVer10 = Math.sqrt(Math.pow(münze10XVer,2) + Math.pow(münze10YVer,2));
        
        double hypotenuse20 = Math.sqrt(Math.pow(münze20X,2) + Math.pow(münze20Y,2));
        double hypotenuseVer20 = Math.sqrt(Math.pow(münze20XVer,2) + Math.pow(münze20YVer,2));
        
        double hypotenuse50 = Math.sqrt(Math.pow(münze50X,2) + Math.pow(münze50Y,2));
        double hypotenuseVer50 = Math.sqrt(Math.pow(münze50XVer,2) + Math.pow(münze50YVer,2));
        
        double hypotenuse100 = Math.sqrt(Math.pow(münze100X,2) + Math.pow(münze100Y,2));
        double hypotenuseVer100 = Math.sqrt(Math.pow(münze100XVer,2) + Math.pow(münze100YVer,2));
        
        double hypotenuse200 = Math.sqrt(Math.pow(münze200X,2) + Math.pow(münze200Y,2));
        double hypotenuseVer200 = Math.sqrt(Math.pow(münze200XVer,2) + Math.pow(münze200YVer,2));
        
        double hypotenuseMS = Math.sqrt(Math.pow(münzschlitzX,2) + Math.pow(münzschlitzY,2));
        
        double hypotenuseGRK = Math.sqrt(Math.pow(geldrückgabeKX,2) + Math.pow(geldrückgabeKY,2));
        
        
        if(Gezeichnet==1)
        {
            if(A.GelIF==1)
            {   
                if(E.getX()>451 && E.getX()<468 && E.getY()>451 && E.getY()<458)
                {
                    G.setColor(Hellgrau);//Hellblau
                    G.fillRect(450,440,20,20);//Geldausgabe  F; Löscht Visuelles Geld
                    G.setColor(Dunkelgrau);//Dunkelgrau
                    G.fillPolygon(xGelOK,yGelOK,yGelOK.length);//Klappe von Münzausgabe nach innen F
                    G.setColor(Schwarz);//Schwarz
                    G.drawRect(450,440,20,20);//Münzausgabe R
                    G.drawLine(450,460,455,455);//Diagonale
                    G.drawLine(455,455,470,455);//Horizontale
                    G.drawLine(455,455,455,445);//Vertikale
                    G.drawPolygon(xGelOK,yGelOK,yGelOK.length);//Klappe von Münzausgabe nach innen R
                    A.GelIF=0;//Setzt GelIF auf 0
                }
            }
            if(A.GetIF>0)
            {
                if(E.getX()>284 && E.getX()<308 && E.getY()>530 &&E.getY()<550)
                {
                    G.setColor(Hellgrau);//Hellgrau
                    G.fillRect(170,520,252,30);//Getränkeausgabe F
                    G.setColor(Hellblau);//Hellblau
                    G.fillPolygon(xGetOK,yGetOK,yGetOK.length);//Klappe von Getränkeausgabe nach innen R
                    G.setColor(Schwarz);//Schwarz
                    G.drawRect(170,520,252,30);//Getränkeausgabe R
                    G.drawPolygon(xGetOK,yGetOK,yGetOK.length);
                    A.GetIF=0;//Setzt GetIF auf 0
                }
            }
            /**
             * Speichert die gewählte Münze und umrandet diese.
             */
            if((hypotenuse10 <= 39) || (hypotenuseVer10 <=39))//10ct//10ct
            {
            	A.MiH=10;
                G.setColor(Hintergrund);//Hintergrund
                G.drawRect(1069,149,96,91);//Entferne Umrandung 20ct
                G.drawRect(1069,246,104,99);//Entferne Umrandung 50ct
                G.drawRect(1069,354,100,95);//Entferne Umrandung 1€
                G.drawRect(1069,459,110,105);//Entferne Umrandung 2€
                G.setColor(TürkisGrün);//Türkis-Grün
                G.drawRect(1069,59,86,81);//Umrandung 10ct
                

            }
            if(hypotenuse20 <= 44 || hypotenuseVer20 <= 44)//20ct
            {
                A.MiH=20;//20 Cent in Hand
                G.setColor(Hintergrund);//Hintergrund
                G.drawRect(1069,59,86,81);//Entferne Umrandung10ct
                G.drawRect(1069,246,104,99);//Entferne Umrandung 50ct
                G.drawRect(1069,354,100,95);//Entferne Umrandung 1€
                G.drawRect(1069,459,110,105);//Entferne Umrandung 2€
                G.setColor(TürkisGrün);//Türkis-Grün
                G.drawRect(1069,149,96,91);//Umrandung 20ct

            }
            if(hypotenuse50 <= 48 || hypotenuseVer50 <= 48 )//50ct
            {
                A.MiH=50;//50 Cent in Hand
                G.setColor(Hintergrund);//Hintergrund
                G.drawRect(1069,59,86,81);//Entferne Umrandung10ct
                G.drawRect(1069,149,96,91);//Entferne Umrandung 20ct
                G.drawRect(1069,354,100,95);//Entferne Umrandung 1€
                G.drawRect(1069,459,110,105);//Entferne Umrandung 2€
                G.setColor(TürkisGrün);//Türkis-Grün
                G.drawRect(1069,246,104,99);//Umrandung 50ct

            }
            if(hypotenuse100 <= 46 || hypotenuseVer100 <= 46)//1€
            {
                A.MiH=100;//100 Cent in Hand
                G.setColor(Hintergrund);//Hintergrund
                G.drawRect(1069,59,86,81);//Entferne Umrandung10ct
                G.drawRect(1069,149,96,91);//Entferne Umrandung 20ct
                G.drawRect(1069,246,104,99);//Entferne Umrandung 50ct
                G.drawRect(1069,459,110,105);//Entferne Umrandung 2€
                G.setColor(TürkisGrün);//Türkis-Grün
                G.drawRect(1069,354,100,95);//Umrandung 1€

            }
            if(hypotenuse200 <= 51 || hypotenuseVer200 <= 51)//2€
            {
                A.MiH=200;//200 Cent in Hand
                G.setColor(Hintergrund);//Hintergrund
                G.drawRect(1069,59,86,81);//Entferne Umrandung 10ct
                G.drawRect(1069,149,96,91);//Entferne Umrandung 20ct
                G.drawRect(1069,246,104,99);//Entferne Umrandung 50ct
                G.drawRect(1069,354,100,95);//Entferne Umrandung 1€
                G.setColor(TürkisGrün);//Türkis-Grün
                G.drawRect(1069,459,110,105);//Umrandung 2€

            }
            /**
             * Gibt Getränke aus oder gibt eine Fehlermeldung.
             */
            if(A.GelIF==0 && A.GetIF==0)
            {
                if(E.getX()>456 && E.getX()<481 && E.getY()>205 && E.getY()<230)
                {
                    {
                        A.ausgeben(1);//Methode "ausgeben" von Automat mit code=1
                    }
                }
                if(E.getX()>481 && E.getX()<506 && E.getY()>205 && E.getY()<230)
                {
                    {
                        A.ausgeben(2);//Methode "ausgeben" von Automat mit code=2
                    }
                }
                if(E.getX()>506 && E.getX()<531 && E.getY()>205 && E.getY()<230)
                {
                    {
                        A.ausgeben(3);//Methode "ausgeben" von Automat mit code=3
                    }
                }
                if(E.getX()>456 && E.getX()<481 && E.getY()>230 && E.getY()<255)
                {
                    {
                        A.ausgeben(4);//Methode "ausgeben" von Automat mit code=4
                    }
                }        
                if(E.getX()>481 && E.getX()<506 && E.getY()>230 && E.getY()<255)
                {
                    {
                        A.ausgeben(5);//Methode "ausgeben" von Automat mit code=5
                    }
                }
                if(E.getX()>506 && E.getX()<531 && E.getY()>230 && E.getY()<255)
                {
                    {
                        A.ausgeben(6);//Methode "ausgeben" von Automat mit code=6
                    }
                }
                if(E.getX()>456 && E.getX()<481 && E.getY()>255 && E.getY()<280)
                {
                    {
                        A.ausgeben(7);//Methode "ausgeben" von Automat mit code=7
                    }
                }
                if(E.getX()>481 && E.getX()<506 && E.getY()>255 && E.getY()<280)
                {
                    {
                        A.ausgeben(8);//Methode "ausgeben" von Automat mit code=8
                    }
                }
                if(E.getX()>506 && E.getX()<531 && E.getY()>255 && E.getY()<280)
                {
                    {
                        A.ausgeben(9);//Methode "ausgeben" von Automat mit code=9
                    }
                }
                if(hypotenuseGRK <= 10)
                {
                A.GeldRückgabe();//Methode "GeldRückgabe" von Automat
                }
            }
            else if (E.getX()>456 && E.getX()<531 && E.getY()>205 && E.getY()<280)
            {
                G.setColor(Hellblau);//Hellblau
                G.fillRect(455,145,75,21);//Textfeld F
                G.fillRect(666,56,400,200);//Vergrößerung Textfeld F
                G.setColor(Rot);//Rot
                G.fillOval(488,111,10,10);//Leuchte F
                G.setColor(Schwarz);//Schwarz
                G.drawOval(488,111,10,10);//Leuchte R
                G.drawRect(455,145,75,21);//Textfeld R
                G.drawRect(666,56,400,200);//Vergrößerung Textfeld R
                G.setFont(KlTx);//Kleine Schrift
                G.drawString("Bitte Geld und Getränk entnehmen.",457,155);
                G.setFont(GrTx);//Große Schrift
                G.drawString("Bitte Geld und Getränk entnehmen.",670,110);
            }
            else if (hypotenuseGRK <= 10)
            {
                G.setColor(Hellblau);//Hellblau
                G.fillRect(455,145,75,21);//Textfeld F
                G.fillRect(666,56,400,200);//Vergrößerung Textfeld F
                G.setColor(Rot);//Rot
                G.fillOval(488,111,10,10);//Leuchte F
                G.setColor(Schwarz);//Schwarz
                G.drawOval(488,111,10,10);//Leuchte R
                G.drawRect(455,145,75,21);//Textfeld R
                G.drawRect(666,56,400,200);//Vergrößerung Textfeld R
                G.setFont(KlTx);//Kleine Schrift
                G.drawString("Bitte Geld und Getränk entnehmen.",457,155);
                G.setFont(GrTx);//Große Schrift
                G.drawString("Bitte Geld und Getränk entnehmen.",670,110);
            }
          
            /**
             *Prüft Münzstand und nimmt Münzen an, die eingeworfen werden sollen.
             *Lehnt mit Fehlermeldung ab, wenn zu viel eingeworfen wird.
             */
            if(A.MiH>0)
            {
                if(hypotenuseMS <= 10)
                {
                    {
                        A.Einwurf(A.MiH);//Methode "Einwurf" von Automat mit MiH=<ausgewählt Münze>
                        A.MiH=0;//Attribut "MiH" von "Automat"
                        G.setColor(Hintergrund);//Hintergrund
                        G.drawRect(1069,59,86,81);//Entferne Umrandung 10ct
                        G.drawRect(1069,149,96,91);//Entferne Umrandung 20ct
                        G.drawRect(1069,246,104,99);//Entferne Umrandung 50ct
                        G.drawRect(1069,354,100,95);//Entferne Umrandung 1€
                        G.drawRect(1069,459,110,105);//Entferne Umrandung 2€
                    }
                }
            }
        }
    }
}
