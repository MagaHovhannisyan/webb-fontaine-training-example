package class1DataTypesAndConditions;

public class InformationDataTypes {
    public static void main(String[] args) {
        /* MAIN DIFFERENCES BETWEEN PRIMITIVE AND NON-PRIMITIVE DATA TYPES
         * Primitive types are predefined in Java. Non-primitive types are created by the programmer (except for String);
         * Non-primitive types can be used to call methods to perform certain operations, while primitive types cannot;
         * A primitive type has always a value, while non-primitive types can be null;
         * A primitive type starts with a lowercase letter, while non-primitive types starts with an uppercase letter;
         * The size of a primitive type depends on the data type, while non-primitive types have all the same size.
         */

        // PRIMITIVE DATA TYPES - have no additional methods
        //Integer types
        byte b = 1; //1 byte, Stores whole numbers from -128 to 127
        short sh = -345; // 2 bytes, Stores whole numbers from -32,768 to 32,767
        int i = 52; //4 bytes, Stores whole numbers from -2,147,483,648 to 2,147,483,647
        long l = 55L; //8 bytes, Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

        //Floating point types
        float f = 3.4f; //4 bytes, Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
        double d = 3.4; //8 bytes, Stores fractional numbers. Sufficient for storing 15 decimal digits

        char ch = 'H'; //2 bytes, Stores a single character/letter or ASCII values

        boolean bool = true; //1 bit, Stores true or false values

        //NON-PRIMITIVE DATA TYPES - refer to objects
        //String -  used for storing text
        String s = "Hello";

        //Array - used to store multiple values in a single variable
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        int[] myNum = {10, 20, 30, 40};

        //Class - used as object constructor
        class MyClass {
            int x = 5;
        }
    }
}