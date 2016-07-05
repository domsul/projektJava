package Projekt_zaliczeniowy.nowy;

public class Przedszkolak extends Gracz{
	Przedszkolak() 
        {
            imie="przed";
            nazwisko="szkolak";
            stawka=0;
        }
	Przedszkolak(String i, String n, int s, int ilosc)
	{
		imie=i;
		nazwisko=n;
		stawka=s;
		typ=1;
		ilosc_gier=ilosc;
	}
	
	void Reakcja(int re)
	{
		if(re==1)
			System.out.println("Mamo wygrałem!");
		if(re==0)
			System.out.println("Mamo, bo on mi nie daje wygrać!!!!!!!!!");
	}
	
	void Gra1(Timer t)
	{
		t.start();
		wygrana=wygrana_komp=przegrana=przegrana_komp=0;
		Strona wybor=new Strona();
		Rozgrywka match=new Rozgrywka();
		for(int i=0;i<ilosc_gier;i++)
        {
			//Wybor orla/reszki przez graczy
            wybor.Strona_or(this);
            if(t.GetMin()<2)
            {
            	//Rozgrywka
                match.Rozgrywka_or(this,i,ilosc_gier);
                System.out.print("Czas: ");
                t.GetTime();
            }
            else
                break;
        }

        //Podsumowanie
        Podsumowanie po=new Podsumowanie();
        if(t.GetMin()<2)
        	po.pods(this);
        else
        	po.pods_timeout(this,ilosc_gier);
        System.out.print("Czas gry: ");
    	t.GetTime();
	}
}