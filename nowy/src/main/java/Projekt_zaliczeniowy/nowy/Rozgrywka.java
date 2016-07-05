package Projekt_zaliczeniowy.nowy;

import java.util.Random;

public class Rozgrywka {
	int los; //co wylosowało
	
	Rozgrywka()
	{
		
	}
	
	public static int wylosuj_or() {
		Random rand=new Random();
		int los=rand.nextInt(10);
		
		if(los%2==1)
			return 1;	//reszka
		else
			return 0;	//orzeł
	}
	
	
	void Rozgrywka_or(Gracz gracz, int i, int n)
	{
		los=wylosuj_or();
		if(los==0)
			System.out.println("\n\nWylosowano orła");
		else
			System.out.println("\n\nWylosowano reszkę");
		System.out.print("\nStatystyki po "+i+" z "+n+" gier:");
		
		System.out.print("\nL.p.\tImię\t\tNazwisko\tW\tP\tObstawia");
		System.out.print("\n1.\t" +gracz.imie+"\t\t" +gracz.nazwisko+"\t\t" +gracz.wygrana+"\t" +gracz.przegrana+"\t");
		if(gracz.strona==0)
			System.out.print("orzeł");
		if(gracz.strona==1)
			System.out.print("reszka");
		System.out.print("\n2.\t PLAYER\t\tJEDEN\t\t" +gracz.wygrana_komp+"\t" +gracz.przegrana_komp+"\t");
		if(gracz.strona_komp==0)
			System.out.print("orzeł");
		if(gracz.strona_komp==1)
			System.out.print("reszka");
		if((gracz.strona==gracz.strona_komp)&&(gracz.strona==los))
		{
			System.out.println("\nWygrywa "+gracz.imie+" "+gracz.nazwisko);
			gracz.wygrana++;
			gracz.przegrana_komp++;
			gracz.Reakcja(1);
		}
		else if (gracz.strona==los)
		{
			System.out.println("\nWygrywa "+gracz.imie+" "+gracz.nazwisko);
			gracz.wygrana++;
			gracz.przegrana_komp++;
			gracz.Reakcja(1);
		}
		else if (gracz.strona_komp==los)
		{
			System.out.println("\nWygrywa komputer");
			gracz.wygrana_komp++;
			gracz.przegrana++;
			gracz.Reakcja(0);
		}
		else
		{
			System.out.println("\nNikt nie wygrywa.");
			gracz.przegrana++;
			gracz.przegrana_komp++;
			gracz.Reakcja(0);
		}
	}
	
	void Rozgrywka_pkn(Gracz gracz, int i, int n)
	{
		System.out.print("\nStatystyki po "+i+" z "+n+" gier:");
		
		System.out.print("\nL.p.\tImię\t\tNazwisko\tW\tP\tObstawia");
		System.out.print("\n1.\t" +gracz.imie+"\t\t" +gracz.nazwisko+"\t\t" +gracz.wygrana+"\t" +gracz.przegrana+"\t");
		if(gracz.strona==0)
			System.out.print("papier");
		if(gracz.strona==1)
			System.out.print("kamień");
		if(gracz.strona==2)
			System.out.print("nożyce");
		System.out.print("\n2.\t PLAYER\t\tJEDEN\t\t" +gracz.wygrana_komp+"\t" +gracz.przegrana_komp+"\t");
		if(gracz.strona_komp==0)
			System.out.print("papier");
		if(gracz.strona_komp==1)
			System.out.print("kamień");
		if(gracz.strona_komp==2)
			System.out.print("nożyce");
		if(gracz.strona==gracz.strona_komp)
		{
			System.out.println("\nNikt nie wygrywa.");
			gracz.przegrana++;
			gracz.przegrana_komp++;
		}
		if(((gracz.strona==0)&&(gracz.strona_komp==2))||((gracz.strona==1)&&(gracz.strona_komp==0))||((gracz.strona==2)&&(gracz.strona_komp==1)))
		{
			System.out.println("\nWygrywa komputer");
			gracz.przegrana++;
			gracz.wygrana_komp++;
			gracz.Reakcja(0);
		}
		if(((gracz.strona==0)&&(gracz.strona_komp==1))||((gracz.strona==1)&&(gracz.strona_komp==2))||((gracz.strona==2)&&(gracz.strona_komp==0)))
		{
			System.out.println("\nWygrywa "+gracz.imie+" "+gracz.nazwisko);
			gracz.wygrana++;
			gracz.przegrana_komp++;
			gracz.Reakcja(1);
		}
	}
	
	void Rozgrywka_jz(Gracz gracz, int i, int n)
	{
		System.out.print("\nStatystyki po "+i+" z "+n+" gier:");
		
		System.out.print("\nL.p.\tImię\t\tNazwisko\tPunkty\tObstawia");
		System.out.print("\n1.\t" +gracz.imie+"\t\t" +gracz.nazwisko+"\t\t" +gracz.wygrana+"\t");
		if(gracz.strona==0)
			System.out.print("jeleń");
		if(gracz.strona==1)
			System.out.print("zając");
		System.out.print("\n2.\t PLAYER\t\tJEDEN\t\t" +gracz.wygrana_komp+"\t");
		if(gracz.strona_komp==0)
			System.out.print("jeleń");
		if(gracz.strona_komp==1)
			System.out.print("zając");
		if((gracz.strona==gracz.strona_komp)&&(gracz.strona==0))
		{
			System.out.println("\nTY:CPU\n2:2");
			gracz.wygrana+=2;
			gracz.wygrana_komp+=2;
			gracz.Reakcja(1);
		}
		if((gracz.strona==gracz.strona_komp)&&(gracz.strona==1))
		{
			System.out.println("\nTY:CPU\n1:1");
			gracz.wygrana++;
			gracz.wygrana_komp++;
			gracz.Reakcja(1);
		}
		if((gracz.strona==0)&&(gracz.strona_komp==1))
		{
			System.out.println("\nTY:CPU\n0:1");
			gracz.wygrana_komp++;
			gracz.Reakcja(0);
		}
		if((gracz.strona==1)&&(gracz.strona_komp==0))
		{
			System.out.println("\nTY:CPU\n1:0");
			gracz.wygrana++;
			gracz.Reakcja(1);
		}
	}
}
