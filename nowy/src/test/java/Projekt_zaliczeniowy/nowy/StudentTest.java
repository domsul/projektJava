package Projekt_zaliczeniowy.nowy;

import junit.framework.TestCase;

public class StudentTest extends TestCase {

	//sprawdza, czy budowniczy poprawnie buduje pod g[2] gracza Adam Kowalski
	public void testGra3() {
		String imie="Adam";
		String nazwisko="Kowalski";
		Zarzadca z=new Zarzadca(); //Budowniczy
		Budowniczy b1=new Player1(); //gracz 1
		Budowniczy b2=new Player2(); //gracz 2
		Budowniczy b3=new Player3(); //gracz 3
		GraczKomputer[] g=new GraczKomputer[3]; //tablica graczy
		//GRACZ 1
		z.setBudowniczy(b1);
		z.stworz_gracza();
		g[0]=z.getGracz();
		//GRACZ 2
		z.setBudowniczy(b2);
		z.stworz_gracza();
		g[1]=z.getGracz();
		//GRACZ 3
		z.setBudowniczy(b3);
		z.stworz_gracza();
		g[2]=z.getGracz();
    	
    	assertEquals(imie,g[2].imie);
    	assertEquals(nazwisko,g[2].nazwisko);
	}

}
