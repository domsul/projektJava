package Projekt_zaliczeniowy.nowy;

import java.util.Scanner;

public class Uczen extends Przedszkolak{
    Uczen() 
    {
        imie="ucz";
        nazwisko="en";
        stawka=0;
    }
    
    Uczen(String i, String n, int s, int ilosc)
    {
    	imie=i;
    	nazwisko=n;
    	stawka=s;
    	typ=2;
    	ilosc_gier=ilosc;
    }
    
    void Reakcja(int re)
	{
    	System.out.print(imie+" "+nazwisko+":");
		if(re==1)
			System.out.println("izi");
		if(re==0)
			System.out.println("fart noobie");
	}
    
    void Gra2(Timer t)
	{
    	int player;
    	Scanner odczyt=new Scanner(System.in);
    	t.start();
    	wygrana=przegrana=0;
    	Zarzadca z=new Zarzadca();
		Budowniczy b1=new Player1();
		Budowniczy b2=new Player2();
		Budowniczy b3=new Player3();
		GraczKomputer[] g=new GraczKomputer[3];
		//GRACZ 1
		z.setBudowniczy(b1);
		z.stworz_gracza();
		g[0]=z.getGracz();
		//GRACZ 2
		z.setBudowniczy(b2);
		z.stworz_gracza();
		g[1]=z.getGracz();
		//GRACZ 1
		z.setBudowniczy(b3);
		z.stworz_gracza();
		g[2]=z.getGracz();
		Strona wybor=new Strona();
		Rozgrywka match=new Rozgrywka();
		
		do
		{
		System.out.println("Wybierz gracza:");
		for(int i=0;i<3;i++)
			System.out.println(i+". "+g[i].imie+" "+g[i].nazwisko);
		player=odczyt.nextInt();
		if(player<0 || player>2)
			System.out.println("Wybierz jeszcze raz.");
		}while(player<0 || player>2);
		
    	for(int i=0;i<ilosc_gier;i++)
        {
    		//Wybor papieru/kamienia/nozyc przez graczy
            wybor.Strona_pkn(this,g[player]);
            if(t.GetMin()<4)
            {
            	//Rozgrywka
                match.Rozgrywka_pkn(this,i,ilosc_gier,g[player]);
                System.out.print("Czas: ");
                t.GetTime();
                System.out.println("--------------------------------------------------------");
            }
            else
                break;
        }

        //Podsumowanie
        Podsumowanie po=new Podsumowanie();
        if(t.GetMin()<4)
        	po.pods(this, g[player]);
        else
        	po.pods_timeout(this,ilosc_gier);

    	System.out.print("Czas gry: ");
    	t.GetTime();
	}
}