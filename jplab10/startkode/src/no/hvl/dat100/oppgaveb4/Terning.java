package no.hvl.dat100.oppgaveb4;

import java.util.Random;

public class Terning {

	// aktuell verdi for terningen
	private int oyne;

	public Terning() {
		int[] antall = new int[7];
	}

	public int getOyne() {

		return oyne; // TODO
	}

	public void trill() {
		int maksKast = 100;
		int teller = 0;
		
		while (teller < maksKast) {
			Random tall = new Random();
			int kast = tall.nextInt(6) + 1;
			teller++;
		}

	}
}