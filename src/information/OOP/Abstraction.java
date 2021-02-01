package information.OOP;

public class Abstraction {
    // ABSTRACTION - process of hiding certain details and showing only essential information to the user. It is used to achieve security.
    // Abstraction is not actually a part of OOP, it is Java specific.

    /*
    Abstract class:
    * restricted class that cannot be used to create objects,
    * to access the abstract class, it must be inherited from another class,
    * an abstract class can have both abstract and regular methods,
     */

    // Abstract method: can only be used in an abstract class. The body is provided by the subclass (inherited from).

    // Abstract class
    abstract class Animal {
        // Abstract method (does not have a body)
        public abstract void animalSound();

        // Regular method
        public void sleep() {
            System.out.println("Zzz");
        }
    }

    // Animal myObj = new Animal(); // will generate an error

    // Subclass (inherit from Animal)
    class Pig extends Animal {
        @Override
        public void animalSound() {
            // The body of animalSound() is provided here
            System.out.println("The pig says: wee wee");
        }
    }
}