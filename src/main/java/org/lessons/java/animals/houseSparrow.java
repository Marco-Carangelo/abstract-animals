package org.lessons.java.animals;

public class houseSparrow extends Animal {

	public houseSparrow(String animalFood, String animalSound) {
		super(animalFood, animalSound);
		
	}

	@Override
	public void animalVerse() {
		
		System.out.println("The house sparrow verse is : " + getAnimalSound());
		
	}

	@Override
	public void animalEat() {
		
		System.out.println("The house sparrow eats: " + getAnimalFood());
		
	}

}
