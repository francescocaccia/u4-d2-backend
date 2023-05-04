package esercizioD2;

public class MainRettangolo {

	public static void main(String[] args) {
	//r ed f sono due istanze della classe rettangolo
		Rettangolo r = new Rettangolo(12.3, 34.5);
		Rettangolo f = new Rettangolo(34.5, 244.5);
		r.stampaRettangolo(r);
		f.stampaRettangolo(r);
	}
	
}
