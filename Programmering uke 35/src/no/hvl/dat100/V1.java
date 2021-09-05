package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

public class V1 {

	public static void main(String[] args) {
		
		int a =  parseInt(showInputDialog("Gi et tall:"));
		int b =  parseInt(showInputDialog("Gi et tall til:"));
		int c =  parseInt(showInputDialog("Gi enda et tall:"));
		
		int minste1 = 0;
		int minste2 = 0;
		
		if (a < b && a < c) {
			 minste1 = a;
		}
		if (b < a && b < c) {
			minste1 = b;
		}
		if (c < a && c < b) {
			minste1 = c;
		}
		showMessageDialog(null,"Minste tall for første løkke: " + minste1);
		
		
		if (a < b && a < c) {
			 minste2 = a;
		}
		else if (b < a && b < c) {
			minste2 = b;
		}
		else if (c < a && c < b) {
			minste2 = c;
		}
		showMessageDialog(null,"Minste tall for andre løkke: " + minste2);
	}

}
