package three_months_preparation.time_conversion;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Result {
    private static final String AM = "AM";
    private static final String PM = "PM";
    private static final String EMPTY = "";

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        if (s.contains(AM)) {
            if (s.startsWith("12")) {
                return s.replaceFirst("12", "00")
                        .replace(AM, EMPTY);
            }
            return s.replace(AM, EMPTY);
        } else {
            if (s.startsWith("12")) {
                return s.replace(PM, EMPTY);
            }
            Map<String, String> hourMap = new HashMap<>();
            hourMap.put("01", "13");
            hourMap.put("02", "14");
            hourMap.put("03", "15");
            hourMap.put("04", "16");
            hourMap.put("05", "17");
            hourMap.put("06", "18");
            hourMap.put("07", "19");
            hourMap.put("08", "20");
            hourMap.put("09", "21");
            hourMap.put("10", "22");
            hourMap.put("11", "23");
            return s.replace(s.substring(0, 2), hourMap.get(s.substring(0, 2)))
                    .replace(PM, EMPTY);
        }
    }

}

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String result = Result.timeConversion(in.nextLine());
        System.out.println(result);
    }
}
