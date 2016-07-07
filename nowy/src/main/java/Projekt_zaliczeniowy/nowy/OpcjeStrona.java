package Projekt_zaliczeniowy.nowy;

//OPCJE DO WYBORU JEDNEJ Z MOŻLIWOŚCI
class Opcja_orzel extends Dekorator {
	Menu m;
	
	public Opcja_orzel(Menu menu)
	{
		this.m=menu;
	}
	
	public String wyswietl()
	{
		return m.wyswietl()+"0 - orzeł\n";
	}
	
}

class Opcja_reszka extends Dekorator {
	Menu m;
	
	public Opcja_reszka(Menu menu)
	{
		this.m=menu;
	}
	
	public String wyswietl()
	{
		return m.wyswietl()+"1 - reszka\n";
	}
	
}

class Opcja_papier extends Dekorator {
	Menu m;
	
	public Opcja_papier(Menu menu)
	{
		this.m=menu;
	}
	
	public String wyswietl()
	{
		return m.wyswietl()+"0 - papier\n";
	}
	
}

class Opcja_kamien extends Dekorator {
	Menu m;
	
	public Opcja_kamien(Menu menu)
	{
		this.m=menu;
	}
	
	public String wyswietl()
	{
		return m.wyswietl()+"1 - kamień\n";
	}
	
}

class Opcja_nozyce extends Dekorator {
	Menu m;
	
	public Opcja_nozyce(Menu menu)
	{
		this.m=menu;
	}
	
	public String wyswietl()
	{
		return m.wyswietl()+"2 - nożyce";
	}
	
}

class Opcja_jelen extends Dekorator {
	Menu m;
	
	public Opcja_jelen(Menu menu)
	{
		this.m=menu;
	}
	
	public String wyswietl()
	{
		return m.wyswietl()+"0 - jeleń\n";
	}
	
}

class Opcja_zajac extends Dekorator {
	Menu m;
	
	public Opcja_zajac(Menu menu)
	{
		this.m=menu;
	}
	
	public String wyswietl()
	{
		return m.wyswietl()+"1 - zając";
	}
	
}
