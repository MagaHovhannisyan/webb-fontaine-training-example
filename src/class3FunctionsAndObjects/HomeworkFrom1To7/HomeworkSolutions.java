package class3FunctionsAndObjects.HomeworkFrom1To7;

public class HomeworkSolutions {
    public static void main(String[] args) {
        Arrays arrays = new Arrays();
        NumericOperations numericOperations = new NumericOperations();
        Triangles triangles = new Triangles();

        /*
        Homework 1. Գրել ֆունկցիա, որը տրված զանգվածի արժեքները կբազմապատկի 2-ով եւ կվերադարձնի այն
         */
        System.out.println("Homework 1 :");
        int arrayLength = arrays.getArrayLength();
        int[] originalArray = arrays.createRandomArray(arrayLength);
        arrays.arrayElementPrintout(originalArray, "Original Array");
        int[] doubledArray = arrays.getDoubledArray(originalArray);
        arrays.arrayElementPrintout(doubledArray, "Doubled Array");

        /*
        Homework 2. Գրել ֆունկցիա, որը կգումարի եւ կհաշվի իրեն տրված արգումենտների գումարը եւ կվերադարձնի այն
         */
        System.out.println("Homework 2 :");
        //2.1 Overloading
        int sumOfTreeInt = numericOperations.getSumOfArguments(1, 2, 3);
        System.out.println("sumOfTreeInt = " + sumOfTreeInt);
        int sumOfTwoInt = numericOperations.getSumOfArguments(1, 2);
        System.out.println("sumOfTwoInt = " + sumOfTwoInt);
        float sumOfTwoFloat = numericOperations.getSumOfArguments(1, 1.1f);
        System.out.println("sumOfTwoFloat = " + sumOfTwoFloat);

        //2.2 Varargs
        int sumWithVarargs = numericOperations.getSumOfArguments(1, 2, 3, 4, 5);
        System.out.println("sumWithVarargs = " + sumWithVarargs);

        /*
        Homework 3. Գրել ֆունկցիա, որը կհաշվի եռանկյան մակերեսը ըստ տրված 3 կողմերի եւ կվերադարձնի այն
         */
        //Solution 1
        System.out.println("Homework 3 :");
        double[] triangle = triangles.createTriangle();
        boolean validationChecking = triangles.checkTriangleLogic(triangle);
        System.out.println("validationChecking = " + validationChecking);
        double area = triangles.calculateArea(triangle, validationChecking);
        System.out.println("area = " + area);

        //Solution 2
        System.out.println("triangles.calculateArea(10,15,20) = " + triangles.calculateArea(10, 15, 20));

        /*
        Homework 4. Գրել ֆունկցիաներ, որոնք ստանալով երկու զանգված, կանեն հետեւյալը՝
         */
        System.out.println("Homework 4 :");
        int firstArrayLength = arrays.getArrayLength();
        int[] firstArray = arrays.createArray(firstArrayLength);
        arrays.arrayElementPrintout(firstArray, "First Array");

        int secondArrayLength = arrays.getArrayLength();
        int[] secondArray = arrays.createArray(secondArrayLength);
        arrays.arrayElementPrintout(firstArray, "Second Array");

        //4.1 կմիացնեն այդ զանգվածները եւ կվերադարձնեն այն
        int[] combinedArray = arrays.combineTwoArrays(firstArray, secondArray);
        arrays.arrayElementPrintout(combinedArray, "Combined Array");

        //4.2 կգումարեն առաջին եւ երկրորդ զանգվածների միջին թվաբ-ը եւ կվերադարձնեն
        double totalMean = arrays.mean(firstArray, firstArrayLength) + arrays.mean(secondArray, secondArrayLength);
        System.out.println("totalMean = " + totalMean);

        /*
        Homework5. Գրել ֆունկցիա, որը տրված զանգվածի տրված ինդեքսի արժեքը կմեծացնի 10% -ով
         */
        System.out.println("Homework 5 :");
        int arrayLengthForValueIncrease = arrays.getArrayLength();
        int[] arrayForValue = arrays.createRandomArray(arrayLengthForValueIncrease);
        arrays.arrayElementPrintout(arrayForValue, "Created Array");
        int elementIndex = arrays.findIndex(arrayForValue);
        double newElementValue = arrays.increaseElementValue(arrayForValue, elementIndex, 1.1f);
        System.out.println("newElementValue = " + newElementValue);

        /*
        Homework6. Գտնել Ֆիբոնաչիի n-րդ թիվը օգտագործելով ռեկուրսիա
         */
        int fibonacciNumber = numericOperations.fibonacciRecursion(5);
        System.out.println("fibonacciNumber = " + fibonacciNumber);

        /*
        Homework7. Գտնել 1-ից n թվերի արտադրյալը օգտագործելով ռեկուրսիա
         */
        int productOfNumber = numericOperations.productOfNumbersFromOneToN(5);
        System.out.println("productOfNumber = " + productOfNumber);
    }
}