package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

public class B3 {

	public static void main(String[] args) {
		//a
		int antall = parseInt(showInputDialog("Antall ord: "));
		
		String[] ord = new String[antall];
		int teller = 0;
		
		while (teller != antall) {
			String i = showInputDialog("Ord: ");
			
			ord[teller] = i;
			teller++;
		}
		
		for (int i = 0; i < ord.length; i++) {
			System.out.println(ord[i]);
		}
		
		//b
		System.out.println("---------------------------");
		String gittOrd = showInputDialog("Gitt mønster");
		int antallOrdM = 0;
		for (int i = 0; i < ord.length; i++) {
			if (ord[i].contains(gittOrd) == true) {
				antallOrdM++;
			}
		}
		System.out.println("Antall ord med mønsteret: " + antallOrdM);
		
		//c
		System.out.println("---------------------------");
		for (int i = 0; i < ord.length; i++) {
			if (ord[i].length() == 1) {
				System.out.println(ord[i]);
			}
			if (ord[i].length() % 2 == 0) {
				int posisjonStart = ord[i].length() / 2 - 1;
				int posisjonSlutt = ord[i].length() / 2 + 1;
				System.out.println(ord[i].substring(posisjonStart, posisjonSlutt));
			}
			else if (ord[i].length() % 2 == 1 && ord[i].length() >= 3) {
				int posisjonStart = ord[i].length() / 2 - 1;
				int posisjonSlutt = ord[i].length() / 2 + 2;
				System.out.println(ord[i].substring(posisjonStart, posisjonSlutt));
			}
		}
		//d
		System.out.println("---------------------------");
		baklengs("Hei");
		
		//e
		System.out.println("---------------------------");
		System.out.println(forst(ord));
		
	}
	
	//d
	public static void baklengs(String s) {
		char[] tabell = s.toCharArray();
		
		for (int i = tabell.length; i > 0; i--) {
			System.out.print(tabell[i-1]);
		}
		System.out.println("");
	}
	
	//e
	public static String forst(String[] tabell) {
		
		String forste = tabell[0];
		
		for (int i = 1; i < tabell.length; i++) {
			
			if (tabell[i].compareTo(forste) < 0) {
				forste = tabell[i];
			}
		}
		return forste;
	}
}
