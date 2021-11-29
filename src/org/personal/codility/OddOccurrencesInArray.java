package org.personal.codility;

import java.util.HashSet;

public class OddOccurrencesInArray {

    int solution(int[] A) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i=0; i<A.length; i++) {
            if (hs.contains(A[i])) {
                hs.remove(A[i]);
            } else {
                hs.add(A[i]);
            }
        }
        return hs.iterator().next();
    }
}
