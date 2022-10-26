package three_months_preparation.min_max_sum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        arr.sort(Comparator.comparingInt(value -> value));
        Optional<Long> min = arr
                .subList(0, 4)
                .stream()
                .map(Long::new)
                .reduce(Long::sum);
        Optional<Long> max = arr
                .subList(arr.size() - 4, arr.size())
                .stream()
                .map(Long::new)
                .reduce(Long::sum);
        System.out.print(min.get() + " " + max.get());

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
