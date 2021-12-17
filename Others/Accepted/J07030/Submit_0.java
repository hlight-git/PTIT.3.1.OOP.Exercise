/*
	Run time: 2.42s
	Memory: 71708Kb
*/
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.*;

public class main {
    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> a1 = (ArrayList<Integer>) in.readObject();
        LinkedHashMap<Integer, Integer> lhm = new LinkedHashMap<>();
        in.close();
        in = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> a2 = (ArrayList<Integer>) in.readObject();
        for (Integer i : a2)
            lhm.put(i, 1);
        in.close();
        SortedSet<Integer> ts = new TreeSet<>(a1);
        for (Integer i : ts) {
            int j = 1000000 - i;
            if (j > i && lhm.containsKey(j)) {
                if (isPrime(i) && isPrime(j)) System.out.println(i + " " + j);
            }
        }
        in.close();
    }
}