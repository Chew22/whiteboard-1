package com.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem5Symmetric {
    public static List<Integer> findSymmetricDifference(List<Integer> list3, List<Integer> list4) {
        Set<Integer> set1 = new HashSet<>(list3);
        Set<Integer> set2 = new HashSet<>(list4);

        Set<Integer> symmetricDifference = new HashSet<>(set1);
        symmetricDifference.addAll(set2); // Union

        set1.retainAll(set2); // Intersection
        symmetricDifference.removeAll(set1); // Symmetric difference

        return new ArrayList<>(symmetricDifference);
    }
}
