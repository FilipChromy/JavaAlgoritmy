package org.personal.codility;

public class BinaryGap {

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
