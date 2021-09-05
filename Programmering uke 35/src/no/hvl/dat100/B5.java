package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

public class B5 {

	public static void main(String[] args) {
		int poeng;
		
		for (int i = 0; i < 10; i ++) {
			
			while (true) {
				String poengTxt = showInputDialog("Antall poeng:");
				poeng = parseInt(poengTxt);
				
				if (poeng >= 0 && poeng <= 100) {
					break;
				}
				else {
					showMessageDialog(null,"Ugyldig poengsum");
				}
			}
			
			
			String karakter = "";
			
				if (poeng <= 39 ) {
					karakter = "F";
				}
				else if (poeng <= 49) {
					karakter = "E";
				}
				else if (poeng <= 59) {
					karakter = "D";
				}
				else if (poeng <= 79) {
					karakter = "C";
				}
				else if (poeng <= 89) {
					karakter = "B";
				}
				else if (poeng <= 100) {
					karakter = "A";
				}
				
				System.out.println(karakter);
				showMessageDialog(null,"Elevens karakter er: " + karakter);
		}
		

	}

}
