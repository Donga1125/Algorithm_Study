package 알고리즘.백준repo.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 일로만들기2성공 {
    //12852
    //3으로 나눠지면 3나누기, 2로 나눠지면 2 나누기, 1빼지면 1빼기
    // 3개를 섞어 사용하는데, 최소로 되는 경우를 찾아내자
    private static int count;
    private static int dp[];
    private static int root[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        dp = new int[n + 1]; // 최소연산을 저장하는
        root = new int[n + 1]; //dp[n]인 최소연산을 구할  n다음으로 올 수


        dp[0] = dp[1] = 0;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + 1;

            if (i % 2 == 0) {

                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            }
            if (i % 3 == 0) {

                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }
            System.out.println(dp[n]);
        }

        sb.append(n).append(" ");

        while (n > 1) {
            int min = dp[n - 1];
            int temp = n - 1;

            if (n % 3 == 0 && dp[n / 3] < min) {
                min = dp[n / 3];
                temp = n / 3;
            }
            if (n % 2 == 0 && dp[n / 2] < min) {
                min = dp[n / 2];
                temp = n / 2;
            }
            n = temp;
            sb.append(n).append(" ");
        }
        System.out.println(sb);





    }}


