package information.OOP;

public class Encapsulation {
    // ENCAPSULATION - protective shield that prevents the data from being accessed by the code outside this shield.

    /*
    ADVANTAGES:
    * DATA HIDING : the user will have no idea about the inner implementation of the class.
     It will not be visible to the user how the class is storing values in the variables.
    * INCREASED FLEXIBILITY : we can make the variables of the class as read-only (getter) or write-only (setter) depending on our requirement.
    * RE-USABILITY : easy to change with new requirements.
    * EASY TESTING : easy to test for unit testing.
     */

   /*
   FOUR ACCESS MODIFIERS overriding
   * PRIVATE - visible to the class only
   * DEFAULT / PACKAGE PRIVATE - visible to the package, the default. No modifiers are needed
   * PROTECTED - visible to the package and all subclasses
   * PUBLIC - visible to the world
   */

    public class Person {
        private String name; // private = restricted access

        // Getter
        public String getName() {
            return name;
        }

        // Setter
        public void setName(String newName) {
            this.name = newName;
        }
    }
}