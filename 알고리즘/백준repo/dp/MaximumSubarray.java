package 알고리즘.백준repo.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaximumSubarray {
    //10211
    // 최대 부분배열을 구하는 문제
    // 주어진 arr[i]와 dp[i-1] + drr[i]의 수를 비교해서 더 큰 값을 저장
    // 1000 1000 이 가능

    static int[] arr;
    static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());

            arr = new int[n+1];
            dp = new int[n+1];
            int max = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 1; j <= n; j++) {

                arr[j] = Integer.parseInt(st.nextToken());
                dp[j] = Math.max(arr[j], dp[j - 1] + arr[j]);
                max = Math.max(max, dp[j]);

            }
            sb.append(max).append('\n');

        }

        System.out.println(sb);

    }
}
