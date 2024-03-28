package 알고리즘.단계별백준2.동적계획법1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 연속합topdown {

    private static int[] arr;
    private static Integer[] dp;

    private static int t;
    private static int max;

    //1912 연속합

    // 먼저 배열의 하나씩 돌다가
    // 넘여줄 땐 배열에서 현재 수 보다 다음 수가 더 크다면 계속 확인해서 넘어가는
    // 완벽하게 잘못 생각했다

    // top down으로 내려올 생각은 했는데 구현을 제대로 못하겠다 ㅠ

    
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

        recur(t - 1); // topdown이라 마지막부터 차례로

        System.out.println(max);
    }

    private static int recur(int index) {


        if (dp[index] == null) {
            // 저장되지 않은 탐색되지 않은 애라면
            dp[index] = Math.max(recur(index - 1) + arr[index], arr[index]);

            // 해당 dp[N]과 max 중 큰 값으로 max 갱신
            max = Math.max(dp[index], max);


        }

        return dp[index];


    }
}
