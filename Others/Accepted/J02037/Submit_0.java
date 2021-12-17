/*
	Run time: 0.12s
	Memory: 30268Kb
*/
import java.util.*;

public class J02037 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while (t-- > 0) {
            String s[] = in.nextLine().split(" ");
            int cnt = 0;
            for (int i = 0; i < s.length; i++) {
                if (Integer.parseInt(s[i]) % 2 == 0) cnt++;
                else cnt--;
            }
            if (s.length % 2 == 0 && cnt > 0) System.out.println("YES");
            else if (s.length % 2 == 1 && cnt < 0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}