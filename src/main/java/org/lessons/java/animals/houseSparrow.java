package org.lessons.java.animals;

public class houseSparrow extends Animal implements FlyingInt {

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

	@Override
	public void fly() {
		
		System.out.println("I'm flying!");
		
	}

}
