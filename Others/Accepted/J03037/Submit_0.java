/*
	Run time: 0.15s
	Memory: 29844Kb
*/
import java.util.Scanner;
public class j03037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] c = sc.nextLine().trim().toCharArray();
        int[] dem = new int[26];
        int cnt = 0;
        for (int i = 0; i < 52; i++) {
            boolean ok = false;
            int j;
            for (j = i + 1; j < 52; j++) {
                if (c[i] == c[j]) {
                    ok = true;
                    break;
                }
                dem[c[j] - 'A']++;
            }

            if (ok) {
                for (int l = i; l < j; l++) {
                    if (dem[c[l] - 'A'] == 1) {
                        cnt++;
                    }
                    dem[c[l] - 'A'] = 0;
                }
            }
            for (int k = 0; k < 26; k++) {
                dem[k] = 0;
            }

        }
        System.out.println(cnt / 2);

        sc.close();
    }
}