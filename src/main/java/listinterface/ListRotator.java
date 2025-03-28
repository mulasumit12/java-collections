package listinterface;

import java.util.*;

public class ListRotator {
    public static List<Integer> rotateList(List<Integer> list, int rotateBy) {
        int size = list.size();
        rotateBy = rotateBy % size; // Handle cases where rotateBy > size

        List<Integer> rotatedList = new ArrayList<>();
        rotatedList.addAll(list.subList(rotateBy, size)); // Add second half
        rotatedList.addAll(list.subList(0, rotateBy));    // Add first half

        return rotatedList;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        int rotateBy = 2;

        List<Integer> result = rotateList(numbers, rotateBy);
        System.out.println(result); // Output: [30, 40, 50, 10, 20]
    }
}

