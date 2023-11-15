package 기초1.Day24.임한준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 타일채우기 {

    /**
     문제 2133
     3×N 크기의 벽을 2×1, 1×2 크기의 타일로 채우는 경우의 수를 구해보자.

     입력
     첫째 줄에 N(1 ≤ N ≤ 30)이 주어진다.

     출력
     첫째 줄에 경우의 수를 출력한다.
     */

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        // N(1 <= N <= 30)
        int n = Integer.parseInt(br.readLine());

        // N은 1부터 시작하기 때문에 N + 1의 크기를 갖는 배열을 선언한다.
        int[] DP = new int[n + 1];


        // N이 홀수일 경우, 2x1 or 1x2의 타일로 채울 수 없기 때문에 0을 출력하고 return
        if (n % 2 != 0) {
            System.out.println(0);
            return;
        }

        // 타일이 없을 경우 2x1, or 1x2의 타일로 채울 수 있는 경우의 수는 아무것도 채우지 않는 경우이다
        DP[0] = 1;

        // 3x1 타일을 채울 수 있는 경우의 수는 0개이다.
        DP[1] = 0;

        // 3x2 타일을 채울 수 있는 경우의 수는 3개이다.
        DP[2] = 3;

        // N은 홀수가 될 수 없고 짝수만 될 수 있기 때문에 2씩 증가를 한다.
        for (int i = 4; i <= n; i += 2) {
            DP[i] = DP[i - 2] * DP[2];
            for (int j = i - 4; j >= 0; j -= 2) {
                DP[i] = DP[i] + (DP[j] * 2);
            }
        }

        // 결과값 출력
        System.out.println(DP[n]);
    }
}
