package setinterface;

import java.util.*;
import java.util.stream.Collectors;

public class SetOperationsStream {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

        // Compute Union using Streams
        Set<Integer> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);

        // Compute Intersection using Streams
        Set<Integer> intersectionSet = set1.stream()
                .filter(set2::contains)
                .collect(Collectors.toSet());

        System.out.println("Union: " + unionSet);
        System.out.println("Intersection: " + intersectionSet);
    }
}

