package 알고리즘.백준repo.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 일로만들기2최종 {
    private static int[] root;
    private static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();


        dp = new int[t + 1];
        root = new int[t + 1];

        dp[0] = dp[1] = 0; // 1만들면 되니까 1되면 0

        for (int i = 2; i <= t; i++) {
            dp[i] = dp[i - 1] + 1; // dp[i]에 저장되는 건 전에 수에서 -1빼기 하는 경우가 디폴트니까 전 수 +1의 경우의 수로 정하고
            root[i] = i - 1; // 지정된 수로 7이 들어오면 -1한 6을 root가 가르킴

            if (i % 2 == 0 && dp[i] > dp[i / 2] + 1) { // 디폴트로 미리 정하고 그 수가 나눠지면 줄야서 저장
                dp[i] = dp[i / 2] + 1;
                root[i] = i / 2;
            }
            if (i % 3 == 0 && dp[i] > dp[i / 3] + 1) { // 디폴트로 미리 정하고 그 수가 나눠지면 줄야서 저장
                dp[i] = dp[i / 3] + 1;
                root[i] = i / 3;
            }

        }
        System.out.println(dp[t]);


        while (t > 0) {
            sb.append(t).append(" ");

            t = root[t];
        }
        System.out.println(sb);

    }

}
