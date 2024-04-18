package 알고리즘.백준repo.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 포도주시식 {

    //i번째를 먹냐 안먹냐로 두개로 나뉘고 먹었을 경우에도 두개로 나눌 수 있다.
    //1. i번째 안먹을 경우와 먹을 경우는 max(n번째 먹을경우 ,dp(i-1))
    // 2. 먹을 경우에는 i-1을 먹냐 안먹냐로 또 두가지로 나뉘는데, i-1을 먹으면 연속3개 못마심으로
    // max(arr[i] + arr[i-1] + dp[i-3], arr[i] + dp[i-2]) 로 dp활용
    // 즉 i와 i-1를 마시면 i-2를 못마심으로 dp에 저장된 i-3의 최대값을 i랑 더해주고
    // i는 마시고 i-1를 안시면 dp 저장된 i-2값을 i 더해주면 된다

    //Math.max(dp[i-1, Math.max(arr[i] + arr[i-1] + dp[i-3] , arr[i] + dp[i-2]

    private static int[] arr;
    private static int[] dp;
    //2156
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());



        arr = new int[t +1];
        dp = new int[t +1];

        for (int i = 1; i <= t; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        if (t == 1) {
            System.out.println(arr[1]);
            return; // 만약 1이 들어온다면dp 배열은 0,1만 만들어진 상태인데 dp[2]에 접근할 수 없으니 예외처리 해주자!
        }







        dp[1] = arr[1];
        dp[2] = arr[1] + arr[2]; // 이


        for (int i = 3; i <= t; i++) {
            dp[i] = Math.max(dp[i - 1], Math.max(arr[i] + arr[i - 1] + dp[i - 3], arr[i] + dp[i - 2]));
        }


        System.out.println(dp[t]);

    }
}
