package Projekt_zaliczeniowy.nowy;

public class Podsumowanie {
	Podsumowanie()
	{
		
	}
	
	void pods(Gracz gracz, GraczKomputer gk)
	{
		System.out.print("\nKlasyfikacja: ");
		System.out.print("\nL.p.\tImię\tNazwisko\tWygrana (zł)");
		System.out.print("\n1.\t" +gracz.imie+"\t" +gracz.nazwisko+"\t\t" +gracz.wygrana*gracz.stawka);
		System.out.print("\n2.\t" +gk.imie+"\t\t" +gk.nazwisko+"\t\t" +gk.wygrana*gracz.stawka+"\n");
		
		if(gracz.wygrana>gk.wygrana)
		{
			System.out.println("\nWygrywa " +gracz.imie+" " +gracz.nazwisko);
			gracz.Reakcja(1);
		}
		if(gracz.wygrana==gk.wygrana)
		{
			System.out.println("\nRemis");
		}
		if(gracz.wygrana<gk.wygrana)
		{
			System.out.println("\nWygrywa komputer");
			gracz.Reakcja(0);
		}
	}
	
	void pods_timeout(Gracz gracz, int n)
	{
		System.out.println("\nPRZEGRYWASZ!");
		System.out.println("Powód: Przekroczony limit czasu gry. " +n+" gier to za dużo jak dla Ciebie.");
		gracz.Reakcja(0);
	}
	
	void pods_jb(Gracz gracz)
	{
		System.out.print("\nKlasyfikacja: ");
		System.out.print("\nL.p.\tImię\tNazwisko\tWygrana (zł)");
		System.out.print("\n1.\t" +gracz.imie+"\t" +gracz.nazwisko+"\t\t" +gracz.wygrana);
		System.out.print("\nWygrałeś: " +gracz.wygrana+"zł.");
	}
}
