package 알고리즘.백준repo.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class fourSquares정답 {

    //17626
    //최소한의 제곱근을 만들어라

    private static int[] dp;
    private static int min = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        dp = new int[n + 1];
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            min = Integer.MAX_VALUE; // min 값을 초기화
            for (int j = 1; j * j <= i; j++) { // 제곱근 확인
                int temp = i - j * j; // 제곱근 빼고 남은 수랑 비교하기 위해
                min = Math.min(min, dp[temp]); // 작은 수를 저장해주고

            }

            //dp[i]가 저장되는 과정은 i보다 작은 제곱근을 구해서  예로 i가 4라면 제곱근은 1과 2 두개가 있는데
            // 그보다 작은 수

            dp[i] = min + 1;
        }

        System.out.println(dp[n]);




    }



}
