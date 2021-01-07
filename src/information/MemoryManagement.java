package information;

public class MemoryManagement {
    /*
    -Java Development kit (JDK): contains tools required to write Java programs and JRE to execute them.
    -Java Virtual Machine (JVM): provides a platform-independent way of executing Java source code. It converts Java bytecode into machines language.
    -Just-in-time compiler (JIT): part of JVM. It is used to speed up the execution time. Is re-using the output of already run code.
     Use command -Xint in order to run code without JIT (applicable for big codes in order to save time.
    -Java Runtime Environment (JRE): contains the class libraries, loader class, and JVM.

    -Garbage Collector(GC): with helps o thid the program performs memory management automatically.
    Garbage collection in Java happens automatically during the lifetime of the program and is avoiding memory leaks.

    -Compiler: a program which converts a program from one level of language to another (C++ program into machine code).
    -Interpreter: a program which converts a program at one level to another programming language at the same level (i.e Java program into C++).
     */

    /*
    EXAMPLE STRING
    String s1 = "Maga"; goes to String pool
    String s2 = "Maga; goes to the same String pool as s1
    String s3 = new String("Maga"); creates new object in heap
    s3 = s3.intern(); moves the object created in heap to String pool as s1
    String s4 = "Ma" + "ga"; goes to String pool as s1
     */
}
