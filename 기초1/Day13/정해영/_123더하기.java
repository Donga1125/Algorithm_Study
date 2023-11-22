package 기초1.Day13.정해영;

import java.util.Arrays;
import java.util.Scanner;

public class _123더하기 {

    public static int[] dp = new int[11];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i=0; i<t; i++){
            int n = sc.nextInt();

            System.out.println(onetwothree(n));
        }
        sc.close();
    }

    public static int onetwothree(int n){

        if(n == 1) return 1;
        if(n == 2) return 2;
        if(n == 3) return 4;

        if(dp[n] == 0){
            dp[n] = onetwothree(n-1) + onetwothree(n-2) + onetwothree(n-3);
        }

        return dp[n];
    }
}
