package 기초1.Day18.임한준;

import java.util.Scanner;

public class 합분해 {

    /** 2225
     0부터 N까지의 정수 K개를 더해서 그 합이 N이 되는 경우의 수를 구하는 프로그램을 작성하시오.
     덧셈의 순서가 바뀐 경우는 다른 경우로 센다(1+2와 2+1은 서로 다른 경우). 또한 한 개의 수를 여러 번 쓸 수도 있다.

     첫째 줄에 두 정수 N(1 ≤ N ≤ 200), K(1 ≤ K ≤ 200)가 주어진다.
     */
    // 5 3 005 104 113 122 131 203 212 221 230 302 311 320 401 410 500
    // 005 014 023 032 041 0123
    // dp[N][K] = dp[N-1][K] + dp[N][K-1]  이게 점화식인데,
    // 0부터 10(n)까지 수를 가지고 정수 3(k)개의 수 중 마지막 수가 x라면 x 이전의 수들의 합은 10(n) - x가 나올 것 이다.
    // 예로 3 4 3 이라면 10 - 3 = (3+4)이런 식



    static int MOD = 1000000000;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int dp[][] = new int[N+1][K+1];

        // 초기화
        // 0개로 만들수 있는 것인 k=0일 땐 없고 1개로 만들수 있는 개수는 N, 자기 자신 1개 라서
        for(int i = 0; i <= N; i++) {
            dp[i][0] = 0;
            dp[i][1] = 1;
        }

        // N이 1일 경우 만들 수 있는 갯수는 K개
        for(int i=0; i <= K; i++) {
            dp[1][i] = i;
        }

        for(int i = 2; i <= N; i++) {
            for(int j = 2; j <= K; j++) {
                dp[i][j] = (dp[i-1][j] + dp[i][j-1]) % MOD;
            }
        }

        System.out.println(dp[N][K]);
    }
}
