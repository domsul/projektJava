package Projekt_zaliczeniowy.nowy;

import java.util.ArrayList;
import java.util.Random;

public class JednorekiBandyta implements Obserwowany{
	protected ArrayList<Obserwator> obserwatorzy;
	private int[] liczby;
	
	public JednorekiBandyta()
	{
		obserwatorzy=new ArrayList<Obserwator>();
		liczby=new int[]{0,0,0};
	}
	public void dodajObserwatora(Obserwator o)
	{
		obserwatorzy.add(o);
	}
	public void usunObserwatora(Obserwator o)
	{
		int indeks=obserwatorzy.indexOf(o);
		obserwatorzy.remove(indeks);
	}
	public void powiadomObserwatora()
	{
		for(Obserwator o : obserwatorzy)
			o.aktualizuj(liczby);
	}
	public void Losowanie()
	{
		Random los=new Random();
		for(int i=0;i<3;i++)
			liczby[i]=los.nextInt(7)+1;	//losowanie liczb z zakresu 1-7
		powiadomObserwatora();
	}
	public int[] get_Wyniki()
	{
		return liczby;
	}
}
