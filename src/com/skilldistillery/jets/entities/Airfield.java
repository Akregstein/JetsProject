package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Airfield {

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
			jet.fly();
		}

	}
	public void fastestJet() {
		Jet zoom = fleet.get(0);
		for (Jet jet : fleet) {
			if(jet.getSpeed() > zoom.getSpeed()) {
				zoom = jet;
			}
		}
		System.out.println("The fastest Spacecraft is: " + zoom);
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
