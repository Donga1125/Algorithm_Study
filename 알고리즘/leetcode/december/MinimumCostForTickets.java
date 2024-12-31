package 알고리즘.leetcode.december;

import java.util.HashSet;

public class MinimumCostForTickets {

    // 983. Minimum Cost For Tickets
    // 1년동안 기차여행할 때 기차에 탈 떄 드는필요한 최소 비용
    // 데이 배열 1-365 사이 정수, i는 여행해야하는 특정 날짜를 뜻함
    // 즉 기차를 탈 때의 날인것이다.
    // 1일권 3일권 7일권이 있다. 1일권은 0,1,2의 코스트 인덱스를 가짐
    // 주어진 날짜를 모두 여행하기 위한 최소 비용을 구하라

    public static void main(String[] args) {

        int[] days = new int[]{1, 4, 6, 7, 8, 20};
        int[] cost = new int[]{2, 7, 15};
        MinimumCostForTickets main = new MinimumCostForTickets();
        main.mincostTickets(days, cost);

    }

    // 점화식
    // dp[i] = min(dp[i-1] + costs[0], dp[i-7] + costs[1], dp[i-30] + costs[2])


    public int mincostTickets(int[] days, int[] costs) {


        HashSet<Integer> travelDays = new HashSet<>();
        for (int day : days) {
            travelDays.add(Integer.valueOf(day));

        }

        int dp[] = new int[366]; // dp는 1년 기준 1~365까지
        dp[0] = 0;

        for (int i = 1; i <= 365; i++) {

            if (!travelDays.contains(i)) {
                // 현재 날이 여행하는 날이 아니라면, 그전 dp 그대로 이월
                dp[i] = dp[i - 1];
            } else {
                int cost1Day = dp[i - 1] + costs[0]; // 1일권
                int cost7Day = dp[Math.max(0, i - 7)] + costs[1]; // 7일권
                // 음수 에러를 위해 -7일권이 음수라면 0으로 저장
                int cost30Day = dp[Math.max(0, i - 30)] + costs[2]; // 30일권
                dp[i] = Math.min(cost1Day, Math.min(cost7Day, cost30Day));
                // 현재는
        }
    }
        return dp[365];
}}
