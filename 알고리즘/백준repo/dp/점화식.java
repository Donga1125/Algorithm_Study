package 알고리즘.백준repo.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 점화식 {

    private static long[] dp;
    //13699

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        dp = new long[t + 1];

        dp[0] = 1;
        dp[1] = 1;


        for (int i = 2; i <= t; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] = dp[i] + (dp[j] * dp[i - 1 - j]);
            }


    }
        System.out.println(dp[t]);


    }
}
