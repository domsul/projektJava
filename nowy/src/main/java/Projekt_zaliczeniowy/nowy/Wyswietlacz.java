package Projekt_zaliczeniowy.nowy;

//obserwuje wyniki
public class Wyswietlacz implements Obserwator, Publikuj{
	private int[] liczby;
	private JednorekiBandyta jb;
	
	public Wyswietlacz(JednorekiBandyta jb)
	{
		liczby=new int[3];
		this.jb=jb;
	}
	public void aktualizuj(int[] tablica)
	{
		for(int i=0;i<3;i++)
			liczby[i]=tablica[i];
	}
	public int poinformuj()
	{
		int wygrana=0;
		
		System.out.println("Wylosowano: ");
		for(int i:liczby)
			System.out.print(i+", ");
		System.out.print("\n");
		if(liczby[0]==7 && liczby[1]==7 && liczby[2]==7)
		{
			System.out.println("ROZBIŁEŚ BANK!");
			wygrana=1000000;
		}
		else
		{
			for(int i=0;i<3;i++)
			{
				if(liczby[i]==4)
					wygrana+=1;
				if(liczby[i]==5)
					wygrana+=5;
				if(liczby[i]==6)
					wygrana+=10;
				if(liczby[i]==7)
					wygrana+=100;
			}
			if(liczby[0]==1 || liczby[1]==1 || liczby[2]==1 || liczby[0]==2 || liczby[1]==2 || liczby[2]==2)
				wygrana=0;
		}
		
		return wygrana;
	}
	public void koniecgry()
	{
		jb.usunObserwatora(this);
	}
}
