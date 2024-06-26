package org.lessons.java.animals;

public class Dolphin extends Animal implements SwimInt{

	public Dolphin(String animalFood, String animalSound) {
		super(animalFood, animalSound);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void animalVerse() {
		
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
