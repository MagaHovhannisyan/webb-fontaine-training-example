package class9Collections;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class TestArrayList {
    ArrayListAPI arrayListAPI = new ArrayListAPI();

    @Test
    public void compareArrayLists() {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("test");

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("test");

        ArrayList<String> arrayList3 = new ArrayList<>();
        arrayList3.add("test1");

        boolean trueResult = arrayListAPI.compareArrayLists(arrayList1, arrayList2);
        Assert.assertEquals(trueResult, true);

        boolean falseResult = arrayListAPI.compareArrayLists(arrayList1, arrayList3);
        Assert.assertEquals(falseResult, false);
    }

    @Test
    public void jointArrayList() {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("test1");
        arrayList1.add("test2");
        arrayList1.add("test3");

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("test4");
        arrayList2.add("test5");

        ArrayList<String> jointArrayList = arrayListAPI.joinArrayList(arrayList1, arrayList2);
        Assert.assertEquals(jointArrayList, "[test1, test2, test3, test4, test5]");
    }

    @Test
    public void cloneArrayList() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("test1");
        arrayList.add("test2");

        ArrayList<String> cloneArrayList = arrayListAPI.cloneArrayList(arrayList);
        Assert.assertEquals(cloneArrayList, "[test1, test2]");
    }

    @Test
    public void searchElementInArrayList() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("test1");
        arrayList.add("test2");

        boolean foundElement = arrayListAPI.searchElementInArrayList(arrayList, "test1");
        Assert.assertEquals(foundElement, true);

        boolean NotFoundElement = arrayListAPI.searchElementInArrayList(arrayList, "test3");
        Assert.assertEquals(NotFoundElement, false);
    }

    @Test
    public void removeThirdElement() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("test1");
        arrayList.add("test2");
        arrayList.add("test3");

        ArrayList<String> with3rdElement = arrayListAPI.removeThirdElement(arrayList);
        Assert.assertEquals(with3rdElement, "[test1, test2]");
    }

    @Test(expectedExceptions = {ArrayIndexOutOfBoundsException.class}, expectedExceptionsMessageRegExp = "3rd element not available")
    public void CannotRemoveThirdElement() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("test1");
        arrayList.add("test2");
        arrayListAPI.removeThirdElement(arrayList);
    }
}