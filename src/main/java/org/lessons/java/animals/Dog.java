package org.lessons.java.animals;

public class Dog extends Animal{
	
	

	public Dog(String animalFood,String animalSound,String animalName) {
		super(animalFood, animalSound, animalName);
		
	}

	@Override
	public void animalVerse() {
		
		System.out.println("The Dog sound is : " + getAnimalSound());
		
	}

	@Override
	public void animalEat() {
		
		System.out.println("The Dog eats: " + getAnimalFood());
		
	}

}
