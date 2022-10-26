package three_months_preparation.camel_case_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)) {
            while (in.hasNextLine()) {
                String[] words = in.nextLine().split(";");
                String operation = words[0];
                String type = words[1];
                String word = words[2];


                List<String> strings = new ArrayList<>(0);
                String join = "";
                if(operation.equals("S")) {
                    StringBuilder s = new StringBuilder();
                    int i = 0;
                    while (i < word.length()) {
                        //iPad = i pad
                        //plasticCup() = plastic cup
                        //LargeSoftwareBook = large software book
                        if(Character.isUpperCase(word.charAt(i))) {
                            strings.add(s.toString());
                            s = new StringBuilder();
                            s.append(word.charAt(i));
                        } else {
                            s.append(word.charAt(i));
                            if(i == word.length() - 1) {
                                strings.add(s.toString());
                            }
                        }
                        i++;
                    }
                    join = String.join(" ", strings)
                            .replaceAll("[^a-zA-Z0-9 ]", "")
                            .toLowerCase();
                } else {
                    String[] s = word.split(" ");
                    if (type.equals("C")) {
                        for (int i = 0; i < s.length; i++) {
                            strings.add(toCapitize(s[i]));
                        }

                    } else if (type.equals("M")) {
                        for (int i = 0; i < s.length; i++) {
                            if(i > 0) {
                                strings.add(toCapitize(s[i]));
                            } else{
                                strings.add(s[i]);
                            }
                        }
                        strings.add("()");
                    } else {
                        for (int i = 0; i < s.length; i++) {
                            if(i > 0) {
                                strings.add(toCapitize(s[i]));
                            } else {
                                strings.add(s[i]);
                            }
                        }
                    }
                    join = String.join("", strings);
                }
                System.out.println(join.trim());
            }
        }
    }

    private static String toCapitize(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}
