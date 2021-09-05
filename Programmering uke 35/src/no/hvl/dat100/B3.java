package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class B3 {

	public static void main(String[] args) {
		
		String brukernavn = showInputDialog("Brukernavn :");

		String passord = showInputDialog("Passord :");

		System.out.println(brukernavn);
		System.out.println(passord);
		
		String riktigBrukernavn = "abc";
		String riktigPassord = "123";
		
		if (brukernavn.equals(riktigBrukernavn) && passord.equals(riktigPassord)) {
			showMessageDialog(null, "Du er nå logget inn!");
		}
		else {
			showMessageDialog(null, "Feil brukernavn eller passord!");
		}
	
	}

}