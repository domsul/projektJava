package Projekt_zaliczeniowy.nowy;

public class Gracz{
    String imie;
    String nazwisko;
    int stawka;
    int typ;
    int ilosc_gier;
    int strona;
    int strona_komp;
    int wygrana;
    int wygrana_komp;
    int przegrana;
    int przegrana_komp;
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
    
    void GetStawka(int s)
    {
    	stawka=s;
    }
    
    void GetTyp(int t)
    {
    	typ=t;
    }
    
    void Reakcja(int re)
	{
		if(re==1)
			System.out.println("1");
		if(re==0)
			System.out.println("0");
	}
    
    void Gra1(Timer t)
    {
    	System.out.println("GRA: ORZEŁ CZY RESZKA");
    }
    
    void Gra2(Timer t)
    {
    	System.out.println("GRA: PAPIER, KAMIEŃ CZY NOŻYCE");
    }
    
    void Gra3(Timer t)
    {
    	System.out.println("GRA: POLOWANIE NA JELENIA");
    }
}