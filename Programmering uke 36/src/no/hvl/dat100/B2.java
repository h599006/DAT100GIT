package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

public class B2 {

	public static void main(String[] args) {
		
		double x = Double.parseDouble(showInputDialog("x:"));
		int n = parseInt(showInputDialog("n: "));
		
		double losning1 = Math.pow(x, n);
		double losning2 = 1.0;
		
		while (n != 0) {
			losning2 *= x;
			n -= 1;
		}
		
		showMessageDialog(null, "Løsning 1 (mattebibliotek) gir: " + losning1 + " og løsning 2 (løkke) gir: " + losning2);
		System.out.println(losning1);
		System.out.println(losning2);
	}

}
