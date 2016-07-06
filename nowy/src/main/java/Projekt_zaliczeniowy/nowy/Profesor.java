package Projekt_zaliczeniowy.nowy;

import java.util.Scanner;

public class Profesor extends Student{
	Profesor() 
    {
            imie="pro";
            nazwisko="fesor";
            stawka=0;
    }
	
	Profesor(String i, String n, int s, int ilosc)
	{
		imie=i;
		nazwisko=n;
		stawka=s;
		typ=4;
		ilosc_gier=ilosc;
	}
	
	void Reakcja(int re)
	{
		System.out.print(imie+" "+nazwisko+":");
		if(re==1)
			System.out.println("Kolejne osiągnięcie");
		if(re==0)
			System.out.println("Niestety, algorytm tej gry jakiś wadliwy. Temu komuś dałbym 2.0");
	}
    
    void Gra4(Timer t)
	{
    	int s;
    	Scanner odczyt=new Scanner(System.in);
    	JednorekiBandyta jednoreki=new JednorekiBandyta();
    	Wyswietlacz monitor=new Wyswietlacz(jednoreki); //OBSERWATOR
    	t.start();
    	wygrana=wygrana_komp=przegrana=przegrana_komp=0;
    	Rozgrywka match=new Rozgrywka();
    	
    	jednoreki.dodajObserwatora(monitor);
    	for(int i=0;i<ilosc_gier;i++)
        {
    		System.out.println("Podaj stawkę: ");
    		s=odczyt.nextInt();
    		zmien_Stawke(s);
            if(t.GetMin()<6)
            {
            	//Rozgrywka
                match.Rozgrywka_jb(this,i,ilosc_gier,jednoreki,monitor);
                System.out.print("Czas: ");
                t.GetTime();
                System.out.println("--------------------------------------------------------");
            }
            else
                break;
        }

        //Podsumowanie
        Podsumowanie po=new Podsumowanie();
        if(t.GetMin()<3)
        	po.pods_jb(this);
        else
        	po.pods_timeout(this,ilosc_gier);
        System.out.print("\nCzas gry: ");
    	t.GetTime();
    	monitor.koniecgry(); //przestaje obserwować
	}

}
