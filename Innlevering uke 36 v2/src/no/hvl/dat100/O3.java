package no.hvl.dat100;

import static java.lang.Integer.parseInt;


public class O3 {
	public static int fakultet(int n) {
		if (n == 1) {
			return n;
		}
		return n * fakultet(n-1);
	}
	
	/* Går også an å skrive denne funksjonen om til en while-løkke med at den repeteres så lenge n > 1 og minker n-verdien for hver runde den går igjennom.
	
	int sum = tall;
	while (tall > 1) {
		sum *= (tall - 1);
		tall--;
	}
	System.out.println(sum);
	 */
	
	
	public static void main(String[] args) {
		
		while (true) {
			
			int tall =  parseInt(javax.swing.JOptionPane.showInputDialog("Gi et tall du vil fakultere:"));
			
			if (tall > 0) {
				javax.swing.JOptionPane.showMessageDialog(null, "Fakultet av " + tall + " er " + fakultet(tall));
				break;
			}
			else {
				javax.swing.JOptionPane.showMessageDialog(null, "Tallet må være større enn 0");
			}
		}

	}

}
