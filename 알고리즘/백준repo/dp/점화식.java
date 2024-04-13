package 알고리즘.백준repo.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 점화식 {

    private static int[] dp;
    //13699

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        dp = new int[t + 1];

        System.out.println(dp(t));

    }

    private static int dp(int t) {

        dp[0] = 1;


        for (int i = 0; i < t; i++) {
            dp[t] = dp(i) * dp(t - 1);
        }

        return dp[t];
    }
}
