package HelloWorld;

import java.util.Scanner;

abstract class Animal {

	//abtract method
	abstract void makeSound(); 

	//non abtract method
	public void run()
	{
		
		System.out.println("Dog runs!");
		
	}
	
}

class Dog extends Animal {
	
	public void makeSound()
	{
		
		System.out.println("Bark Bark");
	}
	
	
}

class Animals{
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
  
			Dog dog1 = new Dog();
			dog1.makeSound();
			dog1.run();
			
		}
	
}