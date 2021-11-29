package org.personal.codility;

import java.util.HashSet;

public class MissingInteger {

    int solution(int[] A) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i=1; i<A.length; i++) {
            hs.add(i);
        }

        for (int j=0; j<A.length; j++) {
            hs.remove(A[j]);
        }
        return hs.iterator().next();
    }
}
