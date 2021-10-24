package no.hvl.dat100.oppgaveb1;

import java.io.*;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class LeseFraFil {

	static String MAPPE_STR = System.getProperty("user.dir") + "/src/no/hvl/dat100/oppgaveb1/";

	static public void main(String[] args) throws FileNotFoundException {
		
		int antallForsok = 3;
		int teller = 0;
		boolean filFunnet = false;
		
		while (teller < antallForsok && filFunnet != true) {
			try {
				String filnavn;

				filnavn = JOptionPane.showInputDialog("Filnavn i mappen " + MAPPE_STR);

				File file = new File(MAPPE_STR + filnavn);
				//Scanner reader = new Scanner(file);

				//int linenumber = 1;

				// les innhold i filen linje for linje
				String line;
				/*
				while (reader.hasNextLine()) {
					line = reader.nextLine();
					System.out.println(linenumber + " " + line);
					linenumber++;
				}
				*/
				BufferedReader in = new BufferedReader(new FileReader(file));
				
				while ((line = in.readLine()) != null) {
				    System.out.println(line);
				}
				
				in.close();
				//reader.close();
				
				filFunnet = true;
			}
			catch (FileNotFoundException e){
				JOptionPane.showMessageDialog(null, "Filen finnes ikke. \n" + e.getMessage());
				teller++;
			}
			catch (IOException e) {
				e.printStackTrace();
			}

			// JOptionPane.showMessageDialog(null, "Filen " + filnavn + " finnes
			// ikke. \n" + e.getMessage());
		}
		if (teller == antallForsok) {
			JOptionPane.showMessageDialog(null, "Antall forsøk brukt opp!");
		}
	}
		
}