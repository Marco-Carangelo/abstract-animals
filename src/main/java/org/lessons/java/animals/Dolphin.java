package org.lessons.java.animals;

public class Dolphin extends Animal implements SwimInt{

	public Dolphin(String animalFood, String animalSound, String animalName) {
		super(animalFood, animalSound, animalName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void animalSound() {
		
		System.out.println("The dolphin verse is : " + getAnimalSound());
		
	}

	@Override
	public void animalEat() {
		
		System.out.println("The dolphin eats: " + getAnimalFood());
		
	}

	@Override
	public void swim() {
		
		System.out.println("I'm swimming!");
		
	}

}
