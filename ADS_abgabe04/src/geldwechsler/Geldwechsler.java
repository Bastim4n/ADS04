package geldwechsler;

import java.util.ArrayList;

public class Geldwechsler {
	int summe;
	int betrag;
	
	M�nze m50 = new M�nze(50, 4);
	M�nze m20 = new M�nze(20, 11);
	M�nze m10 = new M�nze(10, 6);
	M�nze m5 = new M�nze(5, 8);
	M�nze m2 = new M�nze(2, 23);
	M�nze m1 = new M�nze(1, 5);

	public Geldwechsler() {
	}

	public int r�ckgeld(int betrag, int summe) {
		int r�ckgeld = betrag - summe;
		return r�ckgeld;
	}

	public int wechselgeld(int r�ckgeld) {
		ArrayList<M�nze> m�nzen = new ArrayList<>();
		m�nzen.add(m50);
		m�nzen.add(m20);
		m�nzen.add(m10);
		m�nzen.add(m5);
		m�nzen.add(m2);
		m�nzen.add(m1);
		
		for(int i=0;i <= m�nzen.size();i++) {
			if ((m�nzen.get(i)).getGr��e() <= this.r�ckgeld(betrag, summe)){
				wechselgeld	= m�nzen.get(i);	//to-do --> wechselgeld deklarieren (ArrayList?)
				hilfsvariable = ((wechselgeld(i)).getAnzahl) - 1;	//to-do --> hilfsvariable deklarieren
				m�nzen(i).update(?);	//to-do --> update Funktion?	wert aus hilfsvariable in m�nzen(i)(Anzahl)
			}
		}
		return 0;
	}
}
