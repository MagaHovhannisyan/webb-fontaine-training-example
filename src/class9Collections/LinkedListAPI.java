package class9Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class LinkedListAPI {
    //Write a Java program to append the specified element to the end of a linked list
    public LinkedList<String> appendElement(LinkedList<String> linkedList, String element) {
        linkedList.addLast(element);
        return linkedList;
    }

    //Write a Java program to iterate a linked list in reverse order
    public LinkedList<String> reserveLinkedList(LinkedList<String> linkedList) {
        LinkedList<String> reservedList = new LinkedList<>();
        for (int i = linkedList.size() - 1; i >= 0; --i) {
            reservedList.add(linkedList.get(i));
        }
        return reservedList;
    }

    //Write a Java program to insert the specified element at the specified position in the linked list
    public LinkedList<String> insertElementInSpecifiedPosition(LinkedList<String> linkedList, int index, String element) {
        linkedList.add(index, element);
        return linkedList;
    }

    //Write a Java program to insert some elements at the specified position into a linked list
    public LinkedList<String> insertSomeElementsInSpecifiedPosition(LinkedList<String> linkedList, int index, String... element) {
        LinkedList<String> newLinkedList = new LinkedList<>();
        for (String i : element) {
            newLinkedList.add(i);
        }
        linkedList.addAll(index, newLinkedList);
        System.out.println("newLinkedList = " + newLinkedList);
        System.out.println("linkedList = " + linkedList);
        return linkedList;
    }

    //Write a Java program to remove a specified element from linked list
    public LinkedList<String> removeSpecifiedElement(LinkedList<String> linkedList, int index) {
        linkedList.remove(index);
        return linkedList;
    }

    //Write a Java program to remove first and last element from linked list
    public LinkedList<String> removeFirstAndLastElements(LinkedList<String> linkedList) throws NoSuchElementException {
        if (linkedList.size() > 1) {
            linkedList.removeFirst();
            linkedList.removeLast();
            return linkedList;
        } else throw new NoSuchElementException();
    }

    //Write a Java program to join two linked lists
    public LinkedList<String> jointTwoLinkedLists(LinkedList<String> linkedList1, LinkedList<String> linkedList2) {
        linkedList1.addAll(linkedList2);
        return linkedList1;
    }

    //Write a Java program to remove and return the first element of linked list
    public String removeAndReturnFirstElement(LinkedList<String> linkedList) {
        String firstElement = linkedList.pop();
        return firstElement;
    }

    //Write a Java program to retrieve but does not remove, the last element of a linked list
    public String retrieveButNotRemoveLastElement(LinkedList<String> linkedList) {
        String lastElement = linkedList.peekLast();
        return lastElement;
    }

    //Write a Java program to retrieve but does not remove, the first element of a linked list
    public String retrieveButNotRemoveFirstElement(LinkedList<String> linkedList) {
        String firstElement = linkedList.peekFirst();
        return firstElement;
    }

    //Write a Java program to convert linked list to array list
    public ArrayList<String> convertLinkedListIntoArrayList(LinkedList<String> linkedList) {
        ArrayList<String> arrayList = new ArrayList<String>(linkedList);
        return arrayList;
    }

    //Write a Java program to compare two linked lists
    public boolean compareLinkedLists(LinkedList<String> linkedList1, LinkedList<String> linkedList2) {
        if (linkedList1.equals(linkedList2)) {
            return true;
        } else {
            return false;
        }
    }

    //Write a Java program to check if a particular element exists in a linked list
    public boolean checkIfElementExists(LinkedList<String> linkedList1, String element) {
        if (linkedList1.contains(element)) {
            return true;
        } else {
            return false;
        }
    }


}