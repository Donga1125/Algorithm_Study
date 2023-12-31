package 기초1.Day21.임한준;

import java.util.Scanner;

public class 포도주시식 {

    /**
     * 문제 2156
     * 효주는 포도주 시식회에 갔다. 그 곳에 갔더니, 테이블 위에 다양한 포도주가 들어있는 포도주 잔이 일렬로 놓여 있었다.
     * 효주는 포도주 시식을 하려고 하는데, 여기에는 다음과 같은 두 가지 규칙이 있다.
     * 포도주 잔을 선택하면 그 잔에 들어있는 포도주는 모두 마셔야 하고, 마신 후에는 원래 위치에 다시 놓아야 한다.
     * 연속으로 놓여 있는 3잔을 모두 마실 수는 없다.
     * 효주는 될 수 있는 대로 많은 양의 포도주를 맛보기 위해서 어떤 포도주 잔을 선택해야 할지 고민하고 있다.
     * 1부터 n까지의 번호가 붙어 있는 n개의 포도주 잔이 순서대로 테이블 위에 놓여 있고, 각 포도주 잔에 들어있는 포도주의 양이 주어졌을 때, 효주를 도와 가장 많은 양의 포도주를 마실 수 있도록 하는 프로그램을 작성하시오.
     * <p>
     * 예를 들어 6개의 포도주 잔이 있고, 각각의 잔에 순서대로 6, 10, 13, 9, 8, 1 만큼의 포도주가 들어 있을 때, 첫 번째, 두 번째, 네 번째, 다섯 번째 포도주 잔을 선택하면 총 포도주 양이 33으로 최대로 마실 수 있다.
     * <p>
     * 입력
     * 첫째 줄에 포도주 잔의 개수 n이 주어진다. (1 ≤ n ≤ 10,000) 둘째 줄부터 n+1번째 줄까지 포도주 잔에 들어있는 포도주의 양이 순서대로 주어진다.
     * 포도주의 양은 1,000 이하의 음이 아닌 정수이다.
     * <p>
     * 출력
     * 첫째 줄에 최대로 마실 수 있는 포도주의 양을 출력한다.
     **/

    //아 첫 번째 포도주를 마시더라도 두번 째 포도주에선 마시지 않고 오는 경우도 계산..
    // int[][] dp = new int[n][3]; 0 = 3번째를 마시지 않은 상태, 1 = 3마신 상태고 1잔만 마신 상태, 2 = 3 마신 상태 2잔연속 마신 상태
    // dp[i][0] = Math.max(dp[i-1][1], dp[i-1][2]);
    // dp[i][1] = Math.max( Math.max(dp[i-2][0], dp[i-2][1]) , dp[i-2][2] ) + ans[i];
    // -2 마시지 않았을 때, 1잔 연속, 2잔 연속 
    //


    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] ans = new int[n+1];
        int[][] dp = new int[n+1][3];

        for(int i = 1; i <= n; i++) {
            ans[i] = sc.nextInt();
        }

        // 초기화
        int max = ans[1];
        dp[1][0] = 0;
        dp[1][1] = ans[1];
        dp[1][2] = 0;

        // n이 1인 경우를 대비해 예외처리
        if(n >= 2) {
            dp[2][0] = dp[1][1];
            dp[2][1] = ans[2];
            dp[2][2] = dp[1][1] + ans[2];
            max = dp[2][2];
        }

        // dp
        for(int i = 3; i <= n; i++) {
            // 현재 포도주를 마시지 않을 경우
            dp[i][0] = Math.max(dp[i-1][1], dp[i-1][2]);
            // 현재 포도주를 마시고, 연속으로 1잔만 마신 경우
            dp[i][1] = Math.max(Math.max(dp[i-2][1], dp[i-2][2]), dp[i-2][0]) + ans[i];
            // 현재 포도주를 마시고, 지금까지 연속해서 2잔 마신 경우
            dp[i][2] = dp[i-1][1] + ans[i];

            // 최댓값을 비교 
            if(max < dp[i][0]) max = dp[i][0];
            if(max < dp[i][1]) max = dp[i][1];
            if(max < dp[i][2]) max = dp[i][2];
        }

        System.out.print(max);
    }
}

