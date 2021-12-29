package org.personal.codility;

public class NonDivisors {
    public int[] solution(int[] A) {
        int[] nonDiv = new int[A.length];
        for (int i=0; i<A.length; i++) {
            int nonDivSum = 0;
            for (int j=0; j<A.length; j++) {
                if (i == j) {
                    continue;
                }
                if (A[j] > A[i] || A[i] % A[j] != 0) {
                    nonDivSum++;
                }
            }
            nonDiv[i] = nonDivSum;
        }
        return nonDiv;
    }
}
