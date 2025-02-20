package trainingss;

import java.util.*;

public class zoo {
	public static void main(String[] args) { 
		Animal[] zoo = {new Dog(), new Cat(), new Bird()};
       // List<Animal> zoo = Arrays.asList(new Dog(), new Cat(), new Bird()); 
        for (Animal animal : zoo) { 
            animal.makeSound(); 
           animal.feed(); 
        }
        //the below comment will be executed  
    
       //Animal animal = new Animal();
        //Dog dog = (Dog) new Animal();
        //dog.feed();
    } 
}
 class Animal { 
   void makeSound() {}; 
    void feed() { 
        System.out.println("Feeding the animal"); 
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

class Bird extends Animal { 

    @Override 
    void makeSound() { 
        System.out.println("Tweet"); 
    } 

} 

