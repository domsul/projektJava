package Projekt_zaliczeniowy.nowy;

//obserwowany
public interface Obserwowany {
	public void dodajObserwatora(Obserwator o);
	public void usunObserwatora(Obserwator o);
	public void powiadomObserwatora();
}
