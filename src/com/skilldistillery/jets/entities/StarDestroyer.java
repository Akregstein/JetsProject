package com.skilldistillery.jets.entities;

public class StarDestroyer extends Jet implements ViolenceInitiator {

	// Airfield airfield = new Airfield(); @Override
	public void fly() {
		System.out.println(
				"The Star Destroyer can Fly very Fast and make quick manuevers. \n Sounds like \"Brrraaaat Brrrrattt Vroom vrooom\"");
		System.out.println(
				"The " + getModel() + " max flight time before running out of fuel is: " + getRange() / getSpeed() + " years. ");
		System.out.println();
	}

	public StarDestroyer() {
		super();
	}

	public StarDestroyer(String model, int speed, int range, double price) {
		super(model, speed, range, price);
	}

	public void makesThingsDead() {
		System.out.println("Aim, Shoot, Fire \"KABOOM!\"");

	}
}
