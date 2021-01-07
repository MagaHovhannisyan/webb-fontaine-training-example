package information;

public class GarbageCollector {
    /*
    GARBAGE COLLECTION (GC) - process by which Java programs perform automatic memory management.
    * Garbage Collector finds unused objects created on the heap and deletes them to free up memory
    * Garbage Collection is an automatic process
    * Garbage Collector lives in the JVM
    */

    /*
    THREE SECTIONS OF THE HEAP:
    * YOUNG GENERATION - Newly created objects start in the Young Generation. Garbage collector enters here most frequently.
        * EDEN - all new objects start here. ALL objects are moved from Eden to S0 and S1 after surviving one garbage collection cycle.
        * SURVIVOR 0
        * SURVIVOR 1
    * OLD GENERATION - Objects that are long-lived are eventually moved from the Young Generation to the Old Generation. GC enters here less frequently.
    * PERMANENT GENERATION (METADATA) - Garbage Collector never enters here. Static variables etc are located here.
     */
}