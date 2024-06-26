package org.lessons.java.animals;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		//Initialize a scanner to acquire date from user
		
		Scanner scanner = new Scanner(System.in);
		
		//Define two variables to acquire animals info from user
		
		System.out.println("Insert animal food: ");
		String userFood =  scanner.nextLine();
		
		System.out.println("Insert animal verse: ");
		String userVerse=  scanner.nextLine();
		
		//Create an instance of Dog class
		
		Dog doggo = new Dog(userFood , userVerse );
		
		//Try Dog and Animal methods
		
		doggo.animalSleep();
		doggo.animalEat();
		doggo.animalVerse();
	
	}
}
