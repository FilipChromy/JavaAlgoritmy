package org.personal.codility;

import java.util.Arrays;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
	    OddOccurrencesInArray execute = new OddOccurrencesInArray();
        System.out.println(execute.solution(new int[] {3, 9, 3, 7, 9, 7, 0, 1 ,0, 1, 2}));
    }
}

class BinaryGap {

    int solution(int A) {
        String binaryString = Integer.toBinaryString(A);
        int counter = 0;
        int maxGap = 0;
        boolean started = false;
        for (int i=0; i<binaryString.length(); i++) {
            String c = binaryString.substring(i, i+1);
            if (c.equals("1")) {
                if (started) {
                    if (counter > maxGap) {
                        maxGap = counter;
                    }
                }
                started = true;
                counter = 0;
            }
            if (c.equals("0")) {
                counter++;
            }
        }
        return maxGap;
    }
}

class CyclicRotation {

    int[] solution(int A[], int B) {
        int[] rotatedArray = new int[A.length];
        for (int i=0; i<A.length; i++) {
            int rotate = B + i;
            while (rotate >= A.length) {
                rotate -= A.length;
            }
            rotatedArray[rotate] = A[i];
        }
        return rotatedArray;
    }
}

class OddOccurrencesInArray {
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
