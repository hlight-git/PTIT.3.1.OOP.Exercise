/*
	Run time: 0.42s
	Memory: 37192Kb
*/
import java.util.*;


public class main {
    
    public static boolean isReversible(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l++) != s.charAt(r--)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        int lenMax = 0;
        while (in.hasNext()) {
            String s = in.next();
            if (!lhm.containsKey(s)) {
                if (s.length() > lenMax && isReversible(s)) {
                    lhm.clear();
                    lenMax = s.length();
                    lhm.put(s, 1);
                } else if (s.length() == lenMax && isReversible(s)) lhm.put(s, 1);
            } else lhm.put(s, lhm.get(s) + 1);
        }
        for (String s : lhm.keySet())
            System.out.println(s + " " + lhm.get(s));
    }
}