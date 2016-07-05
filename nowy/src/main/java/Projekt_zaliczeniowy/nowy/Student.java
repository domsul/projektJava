package Projekt_zaliczeniowy.nowy;

public class Student extends Uczen{
	Student() 
    {
            imie="stu";
            nazwisko="dent";
            stawka=0;
    }
	
	Student(String i, String n, int s, int ilosc)
	{
		imie=i;
		nazwisko=n;
		stawka=s;
		typ=3;
		ilosc_gier=ilosc;
	}
	
	void Reakcja(int re)
	{
		if(re==1)
			System.out.println("AAAAAA pijemy!");
		if(re==0)
			System.out.println("Kurna, no nie!");
	}
    
    void Gra3(Timer t)
	{
    	t.start();
    	wygrana=wygrana_komp=przegrana=przegrana_komp=0;
    	Strona wybor=new Strona();
    	Rozgrywka match=new Rozgrywka();
    	for(int i=0;i<ilosc_gier;i++)
        {
    		//Wybor jelenia/zajaca przez graczy
            wybor.Strona_jz(this);
            if(t.GetMin()<6)
            {
            	//Rozgrywka
                match.Rozgrywka_jz(this,i,ilosc_gier);
                System.out.print("Czas: ");
                t.GetTime();
            }
            else
                break;
        }

        //Podsumowanie
        Podsumowanie po=new Podsumowanie();
        if(t.GetMin()<6)
        	po.pods(this);
        else
        	po.pods_timeout(this,ilosc_gier);
        System.out.print("Czas gry: ");
    	t.GetTime();
	}
}