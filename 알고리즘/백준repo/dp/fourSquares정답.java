package 알고리즘.백준repo.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class fourSquares {

    //17626
    //최소한의 제곱근을 만들어라

    private static int[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        dp = new int[n + 1];
        Arrays.fill(dp,50001);

        System.out.println(dp(n));

    }

    private static int dp(int n) {

        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;

        if (dp[n] > 50001) {

            return dp[n] = Math.max(dp(n / 2), dp(n - 1) + 1);

        }

        return dp[n];
    }
}
