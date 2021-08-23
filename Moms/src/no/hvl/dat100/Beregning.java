package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Beregning {

	public static void main(String[] args) {
		
		String belopTxt = showInputDialog("Hvor mye kostet det? ");
		double belop = Double.parseDouble(belopTxt);
		
		double moms;
		moms = belop * 0.25;
		double pris = belop + moms;
		
		/*
		System.out.format("%.3f", belop);
		System.out.format("%.3f", moms);
		System.out.format("%.3f", pris);
		*/
		
		String utTekst = "Beløp: " + belop + "\nMoms: " + moms + "\nPris: " + pris;
		
		showMessageDialog(null, utTekst);
	}

}
