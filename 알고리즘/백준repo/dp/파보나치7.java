package 알고리즘.백준repo.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 파보나치7 {

    //15624

    static long dp[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        dp = new long [1000001];

        Arrays.fill(dp, -1);

        System.out.println(fibo(n) % 1000000007);

    }

    private static long fibo(int n) {

        dp[0] = 0;
        dp[1] = 1;


        if (dp[n] == -1) {
            return dp[n] = ((fibo(n - 1) + fibo(n - 2)) % 1000000007);
        }

        return dp[n] % 1000000007;

    }
}
