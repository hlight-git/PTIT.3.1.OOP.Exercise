/*
	Run time: 0.16s
	Memory: 28608Kb
*/
/*
*   BAKACHAN
*/

import java.util.*;

public class main {
    public static boolean isPunctuation(char c) {
        if (c == '.' || c == '!' || c == '?') return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String words[] = new String[10005];
        int size = 0;
        while (in.hasNextLine()) {
            String str = in.nextLine().trim();
            String s[] = str.toLowerCase().split("\\s+");
            for (int i = 0; i < s.length; i++)
                words[size++] = s[i];
        }
        int state = 1, check = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i] == null) break;
            if (isPunctuation(words[i].charAt(words[i].length() - 1))) check = 1;
            if (state == 1) {
                System.out.print(words[i].toUpperCase().charAt(0));
                if (check == 1) {
                    for (int j = 1; j < words[i].length() - 1; j++) System.out.print(words[i].charAt(j));
                    System.out.println();
                    check = 0;
                } else {
                    for (int j = 1; j < words[i].length(); j++) System.out.print(words[i].charAt(j));
                    System.out.print(" ");
                    state = 0;
                }
            } else {
                if (check == 1) {
                    for (int j = 0; j < words[i].length() - 1; j++) System.out.print(words[i].charAt(j));
                    System.out.println();
                    check = 0;
                    state = 1;
                } else System.out.print(words[i] + " ");
            }
        }
    }
}