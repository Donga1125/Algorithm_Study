package 알고리즘.백준책.백준강의커리큘럼.브루트포스.재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 가장긴증가수열 {

    private static int[] arr;
    private static int[] dp;
    private static int max;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        arr = new int[t];
        dp = new int[t];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < t; i++) {

            arr[i] = Integer.parseInt(st.nextToken());

            
        }

        dp[0] = 1;

        for (int i = 1; i < arr.length; i++) {
            max = 1;

            for (int j = 0; j < i; j++) {

                if (arr[j] < arr[i]) { //j값중 가장 큰 수

                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }

            }

            max = Math.max(dp[i], max);


        }
        System.out.println(max);
        
        
            
    }



}
