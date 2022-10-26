package three_months_preparation.divisible_sum_pair;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            int k = in.nextInt();

            List<Integer> arr = new ArrayList<>(0);
            for (int i = 0; i < n; i++) {
                arr.add(in.nextInt());
            }

            System.out.println(divisibleSumPairs(n, k, arr));
        }
    }

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        int count = 0;
        for (int i = 0; i < ar.size(); i++) {
            for (int j = i+1; j < ar.size(); j++) {
                if((ar.get(i) + ar.get(j)) % k == 0) {
                    count++;
                }
            }
        }
        return count;
    }

}
