package s212;

import java.util.Scanner;
import java.util.Stack;

public class S212 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        while(test-- >0){
            String line = sc.nextLine();
            Stack <Integer> s = new Stack<>();
            int cnt = 0;
            for(char ele:line.toCharArray()){
                if(ele == '('){
                    cnt += 1;
                    System.out.print(cnt + " ");
                    s.push(cnt);
                }
                else if(ele == ')'){
                    System.out.print(s.pop() + " ");
                }
            }
            System.out.println();
        }
    }
    
}
