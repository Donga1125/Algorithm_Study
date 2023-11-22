package 기초2.Day28.임한준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 오르막수 {
    /**
     문제 11057
     오르막 수는 수의 자리가 오름차순을 이루는 수를 말한다. 이때, 인접한 수가 같아도 오름차순으로 친다.

     예를 들어, 2234와 3678, 11119는 오르막 수이지만, 2232, 3676, 91111은 오르막 수가 아니다.

     수의 길이 N이 주어졌을 때, 오르막 수의 개수를 구하는 프로그램을 작성하시오. 수는 0으로 시작할 수 있다.

     입력
     첫째 줄에 N (1 ≤ N ≤ 1,000)이 주어진다.

     출력
     첫째 줄에 길이가 N인 오르막 수의 개수를 10,007로 나눈 나머지를 출력한다.
     */

    // 수의 길이 n이 1이면 0123456789
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int dp[][] = new int[n + 1][10];

        for (int i = 0; i < 10; i++) {

            dp[0][i] = 1;
        }

        for (int i = 1; i < n + 1; i++) {

            for (int j = 0; j < 10; j++) {

                for (int k = j; k < 10; k++) {
                    dp[i][j] += dp[i - 1][k];
                    dp[i][j] %= 10007;
                }
            }
        }
        System.out.println(dp[n][0]);
    }

        }
