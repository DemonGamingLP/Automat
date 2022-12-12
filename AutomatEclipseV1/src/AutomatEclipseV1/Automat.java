package AutomatEclipseV1;
import java.awt.*;


public class Automat
{
    /**
     * Attribute, welche in Automat verwendet werden.
     */
    int MiH=0;//M�nze in Hand
    double Zustand=0; //jedes Objekt der Klasse Automat besitzt das Attribut Zustand, Typ: Ganzzahl, Anfangswert=0
    int Preise[]={0,150,120,80,100,110,130,120,150,150}; //Preise der Getr�nke.
    String Bez[]={"","Cola","Fanta","Wasser","Apfelschorle","Eistee Pfirsich","Eistee Zitrone","Pepsi","Cola Zero","Cola Light"}; //Namen der Getr�nke.
    double R�ckgeld=-1;//Speicher f�r Geldr�ckgabe damit Zustand unabh�ngig davon wird.
    int GelIF=0;//Geld Im Fach
    int GetIF=0;//Getr�nk im Fach
    /**
     * Farben und Schriftarten, welche in Automat verwendet werden.
     */
    Color Hintergrund = new Color(238,238,238);//Hintergrund
    Color Hellblau = new Color(168,204,215);//Hellblau
    Color T�rkisGr�n = new Color(32,178,170);//T�rkis-Gr�n
    Color Schwarz = new Color(0,0,0);//Schwarz
    Color Rot = new Color (244,0,0);//Rot
    Color Gold = new Color(212,175,55);//Gold
    Color Silber = new Color(192,192,192);//Silber
    Color Hellgrau = new Color(208,208,208);//Hellgrau
    Color Dunkelgrau = new Color(166,166,166);//Dunkelgrau
    Color Hellgr�n = new Color(127,255,0);//Hellgr�n
    Font Normal = new Font("TimesRoman", Font.PLAIN, 11);//Normale Schrift
    Font Gro� = new Font("TimesRoman", Font.PLAIN, 25);//Gro�e Schrift
    Font KlTx = new Font("TimesRoman", Font.PLAIN, 5);//Schrift Kl Tx
    Font GrTx = new Font("TimesRoman", Font.PLAIN, 25);//Schrift Gr Tx

    Graphics g;
    
    /**
     * Konstruktor
     */
    Automat(Graphics G)
    {
        g=G;
    }

    /**
     * Addiert MiH zu Zustand; Gibt Fehler wenn es �ber 200 gehen w�rde.
     */
    void Einwurf(int MiH)
    {
        if(Zustand+MiH<=200)
        {
            if(MiH==10)
            {
                if(R�ckgeld==-1)
                {
                    R�ckgeld=0;
                }
                Zustand=Zustand+MiH;
                g.setColor(Hellblau);
                g.fillRect(456,146,73,19);
                g.fillRect(667,57,398,198);
                g.setColor(Hellgr�n);
                g.fillOval(488,111,10,10);
                g.setColor(Schwarz);
                g.drawOval(488,111,10,10);
                g.setFont(KlTx);
                g.drawString(("Guthaben: "+Zustand+" Cent."),457,155);
                g.setFont(GrTx);
                g.drawString(("Guthaben: "+Zustand+" Cent."),670,110);
            }
            if(MiH==20)
            {
                if(R�ckgeld==-1)
                {
                    R�ckgeld=0;
                }
                Zustand=Zustand+MiH;
                g.setColor(Hellblau);
                g.fillRect(456,146,73,19);
                g.fillRect(667,57,398,198);
                g.setColor(Hellgr�n);
                g.fillOval(488,111,10,10);
                g.setColor(Schwarz);
                g.drawOval(488,111,10,10);
                g.setFont(KlTx);
                g.drawString(("Guthaben: "+Zustand+" Cent."),457,155);
                g.setFont(GrTx);
                g.drawString(("Guthaben: "+Zustand+" Cent."),670,110);
            }
            if(MiH==50)
            {
                if(R�ckgeld==-1)
                {
                    R�ckgeld=0;
                }
                Zustand=Zustand+MiH;;
                g.setColor(Hellblau);
                g.fillRect(456,146,73,19);
                g.fillRect(667,57,398,198);
                g.setColor(Hellgr�n);
                g.fillOval(488,111,10,10);
                g.setColor(Schwarz);
                g.drawOval(488,111,10,10);
                g.setFont(KlTx);
                g.drawString(("Guthaben: "+Zustand+" Cent."),457,155);
                g.setFont(GrTx);
                g.drawString(("Guthaben: "+Zustand+" Cent."),670,110);
            }
            if(MiH==100)
            {
                if(R�ckgeld==-1)
                {
                    R�ckgeld=0;
                }
                Zustand=Zustand+MiH;
                g.setColor(Hellblau);
                g.fillRect(456,146,73,19);
                g.fillRect(667,57,398,198);
                g.setColor(Hellgr�n);
                g.fillOval(488,111,10,10);
                g.setColor(Schwarz);
                g.drawOval(488,111,10,10);
                g.setFont(KlTx);
                g.drawString(("Guthaben: "+Zustand+" Cent."),457,155);
                g.setFont(GrTx);
                g.drawString(("Guthaben: "+Zustand+" Cent."),670,110);
            }
            if(MiH==200)
            {
                if(R�ckgeld==-1)
                {
                    R�ckgeld=0;
                }
                Zustand=Zustand+MiH;
                g.setColor(Hellblau);
                g.fillRect(456,146,73,19);
                g.fillRect(667,57,398,198);
                g.setColor(Hellgr�n);
                g.fillOval(488,111,10,10);
                g.setColor(Schwarz);
                g.drawOval(488,111,10,10);
                g.setFont(KlTx);
                g.drawString(("Guthaben: "+Zustand+" Cent."),457,155);
                g.setFont(GrTx);
                g.drawString(("Guthaben: "+Zustand+" Cent."),670,110);
            }
        }
        else 
        {
            g.setColor(Rot);
            g.fillOval(488,111,10,10);
            g.setColor(Schwarz);
            g.drawOval(488,111,10,10);
            g.setFont(KlTx);
            g.drawString("Maximal 200 cent",455,160);
            g.setFont(GrTx);
            g.drawString("Maximal 200 cent",670,140);
        }
    }

    /**
     * Zieht Preis eines Getr�nks von Zustand ab; Gibt Fehler wenn nicht genug Geld eingeworfen wurde.
     */
    void ausgeben(int code)
    {
        if(code>0 && code<Bez.length)
        {
            if(Zustand>=Preise[code])
            {
                GetIF=code;
                Zustand=Zustand-Preise[code];
                GeldR�ckgabe();
                g.setColor(Hellgr�n);
                g.fillOval(488,111,10,10);
                g.setColor(Schwarz);
                g.drawOval(488,111,10,10);
                g.setFont(KlTx);
                g.drawString(Bez[code]+" wird ausgegeben.",457,155);
                g.setFont(GrTx);
                g.drawString(Bez[code]+" wird ausgegeben.",670,110);
                GetIF=code;
            }
            else 
            {
                g.setColor(Hellblau);
                g.fillRect(456,146,73,19);
                g.fillRect(667,57,398,198);
                g.setColor(Rot);
                g.fillOval(488,111,10,10);
                g.setColor(Schwarz);
                g.drawOval(488,111,10,10);
                g.setFont(KlTx);
                g.drawString("Nicht gen�gend Geld.",457,155);
                g.setFont(GrTx);
                g.drawString("Nicht gen�gend Geld.",670,110);
            }
        }
    }
    void GPS() throws InterruptedException
    {
    	while (true){
            {
                Thread.sleep(1000/1);        

                Zustand=(double) Math.round((Zustand+(1.2000D/1))*10000000D)/10000000D;
                System.out.println(+Zustand);

                
              

            }
            
        }
    }
    /**
     * Gibt Geld zur�ck, ohne etwas auszugeben; Wenn vorher
     */
    void GeldR�ckgabe()  
    {
        if(R�ckgeld>=0)
        {
            R�ckgeld=Zustand;
            if(R�ckgeld>0)
            {
                g.setColor(Hellblau);
                g.fillRect(456,146,73,19);
                g.fillRect(667,57,398,198);
                g.setColor(Hellgr�n);
                g.fillOval(488,111,10,10);
                g.setColor(Schwarz);
                g.drawOval(488,111,10,10);
                if(GetIF>0)
                {
                g.setFont(KlTx);
                g.drawString(R�ckgeld+" Cent R�ckgeld.",457,160);
                g.setFont(GrTx);
                g.drawString(R�ckgeld+" Cent R�ckgeld.",670,140);
                }
                else
                {
                g.setFont(KlTx);
                g.drawString(R�ckgeld+" Cent R�ckgeld.",457,155);
                g.setFont(GrTx);
                g.drawString(R�ckgeld+" Cent R�ckgeld.",670,110);
                }
                R�ckgeld=-1;
                GelIF=1;
                Zustand=0;
            }
            else if(R�ckgeld==0)
            {
                g.setColor(Hellblau);
                g.fillRect(456,146,73,19);
                g.fillRect(667,57,398,198);
                g.setColor(Hellgr�n);
                g.fillOval(488,111,10,10);
                g.setColor(Schwarz);
                g.drawOval(488,111,10,10);
                g.setFont(KlTx);
                g.drawString("Kein R�ckgeld.",457,160);
                g.setFont(GrTx);
                g.drawString("Kein R�ckgeld.",670,140);
                R�ckgeld=-1;
                Zustand=0;
            }
        }
        else if(R�ckgeld==-1)
        {
            g.setColor(Hellblau);
            g.fillRect(456,146,73,19);
            g.fillRect(667,57,398,198);
            g.setColor(Rot);
            g.fillOval(488,111,10,10);
            g.setColor(Schwarz);
            g.drawOval(488,111,10,10);
            if(GetIF>0)
                {
                g.setFont(KlTx);
                g.drawString(R�ckgeld+"Kein Geld vorhanden.",457,160);
                g.setFont(GrTx);
                g.drawString(R�ckgeld+"Kein Geld vorhanden.",670,140);
                }
                else
                {
                g.setFont(KlTx);
                g.drawString("Kein Geld vorhanden.",457,155);
                g.setFont(GrTx);
                g.drawString("Kein Geld vorhanden.",670,110);
                }
            Zustand=0;
        }
    }
}





/*
 
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Image;

 
public class Automat
{
    int MiH=0;//M�nzen in Hand
    int Zustand=0; //jedes Objekt der Klasse CopyOfAutomat besitzt das Attribut Zustand, Typ: Ganzzahl, Anfangswert=0
    int Preise[]={0,120,120,80,100,110,130,150,120,120}; //Preise der Getr�nke.
    String Bez[]={"","Cola","Fanta","Wasser","Apfelschorle","Eistee Pfirsich","Eistee Zitrone","Pepsi","Cola Zero","Cola Light"}; //Namen der Getr�nke.
    int Lager[]={0,10,7,2,7,4,6,2,6,8}; //Wie viele Gtr�nke auf Lager sind.
    int Zugang=0; //Passwort zustand
    int Getr�nke[]={0,0,0,0}; //Wie viele Getr�nke man dabei hat.
    int Getr�nk=0; //wie viele Getr�nke man zum nachf�llen mitnimmt.
    int M�nzen[]={100,5,2,3,2}; //M�nzen im Automaten in 10 cent, 20 cent, 50 cent, 100 cent, 200 cent.*/
    /**int AuKont=M�nzen[0]*10+M�nzen[1]*20+M�nzen[2]*50+M�nzen[3]*100+M�nzen[4]*200; //Geld insgesammt im Automat*/
    /*int R�ckgeldM�nzen[]={0,0,0,0,0}; //Zwischenspeicher und f�r berechnung der Geldr�ckgabe
    int R�ckgeld=0; //Speicher f�r Geldr�ckgabe damit Zustand unabh�ngig davon wird.
    
    Graphics g;
    
    public Automat(Graphics G)
    {
        g=G;
    }
    
    void Einwurf(int MiH)
    {
        if (Zugang==0)
        {
            if(MiH==10 || MiH==20 || MiH==50 || MiH==100 || MiH==200)
            {
                if(Zustand+MiH<=200)
                {
                    if(MiH==10)
                    {
                    Zustand=Zustand+MiH;
                    AuKont=AuKont+MiH;
                    M�nzen[0]=M�nzen[0]+1;
                    System.out.println("Guthaben: "+Zustand+" Cent.");
                    }
                    if(MiH==20)
                    {
                    Zustand=Zustand+MiH;
                    AuKont=AuKont+MiH;
                    M�nzen[1]=M�nzen[1]+1;
                    System.out.println("Guthaben: "+Zustand+" Cent.");
                    }
                    if(MiH==50)
                    {
                    Zustand=Zustand+MiH;
                    AuKont=AuKont+MiH;
                    M�nzen[2]=M�nzen[2]+1;
                    System.out.println("Guthaben: "+Zustand+" Cent.");
                    }
                    if(MiH==100)
                    {
                    Zustand=Zustand+MiH;
                    AuKont=AuKont+MiH;
                    M�nzen[3]=M�nzen[3]+1;
                    System.out.println("Guthaben: "+Zustand+" Cent.");
                    }
                    if(MiH==200)
                    {
                    Zustand=Zustand+MiH;
                    AuKont=AuKont+MiH;
                    M�nzen[4]=M�nzen[4]+1;
                    System.out.println("Guthaben: "+Zustand+" Cent.");
                    }
                }
                else 
                {
                    System.out.println("Maximal 200 cent");
                }
            }
            else if(MiH!=1 && MiH!=2 && MiH!=5 && MiH!=10 && MiH!=20 && MiH!=50 && MiH!=100 && MiH!=200 && MiH!=500 && MiH!=1000 && MiH!=2000 && MiH!=5000 && MiH!=10000 && MiH!=20000 && MiH!= 50000)
            {
            System.out.println("Wir akzeptieren kein Falschgeld.");
            }
            else
            {
                System.out.println("Wir nehmen kein Kupfer und Papier.");
            }
        }
        else
        {
            System.out.println("Schlie�en Sie vorher den Automaten.");
        }
    }
    void ausgeben(int code)
    {
        if (Zugang==0)
        {     
            if(code>0 && code<Bez.length)
            {
                if(Lager[code]>0)
                {
                    if(Zustand>=Preise[code])
                    {
                        System.out.println(Bez[code]+" wird ausgegeben");
                        AuKont=AuKont-(Zustand-Preise[code]);
                        Zustand=Zustand-Preise[code];
                        Lager[code]=Lager[code]-1;
                        //G.drawRect(100,100,20,20);
                        GeldR�ckgabe();
                    }
                    else 
                    {
                        System.out.println("Nicht gen�gend Geld");
                    }
                }
                else
                {
                    System.out.println("Nicht auf Lager.");
                }
            }
            else
            {
            System.out.println("Bitte w�hlen sie eine Zahl zwischen 1 und 9");
            }
        }
        else 
        {
            System.out.println("Schlie�en Sie vorher den Automaten.");
        }
    }
    void PasswortEingeben(int Passwort)
    {
        if (Zustand==0)
        {
            if(Zugang==0)
            {
                if(Passwort==12345)
                {
                    Zugang=1;
                    System.out.println("Passwort ist richtig!Automat kann ge�ffnet werden.");
                }
                else
                {
                    System.out.println("Falsches Passwort.");
                }
            }
            else
            {
                System.out.println("Sie haben den Automaten bereits ge�ffnet.");
            }
        }
        else 
        {
            System.out.println("Bitte fordern Sie zuerst das R�ckgeld an.");
        }
    }

    void Nachf�llgetr�nkeNehmen(int code,int Getr�nk) //int code -> Wahl des Getr�nkes zum auff�llen. ; int Getr�nk -> Wie viel von diesem Getr�nk zum auff�llen genommen werden soll.
    {
        if(Zugang==1)
        {
            Getr�nke[code]=Getr�nke[code]+Getr�nk;
            Getr�nk=0;
            System.out.println("Sie haben "+Getr�nke[code]+" "+ Bez[code]+" genommen.");
        }  
        else
        {
            System.out.println("Diese Getr�nke sind nur zum Auff�llen gedacht. Nicht klauen.");
        }
    }   
    void AuKontLeeren()
    {
        if(Zugang==1)
        {
        System.out.println(AuKont+" Cent ausgezahlt; " + (AuKont - 1900) + "Cent verdient. 1900 Cent wieder eingezahlt.");
        AuKont=1900;
        M�nzen[0]=100;
        M�nzen[1]=5;
        M�nzen[2]=2;
        M�nzen[3]=3;
        M�nzen[4]=2;
        }
        else
        {
        System.out.println("Das Geld geh�rt nicht Ihnen.");
        }
    }
    void Nachf�llen(int code)
    {
        if(code>=0 && code<Bez.length)
        {
            if(Zugang==1)
            {
                if(Getr�nke[code]>0)
                {
                    Lager[code]=Lager[code]+Getr�nke[code];
                    Getr�nke[code]=0;
                    System.out.println(Bez[code]+" wurde nachgef�llt. " +Lager[code]+" Getr�nke verf�gbar.");
                }
                else
                {
                    System.out.println("Vielleicht sollten Sie zuerst ein Getr�nk zum auff�llen Nehmen.");
                }
            }
            else System.out.println("Sie sollten zuerst den Automat �ffnen.");
        }
    }
    void AutomatSchlie�en()
    {
        if(Zugang==1)
        {
            Zugang=0;
            System.out.println("Automat ist nun betriebsbereit.");
        }
        else 
        {
            System.out.println("Der Automat ist doch bereits geschlossen und betriebsbereit. Worauf warten Sie?");
        }
    }
    void GeldR�ckgabe()
    {  
        if(Zugang==0)
        {
            if(Zustand>0)
            {
                R�ckgeld=Zustand;
                if(Zustand-200>=0)
                {
                    if(M�nzen[4]>=Zustand/200)
                    {
                    R�ckgeldM�nzen[4]=Zustand/200;
                    M�nzen[4]=M�nzen[4]-R�ckgeldM�nzen[4];
                    Zustand=Zustand-(R�ckgeldM�nzen[4]*200);
                    }
                }
                if(Zustand-100>=0)
                {
                    if(M�nzen[3]>=Zustand/100)
                    {
                    R�ckgeldM�nzen[3]=Zustand/100;
                    M�nzen[3]=M�nzen[3]-R�ckgeldM�nzen[3];
                    Zustand=Zustand-(R�ckgeldM�nzen[3]*100);
                    }
                }
                if(Zustand-50>=0)
                {
                    if(M�nzen[2]>=Zustand/50)
                    {
                    R�ckgeldM�nzen[2]=Zustand/50;
                    M�nzen[2]=M�nzen[2]-R�ckgeldM�nzen[2];
                    Zustand=Zustand-(R�ckgeldM�nzen[2]*50);
                    }
                }
                if(Zustand-20>=0)
                {
                    if(M�nzen[1]>=Zustand/20)
                    {
                    R�ckgeldM�nzen[1]=Zustand/20;
                    M�nzen[1]=M�nzen[1]-R�ckgeldM�nzen[1];
                    Zustand=Zustand-(R�ckgeldM�nzen[1]*20);
                    }
                }
                if(Zustand-10>=0)
                {
                    if(M�nzen[0]>=Zustand/10)
                    {
                    R�ckgeldM�nzen[0]=Zustand/10;
                    M�nzen[0]=M�nzen[0]-R�ckgeldM�nzen[0];
                    Zustand=Zustand-(R�ckgeldM�nzen[0]*10);
                    }
                }
                System.out.println(R�ckgeld+" Cent R�ckgeld in "+(R�ckgeldM�nzen[4]>0 ? R�ckgeldM�nzen[4] +" Zwei Euro M�nze(n), " : "")+(R�ckgeldM�nzen[3]>0 ? R�ckgeldM�nzen[3] +" Ein Euro M�nze(n)," : "")+(R�ckgeldM�nzen[2]>0 ? R�ckgeldM�nzen[2] +" F�nfzig Cent M�nze(n)," : "")+(R�ckgeldM�nzen[1]>0 ? R�ckgeldM�nzen[1] +" Zwanzig Cent M�nze(n)," : "")+(R�ckgeldM�nzen[0]>0 ? R�ckgeldM�nzen[0] +" Zehn Cent M�nze(n)" : "")+" Danke f�r Ihren Einkauf.");
                
            }
            else{
                System.out.println("Kein Geld vorhanden.");

            }
        }
        else
        {
            System.out.println("Schlie�en Sie vorher den Automaten.");
        }
    }
}


 */