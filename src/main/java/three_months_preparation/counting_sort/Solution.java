package three_months_preparation.counting_sort;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'countingSort' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> countingSort(List<Integer> arr) {
        int[] countingSort = new int[100];
        for (int value : arr) {
            countingSort[value]++;
        }
        return Arrays.stream(countingSort)
                .boxed()
                .collect(toList());
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        try (Scanner in = new Scanner(System.in)){
            int n = in.nextInt();
            List<Integer> arr = new ArrayList<>(0);
            for (int i = 0; i < n; i++) {
                arr.add(in.nextInt());
            }
            System.out.println(Result.countingSort(arr));
        }
    }
}
