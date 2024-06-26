package org.lessons.java.animals;

public class Dog extends Animal{
	
	

	public Dog(String animalFood) {
		super(animalFood);
		
	}

	@Override
	public void animalVerse() {
		
		
		
	}

	@Override
	public void animalEat() {
		
		System.out.println("This animal eats: " + getAnimalFood());
		
	}

}
