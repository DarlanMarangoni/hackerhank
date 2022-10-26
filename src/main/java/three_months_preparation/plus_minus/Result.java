package three_months_preparation.plus_minus;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;


public class Result {
    public static void plusMinus(List<Integer> arr) {
        float positive = arr.stream().filter(value -> value > 0).count();
        float negative = arr.stream().filter(value -> value < 0).count();
        float zero = arr.stream().filter(value -> value == 0).count();
        System.out.printf("%.6f\n", positive/arr.size());
        System.out.printf("%.6f\n", negative/arr.size());
        System.out.printf("%.6f\n", zero/arr.size());

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
