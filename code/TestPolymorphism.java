// Base class (superclass)
class Animal {
	// Method to be overridden
	public void makeSound() {
        System.out.println("Some generic animal sound");
	}
}
// Derived class 1
class Dog extends Animal {
	@Override
	public void makeSound() {
        System.out.println("Dog says: Woof Woof!");
	}
}
// Derived class 2
class Cat extends Animal {
	@Override
	public void makeSound() {
        System.out.println("Cat says: Meow Meow!");
	}
}
// Main class to demonstrate runtime polymorphism
public class TestPolymorphism {
	public static void main(String[] args) {
    	// Parent class reference to child class object
    	Animal myAnimal;
    	// Animal myAnimal = new Dog();
    	myAnimal = new Animal();
        myAnimal.makeSound();
 
    	myAnimal = new Dog();  // Dog is an Animal
        myAnimal.makeSound();  // Runtime polymorphism: Dog's version is called
 
    	myAnimal = new Cat();  // Cat is also an Animal
        myAnimal.makeSound();  // Runtime polymorphism: Cat's version is called
	}
}
/*
 Some generic animal sound
Dog says: Woof Woof!
Cat says: Meow Meow!
*/

