package org.lessons.java.animals;

public abstract class Animal {
	
	//Class fields
	
	private String animalFood;
	
	//Constructor method
	

	public Animal(String animalFood) {
		
		this.animalFood = animalFood;
		
	}
	
	//Getters and Setters
	
	public String getAnimalFood() {
		return animalFood;
	}


	public void setAnimalFood(String animalFood) {
		this.animalFood = animalFood;
	}

	
	
	//Class Methods
	
	public void animalSleep(){
		
		System.out.println("Zzz...");
		
	}
	
	//Class abstract Methods
	
	public abstract void animalVerse();
	public abstract void animalEat();
	
	

}
