package 알고리즘.백준repo.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 상자넣기실패 {
    // 쭉 나열된 상자들이 있는데 앞 상자가 뒤에 상자보다 더 작다면 뒤 상자에 넣을 수 있다 (건너뛰기 가능)
    // 1, 5, 2, 3, 7 가 있다면 1을 5에 넣고 -> 다시 7에 넣으면 3번 넣게 된다
    // 근데 1 2 3 7 순으로 넣게 된다면 4번 넣을 수 있다 최대로 넣는 횟수를 구해라


    // 상자는 1000개 까지 낳옴
    private static int[] box;
    private static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        box = new int[t + 1];
        dp = new int[t + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= t; i++) {
            box[i] = Integer.parseInt(st.nextToken());
        }

        dp[0] = 0; // 첫 수가 안담은 게 더클 수 있음


        int n = 0;

        for (int i = 1; i <=t ; i++) { // 최장 증가하는 수열이래
            for (int j = i; j <=t ; j++) {
                // dp[i] 가 담았을 때 맥스되게 하면 될듯
                // 가정이 다음 수가 더 클때만 가능한데, 그 수를 담거나 안 담거나 했을 때 맥스가 되게
                if(box[i] < box[j] ){
                    dp[i] = dp[i] + dp[j] + 1;}

            }
        }
        System.out.println(dp[t]);
    }
}
