package 알고리즘.백준repo.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 조합 {
    //nCm을 의 답을 출력하라

    private static int dp[][];
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());



        dp = new int[n + 1][m +1];

        System.out.println(dp(n, m));

    }

    private static int dp(int n, int m) {

        if (m == 0 || n == m) { // 기저 조건 조합의 성질 중 하나
            return dp[n][m] = 1;
        }

        if (dp[n][m] > 0) {
            return dp[n][m];

        } else
            return dp[n][m] = dp(n - 1, m - 1) + dp(n - 1, m);
        // 조합의 성질을 재귀조건으로 n-1,r-1 + n-1,r로 만들어줌





    }
}
