package Projekt_zaliczeniowy.nowy;

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
		if(re==1)
			System.out.println("izi");
		if(re==0)
			System.out.println("fart noobie");
	}
    
    void Gra2(Timer t)
	{
    	t.start();
    	wygrana=wygrana_komp=przegrana=przegrana_komp=0;
    	Strona wybor=new Strona();
    	Rozgrywka match=new Rozgrywka();
    	for(int i=0;i<ilosc_gier;i++)
        {
    		//Wybor papieru/kamienia/nozyc przez graczy
            wybor.Strona_pkn(this);
            if(t.GetMin()<4)
            {
            	//Rozgrywka
                match.Rozgrywka_pkn(this,i,ilosc_gier);
                System.out.print("Czas: ");
                t.GetTime();
            }
            else
                break;
        }

        //Podsumowanie
        Podsumowanie po=new Podsumowanie();
        if(t.GetMin()<4)
        	po.pods(this);
        else
        	po.pods_timeout(this,ilosc_gier);

    	System.out.print("Czas gry: ");
    	t.GetTime();
	}
}