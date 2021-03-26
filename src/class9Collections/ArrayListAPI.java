package class9Collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListAPI {

    //Write a Java program to compare two array lists
    public boolean compareArrayLists(ArrayList<String> arrayList1, ArrayList<String> arrayList2) {
        if (arrayList1.equals(arrayList2)) {
            return true;
        } else {
            return false;
        }
    }

    //Write a Java program of swap two elements in array list
    public void swapElements(ArrayList<String> arrayList, int element1, int element2) {
        Collections.swap(arrayList, element1, element2);
    }

    //Write a Java program to join two array lists
    public ArrayList<String> joinArrayList(ArrayList<String> arrayList1, ArrayList<String> arrayList2) {
        ArrayList<String> jointArrayList = new ArrayList<String>();
        jointArrayList.addAll(arrayList1);
        jointArrayList.addAll(arrayList2);
        return jointArrayList;
    }

    //Write a Java program to clone an array list to another array list
    public ArrayList<String> cloneArrayList(ArrayList<String> arrayList) {
        ArrayList<String> newArrayList = (ArrayList<String>) arrayList.clone();
        return newArrayList;
    }

    //Write a Java program to reverse elements in array list
    public void reserveArrayList(ArrayList<String> arrayList) {
        Collections.reverse(arrayList);
    }

    //Write a Java program to search an element in array list
    public boolean searchElementInArrayList(ArrayList<String> arrayList, String element) {
        if (arrayList.contains(element)) {
            return true;
        } else
            return false;
    }

    //Write a Java program to update specific array element by given element
    public void updateElement(ArrayList<String> arrayList, int index, String changedElement) {
        arrayList.set(index, changedElement);
    }

    //Write a Java program to iterate through all elements in array list
    public void iterateThroughElements(ArrayList<String> arrayList) {
        for (String element : arrayList) {
            System.out.println(element);
        }
    }

    //Write a Java program to remove the third element from array list
    public ArrayList<String> removeThirdElement(ArrayList<String> arrayList) throws ArrayIndexOutOfBoundsException {
        if (arrayList.size() > 2) {
            arrayList.remove(2);
            return arrayList;
        } else throw new ArrayIndexOutOfBoundsException("3rd element not available");
    }
}