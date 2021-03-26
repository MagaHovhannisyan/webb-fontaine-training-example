package information;

import java.util.ArrayList;
import java.util.LinkedList;

public class Collections {
    /*
    COLLECTION framework interfaces :
    * LIST
    Implementations :
        * ArrayList - Generic,
            Ordered collection,
            Elements are objects : String, Boolean, Integer, Double etc...
            Initial capacity = 10,
            Load factor = 3/4 = 0.75f,
            Threshold = (Current capacity) * (Load factor),
            New capacity = (Current capacity* 3 /2) +1

            The ArrayList class has a regular array inside it.
            When an element is added, it is placed into the array.
            If the array is not big enough,
            a new, larger array is created
            to replace the old one
            and the old one is removed.
    */

    public class ArrayListTest {
        public void main(String[] args) {
            ArrayList<String> arrayList = new ArrayList<>(); // Initial capacity = 10
            // Add Item
            arrayList.add("test1");
            arrayList.add("test2");
            //Get Item
            arrayList.get(0);
            //Modify Item
            arrayList.set(0, "test11");
            //Remove Item
            arrayList.remove(0);
            //Remove all
            arrayList.clear();
            //Get size
            arrayList.size();
            //Sort
            java.util.Collections.sort(arrayList);

            for (String i : arrayList) {
                System.out.println(i);
            }
        }
    }

   /*
   Implementations :
            * LinkedList - Generic,
                Ordered collection,
                Elements are objects : String, Boolean, Integer, Double etc...
                Initial capacity = 10,
                Load factor = 3/4 = 0.75f,
                Threshold = (Current capacity) * (Load factor),
                New capacity = (Current capacity* 3 /2) +1

                The LinkedList stores its items in "containers."
                The list has a link to the first container
                and each container has a link to the next container in the list.
                To add an element to the list, the element is placed into a new container
                and that container is linked to one of the other containers in the list.
    */

    public class LinkedListTest {
        public void main(String[] args) {
            LinkedList<String> linkedList = new LinkedList<>();
            // Add Item
            linkedList.add("test1");
            linkedList.add("test2");
            //Add Item in 0 index
            linkedList.addFirst("test");
            //Remove Item in 0 index
            linkedList.removeFirst();
            //Remove last Item
            linkedList.removeLast();
            //Get first element
            linkedList.getFirst();
            //Get last element
            linkedList.getLast();
        }
    }
}