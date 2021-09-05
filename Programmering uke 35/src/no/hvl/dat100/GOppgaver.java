package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class GOppgaver {

	public static void main(String[] args) {
		//G1
		int a;
		int b;
		
		a = 5;
		b = 7;
		
		System.out.println(a);
		System.out.println(b);
		
		//boolean a;
		//Gir feilmelding fordi heltall kan ikke bli gjort om til en true/false verdi.
		
		//G2
		int c;
		c = a + b;
		
		System.out.println(c);
		
		//G3
		String aTxt = showInputDialog("A: ");
		String bTxt = showInputDialog("B: ");
		
		a = Integer.parseInt(aTxt);
		b = Integer.parseInt(bTxt);
		
		if (b == 0) {
			showMessageDialog(null, "Det går ikke an å dele på 0");
		}
		else { 
			int dele = a/b; 
			
			String deleTxt = Integer.toString(dele);
			showMessageDialog(null, deleTxt);
		}

	}

}
