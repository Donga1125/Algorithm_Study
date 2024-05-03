package 알고리즘.백준repo.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 거스름돈 {
    private static int[] dp;

    //14916
    // 손님에게 2,5짜리로만 거스름돈을 준다
    //동전 갯수가 최소가 되게 주자 n은 100,000까지 들어옴

    //for문으로 생각하면 쉬웠는데 dp적용이 어렵다 ㅠㅠ
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        dp = new int[100001]; // 초기값 세팅때문에 그냥 n들어올 수 있는 수 잡아줌
        dp[0] = 0;
        dp[1] = 0;
        dp[2] = 1;
        dp[3] = 0;
        dp[4] = 2;
        dp[5] = 1;

        for (int i = 6; i <= t; i++) {


            if (dp[i - 2] > 0 && dp[i - 5] == 0) { // 5로 나눠지지 않고 i-2수가 있으면 (2를 뻈을 때 나눠진 적이 있는수
                // 즉 5로는 못나누고 2로만 나눌 수 있는 수

                dp[i] = dp[i - 2] + 1;

            } else if (dp[i - 2] == 0 && dp[i - 5] > 0) { // 2로는 못나누고 5로는 나눠지면 +1

                dp[i] = dp[i - 5] + 1;

            } else {
                dp[i] = Math.min(dp[i - 2], dp[i - 5]) + 1; // 둘다 안되면 i-2, i-5에 저장된 수 중 적은 거에 하나 +1해서 저장
            }
        }

        if(dp[t] == 0) // t값에 저장이 안된수라면 안되는 수라 -1
            System.out.println("-1");
        else
            System.out.println(dp[t]);

    }
 }

