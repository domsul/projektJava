package Projekt_zaliczeniowy.nowy;

public abstract class Gracz{
    String imie;
    String nazwisko;
    int stawka;
    int typ;
    int ilosc_gier;
    int strona;
    //int strona_komp;
    int wygrana;
    //int wygrana_komp;
    int przegrana;
    //int przegrana_komp;
    
    Gracz()
    {
    	imie="player";
    	nazwisko="x";
    	stawka=-1;
    }
    
    Gracz(String n, String m) 
    {
        imie=n;
        nazwisko=m;
    }
    
    abstract void Reakcja(int re);
    
    abstract void Gra1(Timer t);
    
    void Gra2(Timer t)
    {
    	System.out.println("GRA: PAPIER, KAMIEŃ CZY NOŻYCE");
    }
    
    void Gra3(Timer t)
    {
    	System.out.println("GRA: POLOWANIE NA JELENIA");
    }
    
    void Gra4(Timer t)
    {
    	System.out.println("GRA: JEDNORĘKI BANDYTA");
    }
    
    void zmien_Stawke(int s)
    {
    	stawka=s;
    }
}