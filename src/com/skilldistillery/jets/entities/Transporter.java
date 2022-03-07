package com.skilldistillery.jets.entities;

public class Transporter extends Jet implements PeopleMover {

	public Transporter() {
		super();

	}

	public Transporter(String model, int speed, int range, double price) {
		super( model, speed, range, price);

	}

	@Override
	public void fly() {
		System.out.println("The Transporter flies relatively slow transporting colonies of people between the galaxies ");
		System.out.println("The " + getModel() + " max flight time before running out of fuel is: " + getRange() / getSpeed() +" years. ");
		System.out.println();

	}

	public void movesColonies() {
		System.out.println("A civilization starter colony has been loaded");
	}
}
