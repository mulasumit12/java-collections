package setinterface;

import java.util.*;

public class SetToSortedList {
    public static void main(String[] args) {
        // Step 1: Create a HashSet with some elements
        Set<Integer> numberSet = new HashSet<>(Arrays.asList(5, 3, 9, 1));
        // Step 2: Convert HashSet to List
        List<Integer> sortedList = new ArrayList<>(numberSet);
        // Step 3: Sort the List in ascending order
        Collections.sort(sortedList);
        // Display the sorted list
        System.out.println("Sorted List: " + sortedList);  // Output: [1, 3, 5, 9]
    }
}
