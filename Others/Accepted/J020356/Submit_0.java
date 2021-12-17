/*
	Run time: 0.53s
	Memory: 29564Kb
*/
import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int s = in.nextInt();
        if (s / 9 > n) System.out.println("-1 -1");
        else if (s / 9 == n) {
            if (s % 9 == 0) {
                for (int i = 1; i <= n; i++) System.out.print("9" + " ");
                for (int i = 1; i <= n; i++) System.out.print("9");
            } else System.out.println("-1 -1");
        } else if (s / 9 < n && s != 0) {
            if (s % 9 == 0) {
                System.out.print(1);
                for (int i = 1; i < n - s / 9; i++) System.out.print(0);
                System.out.print("8" + " ");
                for (int i = 1; i < s / 9; i++) System.out.print(9);
                for (int i = 0; i < n - s / 9; i++) System.out.print(0);
                System.out.println(s % 9);
            } else {
                if (n - s / 9 == 1) {
                    System.out.print(s % 9);
                    for (int i = 0; i < s / 9; i++) System.out.print(9);
                    System.out.print(" ");
                    for (int i = 0; i < s / 9; i++) System.out.print(9);
                    System.out.println(s % 9);
                } else {
                    System.out.print(1);
                    for (int i = 1; i < n - s / 9 - 1; i++) System.out.print(0);
                    System.out.print(s % 9 - 1);
                    for (int i = 1; i <= s / 9; i++) System.out.print(9);
                    System.out.print(" ");
                    for (int i = 0; i <= s / 9 - 1; i++) System.out.print(9);
                    System.out.print(s % 9);
                    for (int i = 1; i < n - s / 9; i++) System.out.print(0);
                }
            }
        } else if (s == 0 && s / 9 < n) System.out.println("-1 -1");
    }
}