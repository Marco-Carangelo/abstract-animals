package org.lessons.java.animals;

public class Eagle extends Animal {

	public Eagle(String animalFood, String animalSound) {
		super(animalFood, animalSound);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void animalVerse() {
		
		System.out.println("This animal verse is : " + getAnimalSound());
		
	}

	@Override
	public void animalEat() {
		
		System.out.println("This animal eats: " + getAnimalFood());
		
	}

}