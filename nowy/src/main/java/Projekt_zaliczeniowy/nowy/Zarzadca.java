package Projekt_zaliczeniowy.nowy;

public class Zarzadca {
	private Budowniczy bob;
	
	public void setBudowniczy(Budowniczy b)
	{
		this.bob=b;
	}
	
	public GraczKomputer getGracz()
	{
		return bob.getGracz();
	}
	
	public void stworz_gracza()
	{
		bob.nowy_gracz();
		bob.dodajImie();
		bob.dodajNazwisko();
		bob.dodajStrone();
		bob.dodajWygrane();
		bob.dodajPrzegrane();
	}

}
