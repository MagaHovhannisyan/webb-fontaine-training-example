package information;

public class FunctionsAndObjects {
    //Naming styles - camelCase (function), PascalCase (class), snake_case, kabeb-case

    /*
    COMPILE-TIME is the instance where the code you entered is converted to executable while
    RUN-TIME is the instance where the executable is running
     */

    /*
    BREAK statement - results in the termination of the loop (cycle), it will come out of the loop and stop further iterations.
    CONTINUE statement - stops the current execution of the iteration and proceeds to the next iteration.
    RETURN statement - takes you out of the method (function). It stops executing the method and returns from the method execution.
    if we have an ordinary for loop, break and return statements will lead to the same solution, while
    when having function with multiple loops, Break will take out of loop but continue to run the function, while Return will stop the entire function.
     */
    void exampleContinue() {     //Output - numbers from 0 to 9 except of
        int i = 0;
        while (i < 10) {
            if (i == 4) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }

    void exampleBreak() { //Output - 0, 1, 2, 3
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
            if (i == 4) {
                break;
            }
        }
    }

    //FUNCTION MUST HAVE - name, return-value(int, double...), argument

    //Can I have return statement in void function? - Yes, only like this example
    void dif(int a, int b) {
        if (a == b) {
            return;
        }
        int c = a - b;
    }

    /*
    METHOD OVERLOADING - two or more methods can have same name if they differ in parameters :
    different number of parameters, different types of parameters, or both
     */
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) { //different type of parameter
        return a + b;
    }

    int sum(int a) { //different number of parameter
        return a;
    }

    /*
    VARARGS Variable Arguments - argument that can accept variable number of values. It uses the syntax of array
    !!! If we need to have multiple parameters in a function, the varargs parameter should stay at the end, so that java
    will not confuse the length of the array.
     */
    float sum(float... numbers) {
        return 5;
    }

    int sum(int a, int... array) { //varargs parameter is at the end
        return 5;
    }

    //RECURSION - a process in which a method calls itself continuously AND there is a condition of return
    int getNum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + getNum(n - 1);
    }

    int a = getNum(5); // a=15
    /*
    1) -> 5 ? 5 + 10 = 15
    2) -> 4 ? 4 + 6 = 10
    3) -> 3 ? 3 + 3 = 6
    4) -> 2 ? 2 + 1 = 3
    5) -> 1 -> 1
     */
}