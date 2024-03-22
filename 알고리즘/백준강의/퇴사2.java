package 알고리즘.백준강의;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 퇴사2 {
    //15486

    //n이 150,000이다 2^150.--- 이라 완탐 불가 dp류 해결

   private static int[][] dp;
    private static int n;
    private static int sum = Integer.MIN_VALUE;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());


        dp = new int[n][2];



        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            dp[i][0] = Integer.parseInt(st.nextToken()); // 시간
            dp[i][1] = Integer.parseInt(st.nextToken()); // 금액

        }

        dfs(0,0);

        System.out.println(sum);




    }

    private static void dfs(int day, int pay) {
        
        if (day >= n) {
            sum = Math.max(sum, pay);
            return;
        }

        if (day + dp[day][0] <= n) { // 시간
            dfs(day + dp[day][0], pay + dp[day][1]);

        } else {
            dfs(day + dp[day][0], pay);
        }
        dfs(day + 1, pay);

    }


}
