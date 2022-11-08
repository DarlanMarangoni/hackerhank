package three_months_preparation.diagonal_defference;

import java.io.*;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        int differenceD1 = 0;
        int differenceD2 = 0;
        int indexD1 = 0;
        int indexD2 = arr.size() - 1;
        for (List<Integer> line : arr) {
            differenceD1 = differenceD1 + line.get(indexD1);
            indexD1++;
        }
        for (List<Integer> line : arr) {
            differenceD2 = differenceD2 + line.get(indexD2);
            indexD2--;
        }
        return Math.abs(differenceD1 - differenceD2);

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        try(Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            List<Integer> cols = new ArrayList<>();
            List<List<Integer>> arr = new ArrayList<>();
                for (int j = 0; j < n; j++) {
                    arr.add(Arrays.asList(in.nextInt(), in.nextInt(), in.nextInt()));
                }
            System.out.println(Result.diagonalDifference(arr));
        }
    }
}
