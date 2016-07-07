package Projekt_zaliczeniowy.nowy;

import junit.framework.TestCase;

public class ProfesorTest extends TestCase {

	//sprawdza, czy nie wykonują się przypadkiem inne metody, czy automatycznie kończy grę po wygraniu pewnej kwoty
	public void testGra4() {
		Gracz g=new Profesor();
		int ilosc_gier=10,czas=2;
		Podsumowanie po=new Podsumowanie();
		boolean check=true;
		for(int i=0;i<2;i++)
		{
			czas+=i;
			g.wygrana=1000000000;
			if(g.wygrana>=1000000)
	        	System.out.println("Brak pieniędzy w kasie");
	        else if(czas<3)
	        {
	        	po.pods_jb(g);
	        	check=false;
	        }
	        else
	        {
	        	po.pods_timeout(g,ilosc_gier);
	        	check=false;
	        }
	        System.out.println("\n------------------------------------------------");
		}
		assertTrue(check);
	}

}
