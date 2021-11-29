package org.personal.codility;

public class CyclicRotation {

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
