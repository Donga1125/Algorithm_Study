package 기초1.Day22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 가장큰증가하는부분수열 {

    /**
     * 문제 11055
      수열 A가 주어졌을 때, 그 수열의 증가하는 부분 수열 중에서 합이 가장 큰 것을 구하는 프로그램을 작성하시오.
      예를 들어, 수열 A = {1, 100, 2, 50, 60, 3, 5, 6, 7, 8} 인 경우에 합이 가장 큰 증가하는 부분 수열은 A = {1, 100, 2, 50, 60, 3, 5, 6, 7, 8} 이고,
     합은 113이다.

      입력

      둘째 줄에는 수열 A를 이루고 있는 Ai가 주어진다. (1 ≤ Ai ≤ 1,000)

      출력
      첫째 줄에 수열 A의 합이 가장 큰 증가하는 부분 수열의 합을 출력한다.

     */
    // DP와 ARR 돌면서 큰 값들을 더해서 저장한 후 서로 비교하고, 크다면 저장

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int arr[] = new int[N+1];
        int dp[] = new int[N+1];

        for(int i=1; i<=N; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        dp[1] = arr[1];

        int result = dp[1];

        for(int i=2; i<=N; i++) {
            dp[i] = arr[i];

            for(int j=1; j<i; j++) {
                if(arr[i] > arr[j])
                    dp[i] = Math.max(dp[i], dp[j] + arr[i]);
            }

            result = Math.max(result, dp[i]);
        }

        System.out.println(result);
    }
}

