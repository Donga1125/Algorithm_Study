package 알고리즘.백준repo.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 투xn타일링투 {

    //11727

    // 2xn 타일링을 잘 생각해보자 마지막에 채우는 경우가 3가지인데, 1x2이 나오면 -2로 따지자

    private static int t;
    private static Integer[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        dp = new Integer[t + 1];


        System.out.println(dp(t));



    }

    private static Integer dp(int n) {

        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 3;

        if (dp[n] == null) {
            return dp[n] = (dp(n - 2) + dp(n - 1) + dp(n -1)) % 10007;
        }

        return dp[n] % 10007;
    }
}
