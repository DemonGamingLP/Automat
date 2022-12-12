package AutomatEclipseV1;
import java.awt.*;


public class Automat
{
    /**
     * Attribute, welche in Automat verwendet werden.
     */
    int MiH=0;//Münze in Hand
    double Zustand=0; //jedes Objekt der Klasse Automat besitzt das Attribut Zustand, Typ: Ganzzahl, Anfangswert=0
    int Preise[]={0,150,120,80,100,110,130,120,150,150}; //Preise der Getränke.
    String Bez[]={"","Cola","Fanta","Wasser","Apfelschorle","Eistee Pfirsich","Eistee Zitrone","Pepsi","Cola Zero","Cola Light"}; //Namen der Getränke.
    double Rückgeld=-1;//Speicher für Geldrückgabe damit Zustand unabhängig davon wird.
    int GelIF=0;//Geld Im Fach
    int GetIF=0;//Getränk im Fach
    /**
     * Farben und Schriftarten, welche in Automat verwendet werden.
     */
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
     * Addiert MiH zu Zustand; Gibt Fehler wenn es über 200 gehen würde.
     */
    void Einwurf(int MiH)
    {
        if(Zustand+MiH<=200)
        {
            if(MiH==10)
            {
                if(Rückgeld==-1)
                {
                    Rückgeld=0;
                }
                Zustand=Zustand+MiH;
                g.setColor(Hellblau);
                g.fillRect(456,146,73,19);
                g.fillRect(667,57,398,198);
                g.setColor(Hellgrün);
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
                if(Rückgeld==-1)
                {
                    Rückgeld=0;
                }
                Zustand=Zustand+MiH;
                g.setColor(Hellblau);
                g.fillRect(456,146,73,19);
                g.fillRect(667,57,398,198);
                g.setColor(Hellgrün);
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
                if(Rückgeld==-1)
                {
                    Rückgeld=0;
                }
                Zustand=Zustand+MiH;;
                g.setColor(Hellblau);
                g.fillRect(456,146,73,19);
                g.fillRect(667,57,398,198);
                g.setColor(Hellgrün);
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
                if(Rückgeld==-1)
                {
                    Rückgeld=0;
                }
                Zustand=Zustand+MiH;
                g.setColor(Hellblau);
                g.fillRect(456,146,73,19);
                g.fillRect(667,57,398,198);
                g.setColor(Hellgrün);
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
                if(Rückgeld==-1)
                {
                    Rückgeld=0;
                }
                Zustand=Zustand+MiH;
                g.setColor(Hellblau);
                g.fillRect(456,146,73,19);
                g.fillRect(667,57,398,198);
                g.setColor(Hellgrün);
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
     * Zieht Preis eines Getränks von Zustand ab; Gibt Fehler wenn nicht genug Geld eingeworfen wurde.
     */
    void ausgeben(int code)
    {
        if(code>0 && code<Bez.length)
        {
            if(Zustand>=Preise[code])
            {
                GetIF=code;
                Zustand=Zustand-Preise[code];
                GeldRückgabe();
                g.setColor(Hellgrün);
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
                g.drawString("Nicht genügend Geld.",457,155);
                g.setFont(GrTx);
                g.drawString("Nicht genügend Geld.",670,110);
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
     * Gibt Geld zurück, ohne etwas auszugeben; Wenn vorher
     */
    void GeldRückgabe()  
    {
        if(Rückgeld>=0)
        {
            Rückgeld=Zustand;
            if(Rückgeld>0)
            {
                g.setColor(Hellblau);
                g.fillRect(456,146,73,19);
                g.fillRect(667,57,398,198);
                g.setColor(Hellgrün);
                g.fillOval(488,111,10,10);
                g.setColor(Schwarz);
                g.drawOval(488,111,10,10);
                if(GetIF>0)
                {
                g.setFont(KlTx);
                g.drawString(Rückgeld+" Cent Rückgeld.",457,160);
                g.setFont(GrTx);
                g.drawString(Rückgeld+" Cent Rückgeld.",670,140);
                }
                else
                {
                g.setFont(KlTx);
                g.drawString(Rückgeld+" Cent Rückgeld.",457,155);
                g.setFont(GrTx);
                g.drawString(Rückgeld+" Cent Rückgeld.",670,110);
                }
                Rückgeld=-1;
                GelIF=1;
                Zustand=0;
            }
            else if(Rückgeld==0)
            {
                g.setColor(Hellblau);
                g.fillRect(456,146,73,19);
                g.fillRect(667,57,398,198);
                g.setColor(Hellgrün);
                g.fillOval(488,111,10,10);
                g.setColor(Schwarz);
                g.drawOval(488,111,10,10);
                g.setFont(KlTx);
                g.drawString("Kein Rückgeld.",457,160);
                g.setFont(GrTx);
                g.drawString("Kein Rückgeld.",670,140);
                Rückgeld=-1;
                Zustand=0;
            }
        }
        else if(Rückgeld==-1)
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
                g.drawString(Rückgeld+"Kein Geld vorhanden.",457,160);
                g.setFont(GrTx);
                g.drawString(Rückgeld+"Kein Geld vorhanden.",670,140);
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
    int MiH=0;//Münzen in Hand
    int Zustand=0; //jedes Objekt der Klasse CopyOfAutomat besitzt das Attribut Zustand, Typ: Ganzzahl, Anfangswert=0
    int Preise[]={0,120,120,80,100,110,130,150,120,120}; //Preise der Getränke.
    String Bez[]={"","Cola","Fanta","Wasser","Apfelschorle","Eistee Pfirsich","Eistee Zitrone","Pepsi","Cola Zero","Cola Light"}; //Namen der Getränke.
    int Lager[]={0,10,7,2,7,4,6,2,6,8}; //Wie viele Gtränke auf Lager sind.
    int Zugang=0; //Passwort zustand
    int Getränke[]={0,0,0,0}; //Wie viele Getränke man dabei hat.
    int Getränk=0; //wie viele Getränke man zum nachfüllen mitnimmt.
    int Münzen[]={100,5,2,3,2}; //Münzen im Automaten in 10 cent, 20 cent, 50 cent, 100 cent, 200 cent.*/
    /**int AuKont=Münzen[0]*10+Münzen[1]*20+Münzen[2]*50+Münzen[3]*100+Münzen[4]*200; //Geld insgesammt im Automat*/
    /*int RückgeldMünzen[]={0,0,0,0,0}; //Zwischenspeicher und für berechnung der Geldrückgabe
    int Rückgeld=0; //Speicher für Geldrückgabe damit Zustand unabhängig davon wird.
    
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
                    Münzen[0]=Münzen[0]+1;
                    System.out.println("Guthaben: "+Zustand+" Cent.");
                    }
                    if(MiH==20)
                    {
                    Zustand=Zustand+MiH;
                    AuKont=AuKont+MiH;
                    Münzen[1]=Münzen[1]+1;
                    System.out.println("Guthaben: "+Zustand+" Cent.");
                    }
                    if(MiH==50)
                    {
                    Zustand=Zustand+MiH;
                    AuKont=AuKont+MiH;
                    Münzen[2]=Münzen[2]+1;
                    System.out.println("Guthaben: "+Zustand+" Cent.");
                    }
                    if(MiH==100)
                    {
                    Zustand=Zustand+MiH;
                    AuKont=AuKont+MiH;
                    Münzen[3]=Münzen[3]+1;
                    System.out.println("Guthaben: "+Zustand+" Cent.");
                    }
                    if(MiH==200)
                    {
                    Zustand=Zustand+MiH;
                    AuKont=AuKont+MiH;
                    Münzen[4]=Münzen[4]+1;
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
            System.out.println("Schließen Sie vorher den Automaten.");
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
                        GeldRückgabe();
                    }
                    else 
                    {
                        System.out.println("Nicht genügend Geld");
                    }
                }
                else
                {
                    System.out.println("Nicht auf Lager.");
                }
            }
            else
            {
            System.out.println("Bitte wählen sie eine Zahl zwischen 1 und 9");
            }
        }
        else 
        {
            System.out.println("Schließen Sie vorher den Automaten.");
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
                    System.out.println("Passwort ist richtig!Automat kann geöffnet werden.");
                }
                else
                {
                    System.out.println("Falsches Passwort.");
                }
            }
            else
            {
                System.out.println("Sie haben den Automaten bereits geöffnet.");
            }
        }
        else 
        {
            System.out.println("Bitte fordern Sie zuerst das Rückgeld an.");
        }
    }

    void NachfüllgetränkeNehmen(int code,int Getränk) //int code -> Wahl des Getränkes zum auffüllen. ; int Getränk -> Wie viel von diesem Getränk zum auffüllen genommen werden soll.
    {
        if(Zugang==1)
        {
            Getränke[code]=Getränke[code]+Getränk;
            Getränk=0;
            System.out.println("Sie haben "+Getränke[code]+" "+ Bez[code]+" genommen.");
        }  
        else
        {
            System.out.println("Diese Getränke sind nur zum Auffüllen gedacht. Nicht klauen.");
        }
    }   
    void AuKontLeeren()
    {
        if(Zugang==1)
        {
        System.out.println(AuKont+" Cent ausgezahlt; " + (AuKont - 1900) + "Cent verdient. 1900 Cent wieder eingezahlt.");
        AuKont=1900;
        Münzen[0]=100;
        Münzen[1]=5;
        Münzen[2]=2;
        Münzen[3]=3;
        Münzen[4]=2;
        }
        else
        {
        System.out.println("Das Geld gehört nicht Ihnen.");
        }
    }
    void Nachfüllen(int code)
    {
        if(code>=0 && code<Bez.length)
        {
            if(Zugang==1)
            {
                if(Getränke[code]>0)
                {
                    Lager[code]=Lager[code]+Getränke[code];
                    Getränke[code]=0;
                    System.out.println(Bez[code]+" wurde nachgefüllt. " +Lager[code]+" Getränke verfügbar.");
                }
                else
                {
                    System.out.println("Vielleicht sollten Sie zuerst ein Getränk zum auffüllen Nehmen.");
                }
            }
            else System.out.println("Sie sollten zuerst den Automat öffnen.");
        }
    }
    void AutomatSchließen()
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
    void GeldRückgabe()
    {  
        if(Zugang==0)
        {
            if(Zustand>0)
            {
                Rückgeld=Zustand;
                if(Zustand-200>=0)
                {
                    if(Münzen[4]>=Zustand/200)
                    {
                    RückgeldMünzen[4]=Zustand/200;
                    Münzen[4]=Münzen[4]-RückgeldMünzen[4];
                    Zustand=Zustand-(RückgeldMünzen[4]*200);
                    }
                }
                if(Zustand-100>=0)
                {
                    if(Münzen[3]>=Zustand/100)
                    {
                    RückgeldMünzen[3]=Zustand/100;
                    Münzen[3]=Münzen[3]-RückgeldMünzen[3];
                    Zustand=Zustand-(RückgeldMünzen[3]*100);
                    }
                }
                if(Zustand-50>=0)
                {
                    if(Münzen[2]>=Zustand/50)
                    {
                    RückgeldMünzen[2]=Zustand/50;
                    Münzen[2]=Münzen[2]-RückgeldMünzen[2];
                    Zustand=Zustand-(RückgeldMünzen[2]*50);
                    }
                }
                if(Zustand-20>=0)
                {
                    if(Münzen[1]>=Zustand/20)
                    {
                    RückgeldMünzen[1]=Zustand/20;
                    Münzen[1]=Münzen[1]-RückgeldMünzen[1];
                    Zustand=Zustand-(RückgeldMünzen[1]*20);
                    }
                }
                if(Zustand-10>=0)
                {
                    if(Münzen[0]>=Zustand/10)
                    {
                    RückgeldMünzen[0]=Zustand/10;
                    Münzen[0]=Münzen[0]-RückgeldMünzen[0];
                    Zustand=Zustand-(RückgeldMünzen[0]*10);
                    }
                }
                System.out.println(Rückgeld+" Cent Rückgeld in "+(RückgeldMünzen[4]>0 ? RückgeldMünzen[4] +" Zwei Euro Münze(n), " : "")+(RückgeldMünzen[3]>0 ? RückgeldMünzen[3] +" Ein Euro Münze(n)," : "")+(RückgeldMünzen[2]>0 ? RückgeldMünzen[2] +" Fünfzig Cent Münze(n)," : "")+(RückgeldMünzen[1]>0 ? RückgeldMünzen[1] +" Zwanzig Cent Münze(n)," : "")+(RückgeldMünzen[0]>0 ? RückgeldMünzen[0] +" Zehn Cent Münze(n)" : "")+" Danke für Ihren Einkauf.");
                
            }
            else{
                System.out.println("Kein Geld vorhanden.");

            }
        }
        else
        {
            System.out.println("Schließen Sie vorher den Automaten.");
        }
    }
}


 */