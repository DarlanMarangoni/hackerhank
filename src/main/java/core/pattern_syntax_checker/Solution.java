package core.pattern_syntax_checker;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int n = Integer.parseInt(in.nextLine());
            for (int i = 0; i < n; i++) {
                String pattern = in.nextLine();
                try {
                    Pattern.compile(pattern);
                    System.out.println("Valid");
                } catch (Exception ex) {
                    System.out.println("Invalid");
                }
            }
        }
    }
}