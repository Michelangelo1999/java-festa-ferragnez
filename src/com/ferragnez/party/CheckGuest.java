package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

	public static void main(String[] args) {
		
		// Lista invitati: Dua Lipa, Paris Hilton, Manuel Agnelli, J-Ax, Francesco Totti, 
		// Ilary Blasi, Bebe Vio, Luis, Pardis Zarei, Martina Maccherone, Rachel Zeilic
		
		Scanner scan = new Scanner(System.in);
		
		String[] listaInvitati = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
		
		String nomeInvitato;
		System.out.println("Ben arrivato, qual è il suo nome? ");
		nomeInvitato = scan.nextLine();
		
		boolean checkFail = true;
		
		for(int i = 0; i < listaInvitati.length; i++) {
			if(listaInvitati[i].equalsIgnoreCase(nomeInvitato)) {
				System.out.println("Benvenuto/a, da questa parte, si goda la festa!");
				checkFail = false;
			}
		} 
		
		if(checkFail) {
     		System.out.println("Spiacente, ma il suo nome non è tra gli invitati. Devo chiederle gentilmente di allontanarsi.");
		}
		
		scan.close();
    }
}