package Projekt_zaliczeniowy.nowy;

import java.util.Random;
import java.util.Scanner;

public class Strona {
	boolean check=false; //false = bezbledny odczyt
	
	Strona()
	{
		
	}
	
	public static int wylosuj_or() {
		Random rand=new Random();
		int los=rand.nextInt(10);
		
		if(los%2==1)
			return 1;	//reszka || jelen
		else
			return 0;	//orzel || zajac
	}
	
	void Strona_or(Gracz gracz)
	{
		Scanner odczyt = new Scanner(System.in);
		
		gracz.strona_komp=wylosuj_or();	//losuje komputer
		
		//wybor strony monety przez gracza
		do
		{
			check=false;
			System.out.println("\nWybierz stronę: \n0 - orzeł\n1 - reszka");
			gracz.strona=odczyt.nextInt();
			
			System.out.print("\n" +gracz.imie+" " +gracz.nazwisko+": Wybrałeś");
			switch(gracz.strona)
			{
			case 0:
				System.out.print(" orła.");
				break;
			case 1:
				System.out.print(" reszkę.");
				break;
			default:
				System.out.print(" wartość niepoprawną. Musisz wybrać ponownie.");
				check=true;
			}
		}while(check==true);
		System.out.print("\nKomputer wybiera ");
		switch(gracz.strona_komp)
		{
		case 0:
			System.out.print(" orła.");
			break;
		case 1:
			System.out.print(" reszkę.");
			break;
		}
	}
	
	public static int wylosuj_pkn() {
		Random rand=new Random();
		int los=rand.nextInt(10);
		
		if(los%3==0)
			return 0;	//papier
		if(los%3==1)
			return 1;	//kamien
		else
			return 2;	//nozyce
	}
	
	void Strona_pkn(Gracz gracz)
	{
		Scanner odczyt = new Scanner(System.in);
		
		gracz.strona_komp=wylosuj_pkn();	//losuje komputer
		
		//wybor przez gracza
		do
		{
			check=false;
			System.out.println("\nWybierz stronę: \n0 - papier\n1 - kamień\n2 - nożyce");
			gracz.strona=odczyt.nextInt();
			
			System.out.print("\n" +gracz.imie+" " +gracz.nazwisko+": Wybrałeś");
			switch(gracz.strona)
			{
			case 0:
				System.out.print(" papier.");
				break;
			case 1:
				System.out.print(" kamień.");
				break;
            case 2:
				System.out.print(" nożyce.");
				break;
			default:
				System.out.print(" wartość niepoprawną. Musisz wybrać ponownie.");
				check=true;
			}
		}while(check==true);
	}
	
	void Strona_jz(Gracz gracz)
	{
		Scanner odczyt = new Scanner(System.in);
		
		gracz.strona_komp=wylosuj_or();	//losuje komputer
		
		//wybor przez gracza
		do
		{
			check=false;
			System.out.println("\nWybierz stronę: \n0 - jeleń\n1 - zając");
			gracz.strona=odczyt.nextInt();
			
			System.out.print("\n" +gracz.imie+" " +gracz.nazwisko+": Wybrałeś");
			switch(gracz.strona)
			{
			case 0:
				System.out.print(" jelenia.");
				break;
			case 1:
				System.out.print(" zająca.");
				break;
			default:
				System.out.print(" wartość niepoprawną. Musisz wybrać ponownie.");
				check=true;
			}
		}while(check==true);
	}
}
