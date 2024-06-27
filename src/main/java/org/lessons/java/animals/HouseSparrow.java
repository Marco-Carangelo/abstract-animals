package org.lessons.java.animals;

public class HouseSparrow extends Animal implements FlyingInt {

	public HouseSparrow(String animalFood, String animalSound, String animalName) {
		super(animalFood, animalSound, animalName);
		
	}

	@Override
	public void animalSound() {
		
		System.out.println("The house sparrow sound is : " + getAnimalSound());
		
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
