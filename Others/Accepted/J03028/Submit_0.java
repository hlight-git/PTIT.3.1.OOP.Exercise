/*
	Run time: 0.49s
	Memory: 73520Kb
*/
import java.util.*;
public class j03028 {
    public final static char[] b = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
            'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };

    public static int CharVal(char s) {
        for (int i = 0; i < 25; i++) {
            if (s == b[i])
                return i;
        }
        return 25;
    }

    public static int SumVal(String s) {
        int sum = 0;
        for (char i: s.toCharArray()) {
            sum += CharVal(i);
        }
        return sum;
    }

    public static String RotateString(String s, int n) {
        String s1 = "";
        for (char i: s.toCharArray()) {
            int m = CharVal(i) + n;
            while (m > 25) {
                m -= 26;
            }
            s1 += String.valueOf(b[m]);
        }
        return s1;
    }

    public static char RotateChar(char x, char y) {
        int n = CharVal(x) + CharVal(y);
        if (n > 25)
            n -= 26;
        return b[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            String s1 = s.substring(0, s.length()/2);
            String s2 = s.substring(s.length()/2, s.length());
            String n = RotateString(s1, SumVal(s1));
            String m = RotateString(s2, SumVal(s2));
            String chuoiDRM = "";
            for (int i = 0; i < n.length(); i++) {
                chuoiDRM += String.valueOf(RotateChar(n.charAt(i), m.charAt(i)));
            }
            System.out.println(chuoiDRM);
        }
        sc.close();
    }
}