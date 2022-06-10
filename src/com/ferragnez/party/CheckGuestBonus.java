package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuestBonus {

	public static void main(String[] args) {
		
		// Lista invitati: Dua Lipa, Paris Hilton, Manuel Agnelli, J-Ax, Francesco Totti, 
		// Ilary Blasi, Bebe Vio, Luis, Pardis Zarei, Martina Maccherone, Rachel Zeilic
		
        Scanner scan = new Scanner(System.in);
		
		String[] listaInvitati = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
		
		String nomeInvitato;
		System.out.println("Ben arrivato, qual è il suo nome? ");
		nomeInvitato = scan.nextLine();
		
		boolean keepControl = true;
		int index = 0;
		
		while(keepControl && index < listaInvitati.length) {
			if(listaInvitati[index].equalsIgnoreCase(nomeInvitato)) {
				System.out.println("Trovato, la festa è da questa parte, si diverta!");
				keepControl = false;
			}else {
				index++;
			}
		}
		
		if(index == listaInvitati.length && keepControl) {
			System.out.println("Siamo spiacenti, ma lei non è nella lista. Devo chiederle di allontanarsi.");
		}
		

	}

}
