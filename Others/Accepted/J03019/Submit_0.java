/*
	Run time: 0.20s
	Memory: 32560Kb
*/

import java.util.*;
public class j03019tanh {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        StringBuilder ans=new StringBuilder();
        char max_char=s.charAt(s.length()-1);
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)>=max_char){
                max_char=s.charAt(i);
                ans.append(s.charAt(i));
            }
        }
        ans.reverse();
        System.out.println(ans);
    }
}
