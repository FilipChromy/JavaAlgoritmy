package org.personal.codility;

import java.util.HashSet;

public class FrogRiver {

    int solution(int X, int[] A) {
        HashSet<Integer> jumps = new HashSet<>();
        for (int i = 1; i <= X; i++) {
            jumps.add(i);
        }
        for (int j = 0; j < A.length; j++) {
            if (jumps.remove(j)) {
                if (jumps.isEmpty()) {
                    return j;
                }
            }
        }
        return -1;
    }
}
