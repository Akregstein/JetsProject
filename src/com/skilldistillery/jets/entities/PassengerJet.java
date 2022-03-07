package com.skilldistillery.jets.entities;

public class PassengerJet extends Jet {

	@Override
	public void fly() {
		System.out.println("I fly people at a constant altitude and speed and it's great!");
		System.out.println("The " + getModel() + " max flight time before running out of fuel is: " + getRange() / getSpeed()+ " years. ");
	}
	

	public PassengerJet() {
		super();
			}

	public PassengerJet(String model, int speed, int range, double price) {
		super(model, speed, range, price);
	}
	
}
