package Projekt_zaliczeniowy.nowy;

import junit.framework.TestCase;

public class WyswietlaczTest extends TestCase{

	public void testPoinformuj() {
		int liczby[]=new int[3];
		int wygrana=0;
		
		//przykładowe losowanie - wariant, że wylosowano 7, 7, 7 (rzadka sytuacja)
		liczby[0]=7;
		liczby[1]=7;
		liczby[2]=7;
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
		assertEquals(1000000,wygrana);
		
		//przykładowe losowanie - wariant, że wylosowano 7, 7, 1
				liczby[0]=7;
				liczby[1]=7;
				liczby[2]=1;
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
				assertEquals(0,wygrana);
	}

}
