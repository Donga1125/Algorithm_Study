package 알고리즘.백준repo.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LIS복습 {

    private static int[] arr;
    private static int[] dp;



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        arr = new int[t + 1];
        dp = new int[t + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= t; i++) {
            arr[i] = Integer.parseInt(st.nextToken());

        }


        dp[1] = 1; // 가장 긴 수는 자기 자신


        for (int i = 1; i <= t; i++) {
            dp[i] = 1;


            for (int j = 1; j <i; j++) { // i 수까지만 돌고
                if (arr[i] > arr[j] && arr[j] > arr[j - 1]) {

                    dp[i] =Math.max(dp[i], dp[j] + 1);
                }

            }



        }
        int max = 0;
        for (int i = 1; i <= t; i++) {
            max = Math.max(max, dp[i]);
        }

        System.out.println(max);



    }
}
