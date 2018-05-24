package geldwechsler;

public class Münze {
	int größe;
	int anzahl;

	public Münze(int größe, int anzahl) {
		this.größe = größe;
		this.anzahl = anzahl;
	}

	public int getGröße() {
		return größe;
	}

	public int getAnzahl() {
		return anzahl;
	}

}
