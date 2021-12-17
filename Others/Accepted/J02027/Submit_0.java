/*
	Run time: 1.41s
	Memory: 92212Kb
*/
import java.util.*;
public class j02027 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt(),k=sc.nextInt();
            long dem=0;
            int a[]= new int [n+5];
            for(int i=0;i<n;i++) a[i]=sc.nextInt();
            Arrays.sort(a,0,n);
            for(int i=0;i<n-1;i++){
                int res=a[i]+k;
                int tmp=lower_bound(a,res,i,n);
//                System.out.println(tmp);
                dem+=tmp-i-1;
            }
            System.out.println(dem);
        }
    }
    public static int lower_bound(int a[],int x,int l,int r){
        while(l+1<r){
            int m=(l+r)>>>1;
            if(a[m]>=x) r=m;
            else l=m;
        }
        return r;
    }
}