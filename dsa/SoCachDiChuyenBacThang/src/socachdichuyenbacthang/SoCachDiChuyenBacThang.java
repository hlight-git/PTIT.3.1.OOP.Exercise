public static void main(String[] args) throws Exception {
        long F[] = new long[10005];
        long pr[] = new long[10005];
        long M = 1000000007;
        int n,k,t;
        Scanner scan = new Scanner(System.in);
        t = scan.nextInt();
        F[0]=1;
        pr[0]=1;
        while (t-- > 0) {
            n = scan.nextInt();
            k = scan.nextInt();
            for (int i = 1; i <= n; i++) {
                if (i > k) {
                    F[i] = (pr[i - 1] - pr[i - 1 - k]) % M;
                } else {
                    F[i] = pr[i - 1];
                }
                pr[i] = (F[i] + pr[i - 1]) % M;
            }
            System.out.println(F[n]);
        }
    }