package 기초1.Day18.정동아;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 제곱수의합 {
    //주어진 자연수를 제곱수의 합으로 나타낼 때에 그 제곱수 항의 최소 개수를 출력
    //각 숫자까지 최소 개수가 중복되는걸 이용
    //ex_ 5를 제곱수의 합으로 나타내면 최소개수는 1^2+2^2 여서 2개.
    //ex_ 6이면 3개...
    //ex_ n=10이면, i, n-i랑 더해서 최솟값을 구해준다.

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int [] dp = new int[N+1];

        dp[1] =1;

        for (int i =2; i<=N; i++){
            dp[i] =10001; //초기값 설정
            for (int j =1; j<= i/2; j++){
                if (j*j == i){ //제곱수인 경우는 1임 ex_4,9,16...
                    dp[i] =1;
                    break;
                }
                dp[i] = Math.min(dp[i], dp[j]+dp[i-j] ); //dp에 각 수를 제곱수의 합으로 나탄낼 때 최소개수로 설정해줌
                                                         //i가 10일경우 1+9, 2+8..5+5까지 따져서 최솟값으로 dp[10]을 설정
            }
        }
        System.out.println(dp[N]);
    }
}
