package three_months_preparation.lonely_integer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            List<Integer> integers = new ArrayList<>(0);
            for (int i = 0; i < n; i++) {
                integers.add(in.nextInt());
            }
            System.out.println(lonelyinteger(integers));
        }
    }

    private static int lonelyinteger(List<Integer> integers) {
        integers.sort(Comparator.naturalOrder());
        int unique = 0;
        for (int i = 0; i < integers.size(); i = i + 2) {
            if (i == integers.size() - 1 || i < integers.size() - 1 && !integers.get(i).equals(integers.get(i + 1))) {
                unique = integers.get(i);
                break;
            }
        }
        return unique;
    }

}
