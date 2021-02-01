package information;

public class InnerNestedAnonymousClasses {
    /*
    nested classes - to group classes that belong together, which makes your code more readable and maintainable.
     */
    class OuterClass {
        int x = 10;

        class InnerClass {
            int y = 5;
        }
    }
/*
    public class Main {
        public static void main(String[] args) {
            OuterClass myOuter = new OuterClass();
            OuterClass.InnerClass myInner = myOuter.new InnerClass();
            System.out.println(myInner.y + myOuter.x);
        }
    }
 */
}