package org.lessons.java.animals;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		//Initialize a scanner to acquire date from user
		
		Scanner scanner = new Scanner(System.in);
	
		//Initialize an Animal array of ten position
		
		Animal animals[] = new Animal[4];
		
		//Populate the Array with the four different instances of the Animal children classes
		
		Dog doggo = new Dog("Kibbles","Woof woof");
		animals[0] = doggo;
		
		houseSparrow titti = new houseSparrow("seeds","Cheep");
		animals[1] = titti;
		
		Eagle umberto = new Eagle("meat","SCREEEE");
		animals[2] = umberto;
		
		Dolphin giacinto = new Dolphin("fish","eEeEeEeEeEeEeEeEeEeE");
		animals[3] = giacinto;
		
		//All the methods for all the animals
		
		for (Animal anml:animals) {
			
			anml.animalSleep();
			anml.animalEat();
			anml.animalVerse();
		}
	
	}
	
	public void letFly(FlyingInt animal) {
		
		animal.fly();
		
	}
	
	public void letSwim(SwimInt animal) {
		
		animal.swim();
		
	}
}
