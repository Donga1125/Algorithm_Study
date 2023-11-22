package 기초1.Day21.정해영;

import java.util.Scanner;

public class 포도주시식 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        int[] wine = new int[n];
        int[] dp = new int[n];

        for(int i=0; i<n; i++){
            wine[i] = sc.nextInt();
        }

        dp[0] = wine[0];

        for(int i=1; i<n; i++){
            if(i==1){
                dp[1] = wine[0] + wine[1];
                continue;
            }
            if(i==2){
                dp[2] = Math.max(dp[1], Math.max(wine[0]+wine[2],wine[1]+wine[2]));
                continue;
            }
            dp[i] = Math.max(dp[i-1], Math.max(dp[i-2]+wine[i],dp[i-3]+wine[i-1]+wine[i]));
        }

        System.out.println(dp[n-1]);
        sc.close();
    }
}
