package information;

public class SingletonPattern {
    /*
    SINGLETON PATTERN - ensuring that only one instance of the class exists in the JVM.
     */

    /*
    TO IMPLEMENT a Singleton pattern, we have different approaches but all of them have the following common concepts.
    * PRIVATE CONSTRUCTOR to restrict instantiation of the class from other classes,
    * PRIVATE STATIC VARIABLE of the same class that is the only instance of the class,
    * PUBLIC STATIC METHOD that returns the instance of the class, this is the global access point for outer world.
     */

    /*
    1. EAGER INITIALIZATION - instance of Singleton Class is created at the time of class loading
    public class EagerInitializedSingleton {
    //PRIVATE STATIC VARIABLE
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();
    //PRIVATE CONSTRUCTOR to avoid client applications to use constructor
    private EagerInitializedSingleton(){}
    //PUBLIC STATIC METHOD
    public static EagerInitializedSingleton getInstance(){
        return instance;
    }
}
     */

    /*
    2. LAZY INITIALIZATION - creates the instance in the global access method
    public class LazyInitializedSingleton {
    //PRIVATE STATIC VARIABLE
    private static LazyInitializedSingleton instance;
    //PRIVATE CONSTRUCTOR
    private LazyInitializedSingleton(){}
    //PUBLIC STATIC METHOD
    public static LazyInitializedSingleton getInstance(){
        if(instance == null){
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}
*/

    /*
    3. STATIC BLOCK INITIALIZATION - instance of class is created in the static block that provides option for exception handling
    public class StaticBlockSingleton {
    //PRIVATE STATIC VARIABLE
    private static StaticBlockSingleton instance;
    //PRIVATE CONSTRUCTOR
    private StaticBlockSingleton(){}
    //static block initialization for exception handling
    static{
        try{
            instance = new StaticBlockSingleton();
        }catch(Exception e){
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }
    //PUBLIC STATIC METHOD
    public static StaticBlockSingleton getInstance(){
        return instance;
    }
}
     */
}