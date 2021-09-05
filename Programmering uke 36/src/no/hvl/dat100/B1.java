package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;

public class B1 {

	public static void main(String[] args) {
		
		int nedre =  parseInt(showInputDialog("Skriv inn en nedre grense: "));
		int ovre =  parseInt(showInputDialog("Skriv inn en øvre grense: "));
		
		if (nedre % 2 == 0) {
			nedre += 1;
		}
		for (int i = nedre; i <= ovre; i+=2) {
			System.out.println(i);
		}

	}


}
