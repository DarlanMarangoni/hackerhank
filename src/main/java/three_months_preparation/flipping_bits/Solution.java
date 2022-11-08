package three_months_preparation.flipping_bits;

import java.io.*;
import java.util.Scanner;
import java.util.stream.IntStream;

class Result {

    /*
     * Complete the 'flippingBits' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER n as parameter.
     */

    public static long flippingBits(long n) {
        String binaryString = Long.toBinaryString(n);
        StringBuilder s32 = new StringBuilder();
        for (int i = 0; i < 32 - binaryString.length(); i++) {
            s32.append("0");
        }
        s32.append(binaryString);
        StringBuilder flippingBits = new StringBuilder();
        for (int i = 0; i < s32.length(); i++) {
            flippingBits.append(s32.charAt(i) == '1' ? "0" : "1");
        }
        return Long.parseLong(flippingBits.toString(), 2);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        try(Scanner in = new Scanner(System.in)) {
            int q = in.nextInt();
            for (int i = 0; i < q; i++) {
                long n = in.nextLong();
                System.out.println(Result.flippingBits(n));
            }
        }
    }
}
