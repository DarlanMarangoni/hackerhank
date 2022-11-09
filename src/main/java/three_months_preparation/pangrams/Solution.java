package three_months_preparation.pangrams;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

class Result {

    /*
     * Complete the 'pangrams' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String pangrams(String s) {

        String s2 = s.toLowerCase();
        List<Character> characters = new ArrayList<>(0);
        characters.add((char) 32);
        for (int i = 97; i <= 122; i++) {
            characters.add((char) i);
        }
        Optional<Character> any = characters
                .stream()
                .filter(character -> !s2.contains(String.valueOf(character)))
                .findAny();
        if (any.isEmpty()) {
            return "pangram";
        }
        return "not pangram";

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        try(Scanner in = new Scanner(System.in)) {
            String s = in.nextLine();
            System.out.println(Result.pangrams(s));
        }
    }
}
