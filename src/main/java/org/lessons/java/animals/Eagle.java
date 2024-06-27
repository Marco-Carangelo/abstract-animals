package org.lessons.java.animals;

public class Eagle extends Animal implements FlyingInt{

	public Eagle(String animalFood, String animalSound, String animalName) {
		super(animalFood, animalSound, animalName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void animalSound() {
		
		System.out.println("The eagle verse is : " + getAnimalSound());
		
	}

	@Override
	public void animalEat() {
		
		System.out.println("The eagle eats: " + getAnimalFood());
		
	}

	@Override
	public void fly() {
		
		System.out.println("I'm flying!");
		
	}

}
