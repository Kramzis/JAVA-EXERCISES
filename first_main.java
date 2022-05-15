/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.first_project;

import static com.mycompany.first_project.ciagFibo.Fibo;
import java.time.Clock;

/**
 *
 * @author ASUS
 */
public class first_main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Metody obiekt  = new Metody();
        System.out.println("zadanie 1");
        System.out.println(obiekt.liczba);
        System.out.println(obiekt.znak);
        System.out.println(obiekt.zdanie);
        System.out.println("zadanie 2");
        Metody.wypisywanie();
        System.out.println("zadanie 3");
        Uczen student1= new Uczen();
        Uczen student2 = new Uczen("Magdalena","Kramek",20,3.45);
        System.out.printf("%s %s %d %.2f \n",student1.imie,student1.nazwisko,student1.wiek,student1.srednia);
        System.out.printf("%s %s %d %.2f \n",student2.imie,student2.nazwisko,student2.wiek,student2.srednia);
        System.out.println("zadanie 4");
        Owoc banan = new Owoc("banan","Wenezuela","żółty");
        banan.setMasa(134.32);
        
        System.out.println(banan.nazwa);System.out.println(banan.kolor);
        System.out.println(banan.krajPochodzenia);
        System.out.println(banan.masa);
        System.out.println("zadanie 5");
        Wyliczanie.wh();
        Wyliczanie.dowh();
        Wyliczanie.fr();
        System.out.println("zadanie 7");
        LiczbyCalkowite.liczbyC();
        System.out.println("zadanie 8");
        int n = 9;
        System.out.println(Fibo(n));
    }
    
}
class Metody {
    public int liczba;
    public char znak;
    public String zdanie;
    public static void wypisywanie()
    {
        for (int i=0;i<55;i++)
        {
            System.out.println(i);
        }
    }
    public static void trojkat(double a,double b, double c)
    {
        if (a<b+c) {System.out.println("Możemy zbudować trójkąt!");}
        else if (b<c+a){System.out.println("Możemy zbudować trójkąt!");}
        else if (c<b+a) {System.out.println("Możemy zbudować trójkąt!");}
        else {System.out.println("Nie możemy zbudować trójkąta!");}
                
        
    };
            
    }
        
 class Uczen {
     
     String imie;
     String nazwisko;
     int wiek;
     double srednia;
     Uczen()
     {
         this.wiek=0;
         this.imie="none";
         this.nazwisko="none";
         this.srednia=0;
         
                 
     }
     Uczen(String im,String naz,int w,double sr)
     {
         imie=im;
         nazwisko=naz;
         wiek=w;
         srednia=sr;
     }
 }

 class Owoc {
 String nazwa;
 String kolor;
 double masa;
 String krajPochodzenia;
 public Owoc() {
 }
 public Owoc(String nazwa, String krajPochodzenia) {
 this.nazwa = nazwa;
 this.krajPochodzenia = krajPochodzenia;
 }
 public Owoc(String naz,String kraj,String kol)
 {
     nazwa=naz;
     krajPochodzenia=kraj;
     kolor=kol;
 }
 public void setMasa(double masaZmierzona) {
 masa = masaZmierzona;
 }
 public double getMasa()
 {
     return masa;
 }
 public String getNazwa()
 {
     return nazwa;
 }
 public String getKolor()
 {
     return kolor;
 }
 public String geKrajPochodzenia()
 {
     return krajPochodzenia;
 }
}

class Wyliczanie {
    static void wh()
    {
        int i=5;
        while (i<=80)
        {
            System.out.printf("%d ", i);
            i+=15;
        }
    }
    static void dowh()
    {
        int i=5;
        do 
        {
            System.out.printf("%d ", i);
            i+=15;
        }while (i<=80);
    }
    static void fr()
    {
        int i;
        for (i=5;i<=80;i+=15)
        {
            System.out.printf("%d ", i);
        }
    }
    
}

class LiczbyCalkowite {
    public static int liczba = 11; 
    static void liczbyC()
    {
        for(int i = 0; i < 104; i++)
        {
            liczba++;
            if (liczba%13 == 0)
            {
                System.out.println(liczba);
            }
        }
    }
}

class ciagFibo {
    static int Fibo(int n)
    {
        if (n <= 1)
            return n;
        return Fibo(n-1) + Fibo(n-2);
    }
}
