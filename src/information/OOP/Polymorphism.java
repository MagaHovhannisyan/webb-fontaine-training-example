package information.OOP;

public class Polymorphism {
    // POLYMORPHISM - the ability of an object to take on many forms (one name with many forms).
    // It means "many forms", and it occurs when we have many classes that are related to each other by inheritance.
    // Inheritance lets users inherit attributes and methods, and polymorphism uses these methods for performing different tasks.

    //COMPILE-TIME / STATIC POLYMORPHISM - overloading (method parameters can vary with number or type of the parameter).

    // RUNTIME / DYNAMIC POLYMORPHISM - overriding (redefining a super class method in a sub class).

    class Animal {
        public void animalSound() {
            System.out.println("The animal makes a sound");
        }
    }

    class Pig extends Animal {
        public void animalSound() {
            System.out.println("The pig says: wee wee");
        }
    }

    class Dog extends Animal {
        public void animalSound() {
            System.out.println("The dog says: bow wow");
        }
    }

    /*
    class Main {
        public static void main(String[] args) {
            Animal myAnimal = new Animal();  // Create a Animal object
            Animal myPig = new Pig();  // Create a Pig object
            Animal myDog = new Dog();  // Create a Dog object
            myAnimal.animalSound();
            myPig.animalSound();
            myDog.animalSound();
        }
    }
     */
}