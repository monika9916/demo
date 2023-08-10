package com.example.demo.Polymorphism;

public class Animal {
	
	public void animalSound() {
		System.out.println("The animal makes a sound");
	}
	
	public static void main(String[] args) {
		Animal myAnimal = new Animal();  // Create a Animal object
	    Animal myPig = new Pig();  // Create a Pig object
	    Animal myDog = new Dog();  // Create a Dog object
	    Animal myCat = new Cat();  // Create a Dog object
	    
	    myAnimal.animalSound();
		myPig.animalSound();
		myDog.animalSound();
		myCat.animalSound();
		
	}
}
