package 기초1.Day20.이재우;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 오르막수 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());

        //dp[i][j] 에서 i는 자릿수, j는 시작하는 가장 앞자리 숫자
        long[][] dp = new long[1001][10];

        for(int i = 0 ; i < 10 ; i++) {
            dp[0][i] = 0;
            dp[1][i] = 1;
        }
        //점화식 dp[i][j] = dp[i - 1][j]
        for(int i = 2 ; i < n + 1 ; i++) {
            for(int j = 0 ; j < 10 ; j++) {
                for(int k = j ; k < 10 ; k++) {
                    dp[i][j] += (dp[i - 1][k] % 10007);
                }
            }
        }
        long result = 0;

        for(int i = 0 ; i < 10 ; i++) {
            result += dp[n][i];
        }

        System.out.println(result % 10007);
    }
}
