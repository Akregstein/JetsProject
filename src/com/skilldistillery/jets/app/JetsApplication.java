package com.skilldistillery.jets.app;

import java.util.Scanner;

import com.skilldistillery.jets.entities.Airfield;
import com.skilldistillery.jets.entities.Jet;
import com.skilldistillery.jets.entities.PassengerJet;
import com.skilldistillery.jets.entities.StarDestroyer;
import com.skilldistillery.jets.entities.Transporter;

public class JetsApplication {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		boolean menu = true;
		
		Airfield airfield = new Airfield();
		StarDestroyer sd = new StarDestroyer();
		Transporter tp = new Transporter();
		PassengerJet pj = new PassengerJet();
		//Jet jets = new Jet();
			
		
		System.out.println("Welcome to the Universes finest intergalactic Fleet");
		while(menu) {
			System.out.println();
			System.out.println("**********************************");
			System.out.println("*** Please choose a numeric selection from menu ***");
			System.out.println("1. List fleet:");
			System.out.println("2. Fly all Jets:");
			System.out.println("3. View fastest jet:");
			System.out.println("4. View jet with longest range:");
			System.out.println("5. Load all Cargo Jets:");
			System.out.println("6. Dogfight:");
			System.out.println("7. Add jet to Fleet");
			System.out.println("8. Remove a jet from Fleet:");
			System.out.println("9. Quit");
			System.out.println("**********************************");
			int selection = kb.nextInt();
			
			if(selection == 9) {
				System.out.println("Bon Voyage fellow galaxy cruiser!");
				menu = false;
			}
			
			if(selection == 1) {
				airfield.listFleet();
			}
				if(selection == 2) {
				airfield.flyPlanes();
					
				
				}
				
				
				
				
				}
////					
	}
}

