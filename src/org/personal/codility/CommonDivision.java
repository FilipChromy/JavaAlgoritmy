package org.personal.codility;

public class CommonDivision {

    int solution(int A, int B, int K) {
        int commonDivisors = 0;
        boolean foundMin = false;
        for (int i=A; i<=B; i++) {
            if (i % K == 0) {
                foundMin = true;
                for (int j=i; j<=B; j+=K) {
                    if (j <= B) {
                        commonDivisors++;
                    }
                }
            }
            if (foundMin) {
                break;
            }
        }
        return commonDivisors;
    }
}
