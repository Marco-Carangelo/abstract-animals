package org.lessons.java.animals;

public class Eagle extends Animal implements FlyingInt{

	public Eagle(String animalFood, String animalSound) {
		super(animalFood, animalSound);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void animalVerse() {
		
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
