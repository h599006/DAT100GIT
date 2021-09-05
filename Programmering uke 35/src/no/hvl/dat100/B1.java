package no.hvl.dat100;

// Har modifisert programmet fra en av de valgfrie oppgavene
/*
import java.lang.Math.*;
import javax.swing.JOptionPane.*;
import java.lang.Integer.*;
*/

public class B1 {

	public static void main(String[] args) {
		
		String radiusTxt = javax.swing.JOptionPane.showInputDialog("Radius:");
		
		double radius = Double.parseDouble(radiusTxt);
		
		double volum = (4 * Math.PI * Math.pow(radius,3)) / 3;
		
		System.out.println(volum);
	}

}
