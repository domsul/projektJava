package Projekt_zaliczeniowy.nowy;

import java.util.Scanner;

public class Gry {
	Gry()
	{
		
	}
	void WybierzGre(int typ, Gracz gracz)
    {
		Menu m=new WyborGry();
		Scanner odczyt=new Scanner(System.in);
		Timer tm=new Timer();
		int wybor;
		
		wybor=5;
		//DEKORATOR
		switch(typ)
	    {
	    case 4:
	    	m=new Opcja4(m);
	    case 3:
	    	m=new Opcja3(m);
	    case 2:
	    	m=new Opcja2(m);
	    case 1:
	    	m=new Opcja1(m);
	    	break;
	    }
		while(wybor>typ || wybor<=0)
		{
			System.out.println(m.wyswietl());
		    wybor=odczyt.nextInt();
		}
		switch(wybor)
		{
		case 1:
			gracz.Gra1(tm);
			break;
		case 2:
			gracz.Gra2(tm);
			break;
		case 3:
			gracz.Gra3(tm);
			break;
		case 4:
			gracz.Gra4(tm);
			break;
		}
    }
}
