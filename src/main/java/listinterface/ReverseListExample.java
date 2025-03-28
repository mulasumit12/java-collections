package listinterface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReverseListExample {

    // Method to reverse a list without built-in methods
    public static <T> void reverseList(List<T> list) {
        int left = 0, right = list.size() - 1;

        while (left < right) {
            // Swap elements
            T temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        // Using ArrayList
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        System.out.println("Original ArrayList: " + arrayList);
        reverseList(arrayList);
        System.out.println("Reversed ArrayList: " + arrayList);

        // Using LinkedList
        List<Integer> linkedList = new LinkedList<>(arrayList); // Copy from reversed ArrayList
        System.out.println("\nOriginal LinkedList: " + linkedList);
        reverseList(linkedList);
        System.out.println("Reversed LinkedList: " + linkedList);
    }
}
