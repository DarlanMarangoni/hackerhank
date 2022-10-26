package three_months_preparation.sparse_array;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            List<String> strings = new ArrayList<>(0);
            for (int i = 0; i < n; i++) {
                strings.add(in.next());
            }
            int q = in.nextInt();
            List<String> queries = new ArrayList<>(0);
            for (int i = 0; i < q; i++) {
                queries.add(in.next());
            }
            List<Integer> integers = matchingStrings(strings, queries);
            integers.forEach(System.out::println);
        }
    }

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        ArrayList<Integer> integers = new ArrayList<>(0);
        for (String q : queries) {
            int count = 0;
            for (String s : strings) {
                if (s.equals(q)) {
                    count++;
                }
            }
            integers.add(count);
        }
        return integers;
    }
}
