package Projekt_zaliczeniowy.nowy;

//OPCJE DO WYBORU TYPU GRY
class OpcjaTyp1 extends Dekorator {
	Menu m;
	
	public OpcjaTyp1(Menu menu)
	{
		this.m=menu;
	}
	
	public String wyswietl()
	{
		return m.wyswietl()+"1 - Przedszkolak\n";
	}
	
}

class OpcjaTyp2 extends Dekorator {
	Menu m;
	
	public OpcjaTyp2(Menu menu)
	{
		this.m=menu;
	}
	
	public String wyswietl()
	{
		return m.wyswietl()+"2 - Uczeń\n";
	}
	
}

class OpcjaTyp3 extends Dekorator {
	Menu m;
	
	public OpcjaTyp3(Menu menu)
	{
		this.m=menu;
	}
	
	public String wyswietl()
	{
		return m.wyswietl()+"3 - Student\n";
	}
	
}

class OpcjaTyp4 extends Dekorator {
	Menu m;
	
	public OpcjaTyp4(Menu menu)
	{
		this.m=menu;
	}
	
	public String wyswietl()
	{
		return m.wyswietl()+"4 - Profesor";
	}
	
}
