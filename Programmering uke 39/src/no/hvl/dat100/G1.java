package no.hvl.dat100;

public class G1 {

	public static void main(String[] args) {

    double[][] obs = {
    				{1.4,1.7,1.9,2.0},
    				{5.4,7.8,9.8,7.9,3.0},
    				{-1.7,-1.7,-2.8}
    		};

    // TODO - legg til metodekall her
    	skrivUt(obs);
    	
    	System.out.println("-------------");
    	
    	System.out.println(obs.length); //Skriver ut tre fordi det er 3 elementer, men de 3 elementene har andre elementer i seg
    	System.out.println(obs[0].length); //Skriver ut lengden av tabellen som ligger på indeks 0 osv.
    	System.out.println(obs[1].length);
    	System.out.println(obs[2].length);
    	
    	System.out.println(finnes(obs, 2));
    	
    	bytte(obs, 0 ,2);
    	skrivUt(obs);
	}

  // TODO - legg til deklarasjon av metoder her
	
	public static void skrivUt(double[][] tabell) {
		/*
		for (int i = 0; i < tabell.length; i++) {
			for (int j = 0; j < tabell[i].length; j++) {
				System.out.print(tabell[i][j] + ", ");
			}
		}
		*/
		for (double[] rad : tabell) {
			for (double v : rad) {
				System.out.print(v + ", ");
			}
			System.out.println("");
		}
	}
	
	public static boolean finnes(double[][] obs, double limit) {
		
		boolean finnes = false;
		
		for (double[] rad : obs) {
			for (double v : rad) {
				if (v > limit) {
					finnes = true;
				}
			}
		}
		
		return finnes;
	}
	
	public static void bytte(double[][]tabell, int k, int l) {
		double[] temp = tabell[k];
		tabell[k] = tabell[l];
		tabell[l] = temp;
	}
}