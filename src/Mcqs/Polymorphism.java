package Mcqs;

public class Polymorphism {
	 public static void main(String[] args) { 
	        Animal myAnimal;    
	        myAnimal = new Dog();   
	        myAnimal.makeSound();  // Outputs: Woof 

	        myAnimal = new Cat();   
	        myAnimal.makeSound();  // Outputs: Meow 
	    } 
}
class Animal { 
    void makeSound() { 
        System.out.println("Some generic animal sound"); 
    } 
    void feed() {
    	System.out.println("feed");
    }
} 

class Dog extends Animal { 
	
    @Override 
    void makeSound() { 
        System.out.println("Woof"); 
    } 

} 

class Cat extends Animal { 
	
    @Override 
    void makeSound() { 
        System.out.println("Meow"); 
    } 

} 

