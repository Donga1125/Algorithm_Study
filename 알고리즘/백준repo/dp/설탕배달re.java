package 알고리즘.백준repo.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 설탕배달re {
    //2839 3, 5만 가능
    // 18의 예시의 경우 15까지 오는 수와 13까지 오는 경우의 수의 갯수 차이를 비교해서 리턴
    // 3,5 또는 5로 나눌 수 없는 경우 바로 -1 리턴하자


    private static int[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        dp = new int[t + 1];

        if (t < 5) {

            if (t == 3) System.out.println(1);

            else System.out.println(-1);

            return;
        }
        Arrays.fill(dp, 5001); //dp 5000밖에 안들어오니 5001로 초기화
        dp[3] = 1;
        dp[5] = 1;

        for (int i = 6; i < dp.length; i++) { //6부터 카운트를 세어줘서 저장한다.
            dp[i] = Math.min(dp[i - 3] + 1, dp[i - 5] + 1);
        }

        if(dp[t] > 5001) {
            System.out.println(-1);
        }else {
            System.out.println(dp[t]);
        }




            
    }




}
