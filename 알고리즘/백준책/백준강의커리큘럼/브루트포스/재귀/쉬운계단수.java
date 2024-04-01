package 알고리즘.백준책.백준강의커리큘럼.브루트포스.재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 쉬운계단수 {
    //10844

    // 숫자가 인접해 있으면,( 차이가 1) 계단수라고 표현하고 n이 주어지면 계단수가 총 몇개인 구하자 0은 아님
    // 1,000,000,000 나눈 수로 출력

    private static int count = 0;
    private static int t;
    private final static long MOD = 1000000000;
    private static Long[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());

        dp = new Long[t + 1][10];

        for (int i = 0; i < 10; i++) {
            dp[1][i] = 1L;
        }

        long result = 0;

        for (int i = 1; i <= 9; i++) {
            result += dfs(t, i);
        }
        System.out.println(result % MOD);
            
    }


    private static Long dfs(int digit, int num) {

        if (digit == 1) {
            return dp[digit][num];
        }

        // depth를 호출할 때 depth의 값은 dp[]에 저장된 그 값만 return하는데 count를 어디에서 채워야할까..

        if (dp[digit][num] == null) {

            if (num == 0) {
                dp[digit][num] = dfs(digit -1, 1);
            } else if (num == 9) {
                dp[digit][num] = dfs(digit - 1, 8);
            } else
                dp[digit][num] = dfs(digit -1, num - 1) + dfs(digit -1, num + 1);
        }

        return dp[digit][num] % MOD;
    }

}
