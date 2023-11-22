package 기초1.Day14.정해영;

import java.util.Scanner;

public class 카드구매하기2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] dp = new int[n+1]; //해당 카드값의 최솟값을 저장
        int[] card = new int[n+1];

        for(int i=1; i<=n; i++){
            card[i] = sc.nextInt();
            dp[i] = Integer.MAX_VALUE; //정수의 최대값으로 매칭시킴.
        }

        for(int i=1; i<=n; i++){

            dp[i] = card[i];

            for(int j=1; j<=i; j++){
                dp[i] = Math.min(dp[i], dp[i-j] + card[j]);
            }
        }

        System.out.println(dp[n]);
    }
}
