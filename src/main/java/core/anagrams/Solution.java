package core.anagrams;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        try (var in = new Scanner(System.in)) {
            var s1 = in.next().toLowerCase();
            var s2 = in.next().toLowerCase();

            List<Obj> l1 = new ArrayList<>(0);
            List<Obj> l2 = new ArrayList<>(0);
            for (int i = 0; i < s1.length(); i++) {
                String s = String.valueOf(s1.charAt(i));
                if (l1.stream().noneMatch(c -> c.letter.equals(s))) {
                    l1.add(new Obj(s));
                }
                l1.stream()
                        .filter(c -> c.letter.equals(s))
                        .findFirst()
                        .ifPresent(Obj::increment);
            }
            for (int i = 0; i < s2.length(); i++) {
                String s = String.valueOf(s2.charAt(i));
                if (l2.stream().noneMatch(c -> c.letter.equals(s))) {
                    l2.add(new Obj(s));
                }
                l2.stream()
                        .filter(c -> c.letter.equals(s))
                        .findFirst()
                        .ifPresent(Obj::increment);
            }

            l1.sort(Comparator.comparing(c -> c.letter));
            l2.sort(Comparator.comparing(c -> c.letter));


            boolean isAnagram = true;
            if (l1.size() != l2.size()) {
                isAnagram = false;
            } else {
                for (int i = 0; i < l1.size(); i++) {
                    var temp1 = l1.get(i);
                    var temp2 = l2.get(i);
                    if(!temp1.letter.equals(temp2.letter) || temp2.amount != temp1.amount ) {
                        isAnagram = false;
                        break;
                    }
                }
            }
            System.out.println(isAnagram ? "Anagrams" : "Not Anagrams");

        }

    }

    private static class Obj {

        String letter;
        int amount;

        public Obj(String s) {
            this.letter = s;
            amount++;
        }

        void increment() {
            this.amount++;
        }
    }
}
