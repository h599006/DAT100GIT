package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class B4 {

	public static void main(String[] args) {
		
		double brutto = Double.parseDouble(showInputDialog("Bruttoinntekt:"));
		
		//String bruttoTxt = showInputDialog("Bruttoinntekt:");
		//double brutto = Double.parseDouble(bruttoTxt);
		
		double sats;
		double trinnskatt;
		
		if (brutto < 164100) {
			sats = 0.00;
		}
		else if (brutto < 230950) {
			sats = 0.017;
		}
		else if (brutto < 580650) {
			sats = 0.04;
		}
		else if ( brutto < 934050) {
			sats = 0.132;
		}
		else {
			sats = 0.162;
		}
		
		
		if (sats == 0) {
			trinnskatt = 0;
		}
		else {
			trinnskatt = brutto * sats;
		}
		
		showMessageDialog(null,"Din trinnskatt er på: " + Math.round(trinnskatt* 100.0) / 100.0);

	}

}
