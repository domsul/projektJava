package Projekt_zaliczeniowy.nowy;

public class Podsumowanie {
	Podsumowanie()
	{
		
	}
	
	void pods(Gracz gracz)
	{
		System.out.print("\nKlasyfikacja: ");
		System.out.print("\nL.p.\tImi�\tNazwisko\tWygrana (z�)");
		System.out.print("\n1.\t" +gracz.imie+"\t" +gracz.nazwisko+"\t\t" +gracz.wygrana*gracz.stawka);
		System.out.print("\n1.\tPLAYER\tJEDEN\t\t" +gracz.wygrana_komp*gracz.stawka);
		
		if(gracz.wygrana>gracz.wygrana_komp)
		{
			System.out.println("\nWygrywa " +gracz.imie+" " +gracz.nazwisko);
			gracz.Reakcja(1);
		}
		if(gracz.wygrana==gracz.wygrana_komp)
		{
			System.out.println("\nRemis");
		}
		if(gracz.wygrana<gracz.wygrana_komp)
		{
			System.out.println("\nWygrywa komputer");
			gracz.Reakcja(0);
		}
	}
	
	void pods_timeout(Gracz gracz, int n)
	{
		System.out.print("\nKlasyfikacja: ");
		System.out.print("\nL.p.\tImi�\tNazwisko\tWygrana (zl)");
		System.out.print("\n1.\t" +gracz.imie+"\t" +gracz.nazwisko+"\t\t0");
		System.out.print("\n1.\tPLAYER\tJEDEN\t\t" +n*gracz.stawka);
		System.out.println("\nWygrywa komputer.");
		System.out.println("Pow�d: Przekroczony limit czasu gry.");
		gracz.Reakcja(0);
	}
}
