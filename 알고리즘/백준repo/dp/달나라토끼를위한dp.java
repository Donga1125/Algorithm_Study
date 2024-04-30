package 알고리즘.백준repo.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 달나라토끼를위한dp {
    //17212
    // 동전종류는 1 2 5 7고, 최소의 동전으로 지불할 수 있게 만들자
    // dp[n] = Math.min(dp[n-1], Math.min(dp[n-2], Math.min(dp[n-5], dp[n-7]) + 1;
    private static final int[] coin = {1, 2, 5, 7};
    private static int[] dp;

     public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         int t = Integer.parseInt(br.readLine());
         dp = new int[100001];
         Arrays.fill(dp, 100001);

         dp[0] = 0;
         int now = 0;
         for (int i = 1; i <=t ; i++) {
             for (int j = 0; j < 4; j++) {
                 if (i - coin[j] < 0) { // 현재 수로
                     continue;}
                     now = coin[j];
                     dp[i] = Math.min(dp[i], dp[i -now] + 1);
                 }
                 
             }
         System.out.println(dp[t]);
         System.out.println(dp);

         }

         }






