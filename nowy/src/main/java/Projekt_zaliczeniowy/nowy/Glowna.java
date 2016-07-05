package Projekt_zaliczeniowy.nowy;

import java.util.Scanner;

public class Glowna {
    public static void main(String[] args) 
    {
    	String nazwa1,nazwa11;
    	int stawka,typ,n=-1;
        Scanner odczyt = new Scanner(System.in);
        Gry nowa=new Gry();
        Timer t_main=new Timer();

        //inicjalizacja zegara
        t_main.start();
        
        //dane zawodnika
        System.out.println("Gracz 1:\nPodaj imię: ");
        nazwa1 = odczyt.nextLine();
        System.out.println("Podaj nazwisko: ");
        nazwa11 = odczyt.nextLine();
        System.out.println("Wybierz typ zawodnika:\n1 - Przedszkolak\n2 - Uczeń\n3 - Student");
        typ=odczyt.nextInt();
        
        //dane rozgrywki
        System.out.println("Podaj stawkę: ");
        stawka=odczyt.nextInt();
        
        while(n<=0)
        {
            System.out.println("Podaj ilość gier: ");
            n=odczyt.nextInt();
        }
        switch(typ)
        {
        case 1:
        	Przedszkolak p1=new Przedszkolak(nazwa1,nazwa11,stawka,n);
        	nowa.WybierzGre(typ,p1);
        	break;
        case 2:
        	Uczen u1=new Uczen(nazwa1,nazwa11,stawka,n);
        	nowa.WybierzGre(typ,u1);
        	break;
        case 3:
        	Student s1=new Student(nazwa1,nazwa11,stawka,n);
        	nowa.WybierzGre(typ,s1);
        	break;
        }
        
        //podsumowanie
        System.out.println("Czas pracy aplikacji: ");
        t_main.GetTime();
        
        odczyt.close();
        System.exit(0);
    }

}

