package 기초1.Day22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 정수삼각형 {

    /**
     *
     문제 1932
     7
     3   8
     8   1   0
     2   7   4   4
     4   5   2   6   5
     위 그림은 크기가 5인 정수 삼각형의 한 모습이다.
     맨 위층 7부터 시작해서 아래에 있는 수 중 하나를 선택하여 아래층으로 내려올 때,
     이제까지 선택된 수의 합이 최대가 되는 경로를 구하는 프로그램을 작성하라.
     아래층에 있는 수는 현재 층에서 선택된 수의 대각선 왼쪽 또는 대각선 오른쪽에 있는 것 중에서만 선택할 수 있다.
     삼각형의 크기는 1 이상 500 이하이다. 삼각형을 이루고 있는 각 수는 모두 정수이며, 범위는 0 이상 9999 이하이다.

     입력
     첫째 줄에 삼각형의 크기 n(1 ≤ n ≤ 500)이 주어지고, 둘째 줄부터 n+1번째 줄까지 정수 삼각형이 주어진다.

     출력
     첫째 줄에 합이 최대가 되는 경로에 있는 수의 합을 출력한다.
     **/

    //dp[n][i] = Math.max(dp[n+1][i],dp[n+1][i+1]) + dp[n][i] 다 찾아야 하네.. x
    // 이러면 현재 수에 저장하고
    //dp[n-1][i] = Math.max(dp[n][i],dp[n][i+1]) + dp[n-1][i]
    // 이러면 양 옆 수들은 비교가 안되네 조건
    // bufferedReader vs Scanner
    public static void main(String[] args) throws IOException {
        

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int dp[] = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int cost[] = new int[i + 1];
            // 입력 받은 데이터 저장

            for (int j = 1; j <= i; j++) {
                cost[j] = Integer.parseInt(st.nextToken());
            }
            // 마지막 인덱스 비교 후 값 저장하기
            for (int j = i; j > 0; j--) {
                dp[j] = Math.max(dp[j], dp[j - 1]) + cost[j];
            }
        }
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            ans = Math.max(ans, dp[i]);
        }
        System.out.println(ans);
    }
}
