/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projekt_zaliczeniowy.nowy;

import java.util.Random;
import java.util.Scanner;

public class Gry {
	Gry()
	{
		
	}
	void WybierzGre(int typ, Gracz gracz)
    {
		Scanner odczyt=new Scanner(System.in);
		Timer tm=new Timer();
		int wybor;
		
		wybor=4;
		while(wybor>typ)
		{
			System.out.println("\nW kt�r� gr� chcesz zagra�?:\n");
		    switch(typ)
		    {
		    case 3:
		    	System.out.println("3. Polowanie na Jelenia");
		    case 2:
		    	System.out.println("2. Papier, kamie�, no�yce");
		    case 1:
		    	System.out.println("1. Orze� czy reszka");
		    	break;
		    }
		    wybor=odczyt.nextInt();
		}
		switch(wybor)
		{
		case 1:
			gracz.Gra1(tm);
			break;
		case 2:
			gracz.Gra2(tm);
			break;
		case 3:
			gracz.Gra3(tm);
			break;
		}
    }
}
