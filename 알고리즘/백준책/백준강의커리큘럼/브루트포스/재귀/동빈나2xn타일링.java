package 알고리즘.백준책.백준강의커리큘럼.브루트포스.재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 동빈나2xn타일링 {

    //11726 f(n) = f(n-2) + f(n-1)

    private static Integer[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        dp = new Integer[t +1];


        System.out.println(dp(t));



    }

    private static int dp(int t) {

        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;

        if (dp[t] == null) {

            return dp[t] = (dp(t - 2) + dp(t - 1)) % 10007;

        }
        return dp[t] % 10007;



    }


}
