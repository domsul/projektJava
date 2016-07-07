package Projekt_zaliczeniowy.nowy;

//gracz 1
class Player1 extends Budowniczy{
	public void dodajImie()
	{
		gk.setImie("PLAYER");
	}
	
	public void dodajNazwisko()
	{
		gk.setNazwisko("JEDEN");
	}
	
	public void dodajStrone()
	{
		gk.setStrona(0);
	}
	
	public void dodajWygrane()
	{
		gk.setWygrana(0);
	}
	
	public void dodajPrzegrane()
	{
		gk.setPrzegrana(0);
	}

}
