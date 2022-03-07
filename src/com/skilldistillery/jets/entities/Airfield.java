package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Airfield {
	Scanner kb = new Scanner(System.in);

	StarDestroyer star = new StarDestroyer();
	Transporter  trans = new Transporter();
	
	private List<Jet> fleet;

	public Airfield() {
		fleet = new ArrayList<>();
		loadJets("jets.txt");
	}

	public void listFleet() {

		for (Jet jet : fleet) {
			System.out.println(jet.toString());
		}

	}

	public void flyPlanes() {
		for (Jet jet : fleet) {
			System.out.println(jet.toString());
			jet.fly();
		}

	}

	public void fastestJet() {
		Jet zoom = fleet.get(0);
		for (Jet jet : fleet) {
			if (jet.getSpeed() > zoom.getSpeed()) {
				zoom = jet;
			}
		}

		System.out.println("The fastest Spacecraft is: " + zoom);
	}

	public void longestRange() {
		Jet zoom = fleet.get(0);
		for (Jet jet : fleet) {
			if (jet.getRange() > zoom.getRange()) {
				zoom = jet;
			}
		}
		System.out.println("The Spacecraft with the longest range is: " + zoom);
	}
	
	public void callInterface1() {
		for (Jet jet : fleet) {
			if (jet instanceof Transporter) {
				System.out.println(" The Spacecraft: " + jet.getModel()+ " is initiating loading"); 
				System.out.println();
				trans.movesColonies();
				System.out.println();
				
			}
		}
	}
	public void callInterface2() {
		for (Jet jet : fleet) {
			if (jet instanceof StarDestroyer) {
				System.out.println(" The Spacecraft: " + jet.getModel()+ " is about to froggy!"); 
				System.out.println();
				star.makesThingsDead();
				System.out.println();
			}
		}
	}
	
	public void addSpaceCraft() {
		try {
		System.out.println("Please enter a new Spacecraft: ");
		String model = kb.next();
		
		//kb.next();
		
		System.out.println("Please enter the speed(in MPH): ");
		int speed = kb.nextInt();
		
		System.out.println("Please enter the range: ");
		int range = kb.nextInt();
		
		System.out.println("Please enter the price: ");
		double price = kb.nextDouble();
		
		StarDestroyer userCraft = new StarDestroyer(model, speed, range, price);
		fleet.add(userCraft);
		}
		catch(Exception e) {
			System.out.println("Invalid entry! \n Murderous Leperchauns will find you in your sleep if you dont try again with a valid entry!");
	
		
		
	}
	}
			
public void removeSpaceCraft() {
	System.out.println("**********************************");
	System.out.println("*** Please choose a Spacecraft to be removed ***");
	int counter = 1;
	for (Jet jet : fleet) {
		System.out.println(counter + " " + jet.getModel());
		counter++;
		
		}
	int number = kb.nextInt();
	fleet.remove(number -1);
	
		System.out.println("Your selected Spacecraft has been removed from the fleet.");		
}	
			
			
		
	
	
	
	
	

	public void loadJets(String fn) {
		try (BufferedReader bufIn = new BufferedReader(new FileReader(fn))) {
			String line;
			while ((line = bufIn.readLine()) != null) {
				// split line commas appropriate jet
				String[] fields = line.split(",");
				// use items in fields array to construct new jet. add jet to fleet
				if (fields[0].equals("PassengerJet")) {
					PassengerJet pj = new PassengerJet(fields[1], Integer.valueOf(fields[2]),
							Integer.valueOf(fields[3]), Double.valueOf(fields[4]));
					fleet.add(pj);

				}
				if (fields[0].equals("StarDestroyer")) {
					StarDestroyer sd = new StarDestroyer(fields[1], Integer.parseInt(fields[2]),
							Integer.parseInt(fields[3]), Double.parseDouble(fields[4]));
					fleet.add(sd);

				}
				if (fields[0].equals("Transporter")) {
					Transporter tp = new Transporter(fields[1], Integer.parseInt(fields[2]),
							Integer.parseInt(fields[3]), Double.parseDouble(fields[4]));
					fleet.add(tp);

				}
			}
		} catch (IOException e) {
			System.err.println(e);
		}
	}
}
