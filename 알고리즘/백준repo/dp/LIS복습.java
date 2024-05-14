package 알고리즘.백준repo.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LIS복습 {

    private static int[] arr;
    private static int[] dp;



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        arr = new int[t + 1];
        dp = new int[t + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= t; i++) {
            arr[i] = Integer.parseInt(st.nextToken());

        }





        for (int i = 1; i <= t; i++) {
            dp[i] = 1;  // 자기 자신은 하나면서 최장길이 1을 가진다


            for (int j = 1; j <=i; j++) { // i 수까지만 돌고
                if (arr[i] > arr[j]) { // i가 더 크다면 전수보다 지금 수가 더 크니
                    // arr[j]> arr[j-1] 이라고 생각했는데 이럴 필요가 없다 ㅡ그까지 저장된 수와 비교하는 거라
                    // 그 수에 저장된 dp[j]의 값 즉 dp[j]는 j수까지 올 수 있는 최장길이를 뜻함

                    dp[i] =Math.max(dp[i], dp[j] + 1);
                    // 그러면 그 최장 길이와 현재 dp[i]는 순서대로 증가하면서 저장된 올 수 있는 최장의 수와 비교해서
                    // 계속 갱신시켜준다! 이 의미가 헷갈림
                }

            }



        }
        int max = 0;
        for (int i = 1; i <= t; i++) {
            max = Math.max(max, dp[i]);
        }

        System.out.println(max);



    }
}
