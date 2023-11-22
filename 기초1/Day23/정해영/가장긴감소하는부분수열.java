package 기초1.Day23.정해영;

        import javax.swing.*;
        import java.util.Arrays;
        import java.util.Scanner;

public class 가장긴감소하는부분수열 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] dp = new int[n];
        int result = 0;

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt(); //값 할당
        }

        for(int i=0; i<n; i++){
            dp[i] = 1; //1로 초기화
            for(int j=0; j<i; j++){

                if(arr[j] > arr[i]){ //시작값과 이전값들을 비교.
                    //dp[i]는 현재까지 `감소하는 부분수열`의 길이
                    //현재 길이와 이전까지 연결된 길이 + 1과 비교해서 최대값을 갱신
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
            result = Math.max(result,dp[i]);
        }

        System.out.println(result);
        sc.close();
    }
}
