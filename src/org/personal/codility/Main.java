package org.personal.codility;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    CyclicRotation cycleTwo = new CyclicRotation();
        System.out.println(Arrays.toString(cycleTwo.solution(new int[] {1, 2, 3, 4, 5}, 2)));
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

}
