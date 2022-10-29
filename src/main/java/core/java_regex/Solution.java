package core.java_regex;

import javax.swing.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        try(Scanner in = new Scanner(System.in)) {
            while(in.hasNext()){
                String IP = in.next();
                System.out.println(IP.matches(new MyRegex().pattern));
            }
        }
    }
}

class MyRegex {
    public String pattern;

    public MyRegex() {
        String partialPattern = "(0[0-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5]|1[0-9]|2[0-9]|3[0-9]|4[0-9]|5[0-9]|6[0-9]|7[0-9]|8[0-9]|9[0-9]|[0-9])";
        String pattern = partialPattern + "." + partialPattern + "." + partialPattern + "." + partialPattern;
        this.pattern = pattern;
    }
}