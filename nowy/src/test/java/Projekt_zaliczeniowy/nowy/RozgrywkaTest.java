package Projekt_zaliczeniowy.nowy;

import junit.framework.TestCase;

public class RozgrywkaTest extends TestCase {

	//sprawdza, czy wynik przykładowej rywalizacji będzie wynosił 4:4
	public void testRozgrywka_jz() {
		Gracz gracz=new Przedszkolak();
		int i,n;
		GraczKomputer gk=new GraczKomputer();
		gracz.wygrana=0;
		gk.wygrana=0;
		for(i=0;i<4;i++)
		{
			if(i==0)
			{
				gracz.strona=0;
				gk.strona=0;
			}
			if(i==1)
			{
				gracz.strona=0;
				gk.strona=1;
			}
			if(i==2)
			{
				gracz.strona=1;
				gk.strona=0;
			}
			if(i==3)
			{
				gracz.strona=1;
				gk.strona=1;
			}
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
		assertNotSame("player",gracz.imie); //czy nie wyświetla standardowego imienia dla Gracza
		assertEquals(4,gracz.wygrana);
		assertEquals(4,gk.wygrana);
	}

}
