package setinterface;

import java.util.*;
import java.util.stream.Collectors;

public class SymmetricDifferenceStream {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

        // Compute Symmetric Difference using Streams
        Set<Integer> symmetricDifference = new HashSet<>(set1);
        symmetricDifference.addAll(set2);
        symmetricDifference.removeAll(set1.stream()
                .filter(set2::contains)
                .collect(Collectors.toSet()));

        // Display result
        System.out.println("Symmetric Difference: " + symmetricDifference);
    }
}
