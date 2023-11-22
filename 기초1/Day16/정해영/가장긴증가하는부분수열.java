package 기초1.Day16.정해영;

import java.util.Scanner;

public class 가장긴증가하는부분수열 {

    static int[] arr;
    static Integer[] dp;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        arr = new int[n];
        dp = new Integer[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        // 0 ~ n-1 까지 탐색
        for(int i=0; i<n; i++){
            LIS(i);
        }

        int max = dp[0];

        for(int i=1; i<n; i++){ // 최대값을 찾는다.
            max = Math.max(max, dp[i]);
        }
        System.out.println(max);
    }

    public static int LIS(int n){

        if(dp[n] == null){ // 탐색하지 않았던 위치일때
            dp[n] = 1; //1로 초기화

            for(int i=n-1; i>=0; i--){ //n-1 ~ 0 까지중 n보다 작은 값을 재귀호출
                if(arr[i] < arr[n]){
                    dp[n] = Math.max(dp[n], LIS(i) + 1);
                }
            }
        }

        return dp[n];
    }
}
