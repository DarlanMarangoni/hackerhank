package core.string_tokens;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        try (var in = new Scanner(System.in)) {
            var s = in.nextLine().trim();
            if(!s.isEmpty()) {
                var s1 = s.split("[^A-Za-z]+");

                System.out.println(s1.length);
                for (var i = 0; i < s1.length; i++) {
                    System.out.println(s1[i]);
                }
            } else {
                System.out.println(0);
            }

        }
    }
}
