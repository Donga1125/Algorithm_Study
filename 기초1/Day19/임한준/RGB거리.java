package 기초1.Day19.임한준;

import java.util.Scanner;

public class RGB거리 {

    /** 1149
     * RGB거리에는 집이 N개 있다. 거리는 선분으로 나타낼 수 있고, 1번 집부터 N번 집이 순서대로 있다.
     집은 빨강, 초록, 파랑 중 하나의 색으로 칠해야 한다.
     각각의 집을 빨강, 초록, 파랑으로 칠하는 비용이 주어졌을 때, 아래 규칙을 만족하면서 모든 집을 칠하는 비용의 최솟값을 구해보자.

     1번 집의 색은 2번 집의 색과 같지 않아야 한다.
     N번 집의 색은 N-1번 집의 색과 같지 않아야 한다.
     i(2 ≤ i ≤ N-1)번 집의 색은 i-1번, i+1번 집의 색과 같지 않아야 한다.

     *입력
     첫째 줄에 집의 수 N(2 ≤ N ≤ 1,000)이 주어진다. 둘째 줄부터 N개의 줄에는 각 집을 빨강, 초록, 파랑으로 칠하는 비용이 1번 집부터 한 줄에 하나씩 주어진다. 집을 칠하는 비용은 1,000보다 작거나 같은 자연수이다.

     *출력
     첫째 줄에 모든 집을 칠하는 비용의 최솟값을 출력한다.
     */

    // 내 앞뒤 색과는 다른 색을 써야 하고, 집의 수가 주어 졌을 때, 매번 새로운 금액의 페인트 칠 비용을 준다.
    // 처음에 생각하길, 또 최솟 값만 찾아가는 형식이였는데.. 그러지 말고 전 수와 더해서 저장해서 비교하면 문제를 해결할 수 있다.


    static int n;

    static int dp[][], cost[][]; // DP 배열과 비용 배열을 선언
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        dp = new int[1001][3];
        cost = new int[1001][3]; // 받을 가격

        for(int i = 1 ;i <= n; i++) {
            for(int j = 0 ; j < 3; j++) {
                cost[i][j] = sc.nextInt();
            }
        }


        for(int i = 1 ; i <= n; i++) {

            // 점화식 빨 초 파 가격 비교해서 계속 쌓아주기 (i-1이 i랑 다르게 적용되게)
            dp[i][0] = Math.min(dp[i-1][1],dp[i-1][2]) + cost[i][0];
            dp[i][1] = Math.min(dp[i-1][0],dp[i-1][2]) + cost[i][1];
            dp[i][2] = Math.min(dp[i-1][1],dp[i-1][0]) + cost[i][2];
        }

        System.out.println(Math.min(dp[n][0], Math.min(dp[n][1], dp[n][2])));
    }
}





