package org.lessons.java.animals;

public abstract class Animal {
	
	//Class fields
	
	private String animalFood;
	private String animalSound;
	private String animalName;
	
	//Constructor method
	
	public Animal(String animalFood, String animalSound,String animalName) {
		
		this.animalFood = animalFood;
		this.animalSound = animalSound;
		this.animalName = animalName;
		
	}
	
	//Getters and Setters
	
	public String getAnimalSound() {
		return animalSound;
	}

	public void setAnimalSound(String animalSound) {
		this.animalSound = animalSound;
	}

	public String getAnimalFood() {
		return animalFood;
	}


	public void setAnimalFood(String animalFood) {
		this.animalFood = animalFood;
	}

	public String getAnimalName() {
		return animalName;
	}

	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}
	
	//Class Methods
	
	

	public void animalSleep(){
		
		System.out.println("Zzz...");
		
	}
	
	//Class abstract Methods
	
	public abstract void animalVerse();
	public abstract void animalEat();
	
	

}
