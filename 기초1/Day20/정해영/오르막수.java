package 기초1.Day20.정해영;

import java.util.Arrays;
import java.util.Scanner;

public class 오르막수 {

    static int MOD = 10007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //이전자리만 고려하면 된다.

        int n = sc.nextInt();  //자리

        int[][] dp = new int[n + 1][10];//n:자리수 10:마지막수

        Arrays.fill(dp[1], 1);

        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = j; k < 10; k++) {
                    dp[i][j] += dp[i - 1][k];
                    dp[i][j] %= MOD;
                }
            }
        }

        System.out.println(Arrays.stream(dp[n]).sum()%MOD);
        sc.close();
    }
}
