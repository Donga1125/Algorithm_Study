package 알고리즘.백준강의;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 퇴사dfs2 {
    //14501

    //일에 걸리는 소요시간과 금액을 잘 배합해서 최적의 이익을 얻어야 한다. 퇴사일이 주어질 때

    //n이 15라서 완탐가능 dfs만 돌려도 됨

   private static int[][] dp;
    private static int n;
    private static int max = Integer.MIN_VALUE;


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

        System.out.println(max);




    }

    private static void dfs(int day, int benefit) {

        max = Math.max(benefit, max); // 마지막 날에 우리가 계산하는 게 아니라 돌 때 마다 max값을 갱신해줘야한다
        // 막날이 꼭 최대가 아니라서

        if (day >= n) {
            return;
        }

        if (day + dp[day][0] <= n) { //상담이 가능하다면 ?
            dfs(day + dp[day][0], benefit + dp[day][1]);

        } else { // 상담이 불가능하다면 ?
            dfs(day + 1, benefit);

        }

    }


}
