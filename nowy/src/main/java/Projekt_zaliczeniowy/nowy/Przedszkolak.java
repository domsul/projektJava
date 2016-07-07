package Projekt_zaliczeniowy.nowy;

import java.util.Scanner;

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
		System.out.print(imie+" "+nazwisko+":");
		if(re==1)
			System.out.println("Mamo wygrałem!");
		if(re==0)
			System.out.println("Mamo, bo on mi nie daje wygrać!!!!!!!!!");
	}
	
	void Gra1(Timer t)
	{
		int player;
		Scanner odczyt=new Scanner(System.in);
		t.start();
		wygrana=przegrana=0;
		Zarzadca z=new Zarzadca(); //Budowniczy
		Budowniczy b1=new Player1(); //gracz 1
		Budowniczy b2=new Player2(); //gracz 2
		Budowniczy b3=new Player3(); //gracz 3
		GraczKomputer[] g=new GraczKomputer[3]; //tablica graczy
		//GRACZ 1
		z.setBudowniczy(b1);
		z.stworz_gracza();
		g[0]=z.getGracz();
		//GRACZ 2
		z.setBudowniczy(b2);
		z.stworz_gracza();
		g[1]=z.getGracz();
		//GRACZ 3
		z.setBudowniczy(b3);
		z.stworz_gracza();
		g[2]=z.getGracz();
		Strona wybor=new Strona();
		Rozgrywka match=new Rozgrywka();
		
		//Wybór przeciwnika
		do
		{
		System.out.println("Wybierz gracza:");
		for(int i=0;i<3;i++)
			System.out.println(i+". "+g[i].imie+" "+g[i].nazwisko);
		player=odczyt.nextInt();
		if(player<0 || player>2)
			System.out.println("Wybierz jeszcze raz.");
		}while(player<0 || player>2);
		
		//Główna część gry
		for(int i=0;i<ilosc_gier;i++)
        {
			//Wybor orla/reszki przez graczy
            wybor.Strona_or(this,g[player]);
            if(t.GetMin()<2)
            {
            	//Rozgrywka
                match.Rozgrywka_or(this,i,ilosc_gier,g[player]);
                System.out.print("Czas: ");
                t.GetTime();
                System.out.println("--------------------------------------------------------");
            }
            else
                break;
        }

        //Podsumowanie
        Podsumowanie po=new Podsumowanie();
        if(t.GetMin()<2)
        	po.pods(this, g[player]);
        else
        	po.pods_timeout(this,ilosc_gier);
        System.out.print("Czas gry: ");
    	t.GetTime();
	}
}