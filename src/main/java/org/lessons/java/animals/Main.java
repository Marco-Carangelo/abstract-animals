package org.lessons.java.animals;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		//Initialize a scanner to acquire date from user
		
		Scanner scanner = new Scanner(System.in);

		//Initialize an Animal array of ten position
		
		Animal animals[] = new Animal[4];
		
		//Populate the Array with the four different instances of the Animal children classes
		
		Dog doggo = new Dog("Kibbles","Woof woof","Doggo");
		animals[0] = doggo;
		
		HouseSparrow titti = new HouseSparrow("seeds","Cheep","Titti");
		animals[1] = titti;
		
		Eagle umberto = new Eagle("meat","SCREEEE","Umberto");
		animals[2] = umberto;
		
		Dolphin giacinto = new Dolphin("fish","eEeEeEeEeEeEeEeEeEeE","Giacinto");
		animals[3] = giacinto;
		
		//All the methods for all the animals
		
		System.out.println("List of the animals:\n ");
		
		for (Animal anml:animals) {
			
			System.out.println(anml.getAnimalName() + ": ");
			
			anml.animalSleep();
			anml.animalEat();
			anml.animalSound();
			
			System.out.println("");
			
		}
		
		//Invoke the LetFly method on the correct animals
		
		System.out.println("Animals that can fly:\n ");
		
		System.out.println(titti.getAnimalName() + ": ");
		letFly(titti);
		System.out.println(umberto.getAnimalName() + ": ");
		letFly(umberto);
		
		//Invoke the LetSwim method on the correct animals
		
		System.out.println("Animals that can swim:\n ");
		
		System.out.println(giacinto.getAnimalName() + ": ");
		letSwim(giacinto);
	
	}
	
	
	//Utilities methods of the main program
	
	public static void letFly(FlyingInt animal) {
		
		animal.fly();
		System.out.println("");
		
	}
	
	public static void letSwim(SwimInt animal) {
		
		animal.swim();
		System.out.println("");
		
	}
}
