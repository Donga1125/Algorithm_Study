package 기초1.Day13.정해영;

import java.util.Scanner;


public class _2xn타일링2 {

    static int[] dp = new int[1001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(tiling(n));
        sc.close();
    }

    public static int tiling(int n){

        if(n == 1) return 1;
        if(n == 2) return 3;

        if(dp[n] == 0){
            dp[n] = (tiling(n-1) + (tiling(n-2) * 2)) % 10007;
        }
        return dp[n];
    }
}
