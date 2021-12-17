/*
	Run time: 0.34s
	Memory: 29020Kb
*/
import java.util.*;

public class main {
    public static boolean isNotDecrease(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) > s.charAt(i + 1)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        while (in.hasNext()) {
            String s = in.next();
            if (!lhm.containsKey(s) && isNotDecrease(s)) lhm.put(s, 1);
            else if (lhm.containsKey(s)) lhm.put(s, lhm.get(s) + 1);
        }
        ArrayList<String> a = new ArrayList<>();
        for (String s : lhm.keySet())
            a.add(s);
        Collections.sort(a, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (lhm.get(o1) <= lhm.get(o2)) return 1;
                return -1;
            }
        });
        for (String s : a)
            System.out.println(s + " " + lhm.get(s));
    }
}