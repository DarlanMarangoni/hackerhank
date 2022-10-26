package core.one_d_array;

import java.util.*;

public class Solution {
    public static boolean canWin(int leap, int[] game) {
        int size = game.length;
        int origem = 0;
        while (origem < size) {
            if (origem == size - 1 || origem + leap >= size) {
                return true;
            }
            if (game[origem + 1] == 0) {
                origem++;
            } else if (leap > 1 && game[origem + leap] == 0) {
                origem = origem + leap;
            } else if (origem > 0 && game[origem - 1] == 0) {
                game[origem] = 3;
                origem--;
            } else {
                if (origem == 0 && game[origem + 1] != 0 && game[origem + leap] != 0) {
                    return false;
                } else {
                    for (int i = 0; i < size; i++) {
                        if(game[i] == 3) {
                            game[i] = 0;
                        }
                    }
                    game[origem] = 2;
                    return canWin(leap, game);
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }
//            System.out.println(n + " " + leap);
            System.out.println((canWin(leap, game)) ? " YES" : " NO");
        }
        scan.close();
    }
}
