package Projekt_zaliczeniowy.nowy;

import java.util.Scanner;

import junit.framework.TestCase;

public class GlownaTest extends TestCase {

	//sprawdza, czy wartość Stringa check jest zgodna z tym, co ma wyświetlać menu
	public void testMain() {
		String check="Wybierz typ zawodnika:\n1 - Przedszkolak\n2 - Uczeń\n3 - Student\n4 - Profesor";
		Menu m=new WyborTypu();
		
		m=new OpcjaTyp4(new OpcjaTyp3(new OpcjaTyp2(new OpcjaTyp1(m))));
		assertEquals(check,m.wyswietl());
	}

}
