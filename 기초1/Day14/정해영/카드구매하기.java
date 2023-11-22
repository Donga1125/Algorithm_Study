package 기초1.Day14.정해영;

import java.util.Scanner;

public class 카드구매하기 {

    //최대한 적게 사용해서 금액을 맞추는 문제.
    //각 카드마다 1개의 가중도를 따져서 넣어준다.
    //



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //구매하려는 카드의 개수

        int [] p = new int[n + 1]; //카드마다 가격을 정한다.

        for(int i=1; i<=n; i++){
            p[i] = sc.nextInt();
        }

        int[] dp = new int[n + 1];



        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                dp[i] = Math.max(dp[i], dp[i-j] + p[j]);
            }
        }

        System.out.println(dp[n]);
        sc.close();
    }

}
