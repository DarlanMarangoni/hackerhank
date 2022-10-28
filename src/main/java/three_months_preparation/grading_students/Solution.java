package three_months_preparation.grading_students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            List<Integer> grading = new ArrayList<>(0);
            for (int i = 0; i < n; i++) {
                grading.add(in.nextInt());
            }
            System.out.println(gradingStudents(grading));
        }
    }

    private static List<Integer> gradingStudents(List<Integer> grades) {
        return grades
                .stream()
                .map(m -> {
                    if (m < 38) {
                        return m;
                    }
                    int dezena = m - m % 5;
                    if (m % 5 > 2) {
                        return dezena + 5;
                    }
                    return m;
                }).collect(Collectors.toList());
    }
}
