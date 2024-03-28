package 알고리즘.단계별백준2.동적계획법1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 연속합bottomUp {

    private static int[] arr;
    private static Integer[] dp;

    private static int t;
    private static int max;

    //1912 연속합

    // 먼저 배열의 하나씩 돌다가
    // 넘여줄 땐 배열에서 현재 수 보다 다음 수가 더 크다면 계속 확인해서 넘어가는
    // 완벽하게 잘못 생각했다

    // top down으로 내려올 생각은 했는데 구현을 제대로 못하겠다 ㅠ
    // 일반적으로 bottom Up 이 더 편하다..

    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        arr = new int[t];
        dp = new Integer[t];

        for (int i = 0; i < t; i++) {

            arr[i] = Integer.parseInt(st.nextToken());

        }
        dp[0] = arr[0];
        max = arr[0]; // 마지막 원소면 탐색 끝

        for (int i = 1; i < t; i++) {
            dp[i] = Math.max(dp[i - 1] + arr[i], arr[i]);

            max = Math.max(max, dp[i]);
        }

        System.out.println(max);
    }


}
