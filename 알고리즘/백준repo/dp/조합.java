package 알고리즘.백준repo.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class 조합 {
    //nCm을 의 답을 출력하라
    // long의 범위도 넘어선다 bigInteger라는 문자열 형태로 가야한다 주어진 주에서 최대 수를 계산을 항상 먼저하자

    private static BigInteger[][] dp;

    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        dp = new BigInteger[n+1][m+1];




        System.out.println(dp(n, m));

    }

    private static BigInteger dp(int n, int m) {

        if (dp[n][m] > 0) {
            return dp[n][m];

        }

        if (n == m || m == 0) { // 기저 조건 조합의 성질 중 하나
            return dp[n][m] = 1;
        }


        return dp[n][m] = dp(n - 1, m - 1) + dp(n - 1, m);
        // 조합의 성질을 재귀조건으로 n-1,r-1 + n-1,r로 만들어줌





    }
}
