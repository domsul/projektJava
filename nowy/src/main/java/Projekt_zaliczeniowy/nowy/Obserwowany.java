package Projekt_zaliczeniowy.nowy;

public interface Obserwowany {
	public void dodajObserwatora(Obserwator o);
	public void usunObserwatora(Obserwator o);
	public void powiadomObserwatora();
}
