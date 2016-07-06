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
	
	
	void Rozgrywka_or(Gracz gracz, int i, int n, GraczKomputer gk)
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
		System.out.print("\n2.\t" +gk.imie+"\t\t" +gk.nazwisko+"\t\t" +gk.wygrana+"\t" +gk.przegrana+"\t");
		if(gk.strona==0)
			System.out.print("orzeł");
		if(gk.strona==1)
			System.out.print("reszka");
		if((gracz.strona==gk.strona)&&(gracz.strona==los))
		{
			System.out.println("\nWygrywa "+gracz.imie+" "+gracz.nazwisko);
			gracz.wygrana++;
			gk.przegrana++;
			gracz.Reakcja(1);
		}
		else if (gracz.strona==los)
		{
			System.out.println("\nWygrywa "+gracz.imie+" "+gracz.nazwisko);
			gracz.wygrana++;
			gk.przegrana++;
			gracz.Reakcja(1);
		}
		else if (gk.strona==los)
		{
			System.out.println("\nWygrywa "+gk.imie+" "+gk.nazwisko);
			gk.wygrana++;
			gracz.przegrana++;
			gracz.Reakcja(0);
		}
		else
		{
			System.out.println("\nNikt nie wygrywa.");
			gracz.przegrana++;
			gk.przegrana++;
			gracz.Reakcja(0);
		}
	}
	
	void Rozgrywka_pkn(Gracz gracz, int i, int n, GraczKomputer gk)
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
		System.out.print("\n2.\t" +gk.imie+"\t\t" +gk.nazwisko+"\t\t" +gk.wygrana+"\t" +gk.przegrana+"\t");
		if(gk.strona==0)
			System.out.print("papier");
		if(gk.strona==1)
			System.out.print("kamień");
		if(gk.strona==2)
			System.out.print("nożyce");
		if(gracz.strona==gk.strona)
		{
			System.out.println("\nNikt nie wygrywa.");
			gracz.przegrana++;
			gk.przegrana++;
		}
		if(((gracz.strona==0)&&(gk.strona==2))||((gracz.strona==1)&&(gk.strona==0))||((gracz.strona==2)&&(gk.strona==1)))
		{
			System.out.println("\nWygrywa "+gk.imie+" "+gk.nazwisko);
			gracz.przegrana++;
			gk.wygrana++;
			gracz.Reakcja(0);
		}
		if(((gracz.strona==0)&&(gk.strona==1))||((gracz.strona==1)&&(gk.strona==2))||((gracz.strona==2)&&(gk.strona==0)))
		{
			System.out.println("\nWygrywa "+gracz.imie+" "+gracz.nazwisko);
			gracz.wygrana++;
			gk.przegrana++;
			gracz.Reakcja(1);
		}
	}
	
	void Rozgrywka_jz(Gracz gracz, int i, int n, GraczKomputer gk)
	{
		System.out.print("\nStatystyki po "+i+" z "+n+" gier:");
		
		System.out.print("\nL.p.\tImię\t\tNazwisko\tPunkty\tObstawia");
		System.out.print("\n1.\t" +gracz.imie+"\t\t" +gracz.nazwisko+"\t\t" +gracz.wygrana+"\t" +gracz.przegrana+"\t");
		if(gracz.strona==0)
			System.out.print("jeleń");
		if(gracz.strona==1)
			System.out.print("zając");
		System.out.print("\n2.\t" +gk.imie+"\t\t" +gk.nazwisko+"\t\t" +gk.wygrana+"\t" +gk.przegrana+"\t");
		if(gk.strona==0)
			System.out.print("jeleń");
		if(gk.strona==1)
			System.out.print("zając");
		if((gracz.strona==gk.strona)&&(gracz.strona==0))
		{
			System.out.println("\nTY:CPU\n2:2");
			gracz.wygrana+=2;
			gk.wygrana+=2;
			gracz.Reakcja(1);
		}
		if((gracz.strona==gk.strona)&&(gracz.strona==1))
		{
			System.out.println("\nTY:CPU\n1:1");
			gracz.wygrana++;
			gk.wygrana++;
			gracz.Reakcja(1);
		}
		if((gracz.strona==0)&&(gk.strona==1))
		{
			System.out.println("\nTY:CPU\n0:1");
			gk.wygrana++;
			gracz.Reakcja(0);
		}
		if((gracz.strona==1)&&(gk.strona==0))
		{
			System.out.println("\nTY:CPU\n1:0");
			gracz.wygrana++;
			gracz.Reakcja(1);
		}
	}
	
	void Rozgrywka_jb(Gracz gracz, int i, int n, JednorekiBandyta jb, Wyswietlacz w)
	{
		int wygrana_w_rundzie=0;
		System.out.print("\nStatystyki po "+i+" z "+n+" gier:");
		
		System.out.print("\nL.p.\tImię\t\tNazwisko\tWygrana(zł)\tObstawia(zł)");
		System.out.print("\n1.\t" +gracz.imie+"\t\t" +gracz.nazwisko+"\t\t" +gracz.wygrana+"\t\t" +gracz.stawka+"\t");
		jb.Losowanie();
		System.out.println("\n\nLosowanie:");
		wygrana_w_rundzie=w.poinformuj()*gracz.stawka;
		gracz.wygrana+=wygrana_w_rundzie;
		System.out.println("Wygrywasz "+wygrana_w_rundzie+"zl.\n");
		if(wygrana_w_rundzie==0)
			gracz.Reakcja(0);
		else
			gracz.Reakcja(1);
	}
}
