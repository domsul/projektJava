package Projekt_zaliczeniowy.nowy;

//OPCJE DO WYBORU GRY
class Opcja1 extends Dekorator {
	Menu m;
	
	public Opcja1(Menu menu)
	{
		this.m=menu;
	}
	
	public String wyswietl()
	{
		return m.wyswietl()+"1. Orzeł czy reszka\n";
	}
	
}

class Opcja2 extends Dekorator {
	Menu m;
	
	public Opcja2(Menu menu)
	{
		this.m=menu;
	}
	
	public String wyswietl()
	{
		return m.wyswietl()+"2. Papier, kamień, nożyce\n";
	}
	
}

class Opcja3 extends Dekorator {
	Menu m;
	
	public Opcja3(Menu menu)
	{
		this.m=menu;
	}
	
	public String wyswietl()
	{
		return m.wyswietl()+"3. Polowanie na Jelenia\n";
	}
	
}

class Opcja4 extends Dekorator {
	Menu m;
	
	public Opcja4(Menu menu)
	{
		this.m=menu;
	}
	
	public String wyswietl()
	{
		return m.wyswietl()+"4. Jednoręki Bandyta\n";
	}
	
}