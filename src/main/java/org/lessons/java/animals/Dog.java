package org.lessons.java.animals;

public class Dog extends Animal{
	
	

	public Dog(String animalFood,String animalSound) {
		super(animalFood, animalSound);
		
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
