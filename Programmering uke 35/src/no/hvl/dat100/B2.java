package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class B2 {

	public static void main(String[] args) {
		
		/*
		String prisTxt = showInputDialog("Pris:");
		String belopTxt = showInputDialog("Bel�p:");
		
		int pris = parseInt(prisTxt);
		int belop = parseInt(belopTxt);
		*/
		
		int pris = parseInt(showInputDialog("Pris:"));
		int belop = parseInt(showInputDialog("Bel�p:"));
		
		
		if (belop < pris) {
			showMessageDialog(null, "Bel�pet kan ikke v�re mindre enn prisen");
		}
		
		else {
			int rest = belop - pris;
			
			int antall10 = rest / 10;
			int antall1 = rest % 10;
			
			showMessageDialog(null, "Du f�r tilbake " + antall10 + "-tiere, og " + antall1 + "-enere.");
		}
	}

}
