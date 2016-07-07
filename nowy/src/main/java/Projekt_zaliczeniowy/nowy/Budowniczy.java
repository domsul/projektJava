package Projekt_zaliczeniowy.nowy;

//interfejs budowniczego
abstract class Budowniczy {
	protected GraczKomputer gk;
	
	public void nowy_gracz()
	{
		gk=new GraczKomputer();
	}
	
	public GraczKomputer getGracz()
	{
		return gk;
	}
	
	public abstract void dodajImie();
	public abstract void dodajNazwisko();
	public abstract void dodajStrone();
	public abstract void dodajWygrane();
	public abstract void dodajPrzegrane();

}
