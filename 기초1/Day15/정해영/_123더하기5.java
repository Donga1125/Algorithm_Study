package 기초1.Day15.정해영;

import java.util.Scanner;

public class _123더하기5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        long[][] dp = new long[100001][4];

        dp[1][1] = 1; // 1
//        dp[2][1] = 1; // 1+1
        dp[2][2] = 1; // 2
        dp[3][1] = 1; // 2+1
        dp[3][2] = 1; // 1+2
        dp[3][3] = 1; // 3

        for(int i=4; i<=100000; i++){
            dp[i][1] = (dp[i-1][2] + dp[i-1][3]) % 1_000_000_009;
            dp[i][2] = (dp[i-2][1] + dp[i-2][3]) % 1_000_000_009;
            dp[i][3] = (dp[i-3][1] + dp[i-3][2]) % 1_000_000_009;
        }

        for(int i=1; i<=t; i++){
            int n = sc.nextInt();
            System.out.println((dp[n][1] + dp[n][2] + dp[n][3]) % 1_000_000_009);
        }

        sc.close();
    }
}
