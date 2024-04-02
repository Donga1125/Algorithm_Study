package 알고리즘.백준책.백준강의커리큘럼.브루트포스.재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 가장긴감소하는수열틀림 {


    //11722

    private static int[] arr;
    private static int[] dp;

    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        dp = new int[n];
        arr = new int[n];

        for (int i = 0; i < n; i++) {

            arr[i] = Integer.parseInt(st.nextToken());
            dp[i] = 1;

        }

        int max = 1;

        for (int i = n - 1; i < 0; i--) {
            for (int j = n - 1; j < i; j--) {

                if (arr[i] > arr[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);

                }
            }

            max = Math.max(dp[i], max);
        }

        System.out.println(max);
            
    }
}
