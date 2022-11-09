package three_months_preparation.counting_valleys;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Result {

    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
        int position = 0;
        int amountValley = 0;
        boolean isSea;
        for (int i = 0; i < path.length(); i++) {
            isSea = position < 0;
            if(path.charAt(i) == 'U') {
                position++;
            } else {
                position--;
            }
            if (position == 0 && isSea) {
                amountValley++;
            }
        }
        return amountValley;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
       try(Scanner in = new Scanner(System.in)) {
           int steps = in.nextInt();
           String path = in.next();
           System.out.println(Result.countingValleys(steps, path));
       }
    }
}
