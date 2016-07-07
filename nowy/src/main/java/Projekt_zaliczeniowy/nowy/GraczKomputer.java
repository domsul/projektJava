package Projekt_zaliczeniowy.nowy;

//dane gracza CPU
public class GraczKomputer {
	public String imie;
	public String nazwisko;
	public int strona;
	public int wygrana;
	public int przegrana;
	
	public void setImie(String i)
	{
		this.imie=i;
	}
	
	public void setNazwisko(String n)
	{
		this.nazwisko=n;
	}
	
	public void setStrona(int s)
	{
		this.strona=s;
	}
	
	public void setWygrana(int w)
	{
		this.wygrana=w;
	}
	
	public void setPrzegrana(int p)
	{
		this.przegrana=p;
	}
	
	public void pokaz_dane()
	{
		if(imie!=null)
			System.out.println("Imię: " +imie);
		if(nazwisko!=null)
			System.out.println("Nazwisko: " +nazwisko);
		if(strona==0 || strona==1)
			System.out.println("Strona: " +strona);
		if(wygrana>-1)
			System.out.println("Wygrana: " +wygrana);
		if(przegrana>-1)
			System.out.println("Przegrana: " +przegrana);
	}

}
