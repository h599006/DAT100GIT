package no.hvl.dat100.oppgaveb3;

public class MiniExcel {

	private static int[][] data = { 	
			{ 1, 2, 0 }, 
			{ 3, 4, 0 },
			{ 5, 6, 0 },
			{ 0, 0, 0 } 
			
	};

	public static void skrivUt() {

		System.out.println("---------------");

		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				System.out.print(data[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("---------------");
	}

	public static void beregnSum() {

		int sumRad = 0;
		int sumKolonne = 0;
		
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				if (j != data[i].length - 1) {
					sumRad += data[i][j];
				}
				else {
					data[i][j] = sumRad;
				}
			}
			sumRad = 0;
		}
		// for hver rad (med unntak av siste rad) summer elementene 
		// og skriv summen i den siste posisjonen for den aktuelle raden

		// TODO - START
		for (int i = 0; i < data[0].length - 1; i++) {
			for (int j = 0; j < data.length; j++) {
				if (j != data.length - 1) {
					sumKolonne += data[j][i];
					
				}
				else {
					data[j][i] = sumKolonne;
				}
			}
			sumKolonne = 0;
		}
		
		// for hver kolonne (med unntak av siste kolonne) summer elementene 
		// og skriv summen i siste rad i posisjonen svarende til den aktuelle kolonnen
		
		// TODO - END

	}

	public static void main(String args[]) {

		skrivUt();

		beregnSum();

		skrivUt();
	}
}
