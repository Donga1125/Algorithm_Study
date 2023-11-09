package 기초1.Day20.이재우;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 동물원 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());

        long[] dp = new long[n + 1];

        for(int i = 1 ; i <= n ; i++) {
            if(i == 1) {
                dp[i] = 3;
            }
            else if(i == 2) {
                dp[i] = 7;
            }
            else {
                dp[i] = (2 * dp[i - 1] + dp[i - 2])  % 9901;
            }
        }

        System.out.println(dp[n]);
    }
}
