package class9Collections;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class TestLinkedList {
    LinkedListAPI linkedListAPI = new LinkedListAPI();

    @Test
    public void appendElement() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("test");

        LinkedList result = linkedListAPI.appendElement(linkedList, "appended element");
        Assert.assertEquals(result, "[test, appended element]");
    }

    @Test
    public void reserveLinkedList() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");

        LinkedList result = linkedListAPI.reserveLinkedList(linkedList);
        Assert.assertEquals(result, "[c, b, a]");
    }

    @Test
    public void insertElementInSpecifiedPosition() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");

        LinkedList result = linkedListAPI.insertElementInSpecifiedPosition(linkedList, 2, "specified");
        Assert.assertEquals(result, "[a, b, specified, c]");
    }

    @Test
    public void insertSomeElementsInSpecifiedPosition() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");

        LinkedList result = linkedListAPI.insertSomeElementsInSpecifiedPosition(linkedList, 2,
                "test1", "test2", "test3", "test4");
        Assert.assertEquals(result, "[a, b, test1, test2, test3, test4, c]");
    }

    @Test
    public void removeSpecifiedElement() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");

        LinkedList result = linkedListAPI.removeSpecifiedElement(linkedList, 2);
        Assert.assertEquals(result, "[a, b]");
    }

    @Test
    public void removeFirstAndLastElementsPositive() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");

        LinkedList result = linkedListAPI.removeFirstAndLastElements(linkedList);
        Assert.assertEquals(result, "[b]");
    }

    @Test(expectedExceptions = {NoSuchElementException.class})
    public void removeFirstAndLastElementsNegative() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("a");

        linkedListAPI.removeFirstAndLastElements(linkedList);
    }

    @Test
    public void jointTwoLinkedLists() {
        LinkedList<String> linkedList1 = new LinkedList<>();
        linkedList1.add("a");
        linkedList1.add("b");
        linkedList1.add("c");

        LinkedList<String> linkedList2 = new LinkedList<>();
        linkedList1.add("A");
        linkedList1.add("B");

        LinkedList result = linkedListAPI.jointTwoLinkedLists(linkedList1, linkedList2);
        Assert.assertEquals(result, "[a, b, c, A, B]");
    }

    @Test
    public void removeAndReturnFirstElement() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");

        String result = linkedListAPI.removeAndReturnFirstElement(linkedList);
        Assert.assertEquals(result, "a");
    }

    @Test
    public void retrieveButNotRemoveLastElement() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");

        String result = linkedListAPI.retrieveButNotRemoveLastElement(linkedList);
        Assert.assertEquals(result, "c");
    }

    @Test
    public void retrieveButNotRemoveFirstElement() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");

        String result = linkedListAPI.retrieveButNotRemoveFirstElement(linkedList);
        Assert.assertEquals(result, "a");
    }

    @Test
    public void compareLinkedLists() {
        LinkedList<String> linkedList1 = new LinkedList<>();
        linkedList1.add("test");

        LinkedList<String> linkedList2 = new LinkedList<>();
        linkedList2.add("test");

        LinkedList<String> linkedList3 = new LinkedList<>();
        linkedList3.add("test1");

        boolean trueResult = linkedListAPI.compareLinkedLists(linkedList1, linkedList2);
        Assert.assertEquals(trueResult, true);

        boolean falseResult = linkedListAPI.compareLinkedLists(linkedList1, linkedList3);
        Assert.assertEquals(falseResult, false);
    }

    @Test
    public void checkIfElementExists() {
        LinkedList<String> linkedList1 = new LinkedList<>();
        linkedList1.add("test1");
        linkedList1.add("test2");

        boolean trueResult = linkedListAPI.checkIfElementExists(linkedList1, "test1");
        Assert.assertEquals(trueResult, true);

        boolean falseResult = linkedListAPI.checkIfElementExists(linkedList1, "test3");
        Assert.assertEquals(falseResult, false);
    }
}