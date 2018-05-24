package geldwechsler;

import java.util.ArrayList;

public class Geldwechsler {
	int summe;
	int betrag;
	
	Münze m50 = new Münze(50, 4);
	Münze m20 = new Münze(20, 11);
	Münze m10 = new Münze(10, 6);
	Münze m5 = new Münze(5, 8);
	Münze m2 = new Münze(2, 23);
	Münze m1 = new Münze(1, 5);

	public Geldwechsler() {
	}

	public int rückgeld(int betrag, int summe) {
		int rückgeld = betrag - summe;
		return rückgeld;
	}

	public int wechselgeld(int rückgeld) {
		ArrayList<Münze> münzen = new ArrayList<>();
		münzen.add(m50);
		münzen.add(m20);
		münzen.add(m10);
		münzen.add(m5);
		münzen.add(m2);
		münzen.add(m1);
		
		for(int i=0;i <= münzen.size();i++) {
			if ((münzen.get(i)).getGröße() <= this.rückgeld(betrag, summe)){
				wechselgeld	= münzen.get(i);	//to-do --> wechselgeld deklarieren (ArrayList?)
				hilfsvariable = ((wechselgeld(i)).getAnzahl) - 1;	//to-do --> hilfsvariable deklarieren
				münzen(i).update(?);	//to-do --> update Funktion?	wert aus hilfsvariable in münzen(i)(Anzahl)
			}
		}
		return 0;
	}
}
