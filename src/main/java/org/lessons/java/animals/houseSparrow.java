package org.lessons.java.animals;

public class houseSparrow extends Animal {

	public houseSparrow(String animalFood, String animalSound) {
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
