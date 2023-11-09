package 기초1.Day20.정해영;

import java.util.Scanner;

public class 동물원 {

    static int ZERO = 0;
    static int Left = 1;
    static int Right = 2;
    static int MOD = 9901;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //우리의 크기 n

        long[][] dp = new long[n+1][3];

        dp[1][ZERO] = 1;
        dp[1][Left] = 1;
        dp[1][Right] = 1;

        for(int i=2; i<=n; i++){
            dp[i][ZERO] = (dp[i-1][ZERO] + dp[i-1][Left] + dp[i-1][Right]) % MOD;
            dp[i][Left] = (dp[i-1][ZERO] + dp[i-1][Right]) % MOD;
            dp[i][Right] = (dp[i-1][Left] + dp[i-1][ZERO]) % MOD;
        }

        System.out.println((dp[n][ZERO] + dp[n][Left] + dp[n][Right]) % MOD);
        sc.close();
    }
}
