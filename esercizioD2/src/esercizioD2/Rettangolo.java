package esercizioD2;

public class Rettangolo {
	// Attributi
	private double larghezza;
	private double altezza;

	// Costruttore serve a creare un istanza di un oggetto
	public Rettangolo(double larghezza, double altezza) {

		this.larghezza = larghezza;
		this.altezza = altezza;
	}

	// Metodi
	private double calcolaPerimetro() {

		return (larghezza + altezza) * 2;
	}

	private double calcolaArea() {

		return larghezza * altezza;
	}
	
	public void stampaRettangolo(Rettangolo stampaR) {
		
		System.out.println("questa è l'area del rettangolo:" + stampaR.calcolaArea());
		System.out.println("questa è il perimetro del rettangolo:" + stampaR.calcolaPerimetro());
	
	}
	public void stampaDueRettangoli( Rettangolo uno, Rettangolo due) {
		System.out.println(uno.calcolaPerimetro() + "perimetro primo rettangolo");
		System.out.println(uno.calcolaArea() + "area primo rettangolo");
		System.out.println(due.calcolaPerimetro() + "perimetro secondo rettangolo");
		System.out.println(due.calcolaArea() + "area secondo rettangolo");
		System.out.println(uno.calcolaPerimetro() + due.calcolaPerimetro() + "somma perimetri dei rettangoli");
		System.out.println(due.calcolaArea() + uno.calcolaArea() + "somma aree dei rettangoli");
	}
}
