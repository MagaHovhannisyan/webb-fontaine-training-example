package information.OOP;

public class Inheritance {
    // INHERITANCE - mechanism by which one class acquires the properties and behaviors of the parent class.
    // When you inherit from an existing class, you can reuse methods and fields of the parent class.

    /*
    A subclass inherits its superclasses:
    * public members,
    * default / package private members (if the subclass and superclass are located in the same package),
    * protected members (regardless of the location of packages of classes).
     */

    /*
    In order to prevent inheritance of class - final class
    In order to prevent method from overriding - final method
     */

    // OVERRIDING - allows a subclass to inherit a method from a superclass and then to modify its behavior as needed.

    //SUPER Keyword - used to access any data member or methods of the parent class.

    /*
     * CONSTRUCTORS during inheritance - constructor of superclass with no argument gets automatically called in subclass constructor.
     * If we want to call parameterized constructor of superclass, then we can call it using super().
     * superclass constructor call must be the first line in subclass constructor.
     */

    class Base {
        int x;

        Base(int _x) {
            x = _x;
        }
    }

    class Derived extends Base {
        int y;

        Derived(int _x, int _y) {
            super(_x);
            y = _y;
        }

        void Display() {
            System.out.println("x = " + x + ", y = " + y);
        }
    }
}