package 알고리즘.백준repo.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 투xn타일링투 {

    //11727

    // 2xn 타일링을 잘 생각해보자 마지막에 채우는 경우가 3가지인데, 1x2이 나오면 -2로 따지자

    private static int t;
    private static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        dp = new int[1001]; // 항상 t+1로 초기화하는데 이럴 경우 arrayIndexOutOfBound가 날 수 있다.
        // 경계조건이나, 예치직않은 입력 방지 ,예상치못한 인덱스오버플로우 방지

        for (int i = 0; i <= t; i++) {
            dp[i] = -1;

        }


        System.out.println(dp(t) % 10007);



    }

    private static int dp(int n) {


        dp[1] = 1;
        dp[2] = 3; // 2일때 경우의 수가 3가지다.

        if (dp[n] == -1) {
            return dp[n] = (dp(n - 1) + 2 * dp(n - 2)) % 10007;

            //dp n-1의 경우 어차피 세로 하나밖에 못오고 dp n-2의 경우 원래 2xn문제에선 가로 하나만 왔지만,
            // 2x2의 타일이 추가되면서 두개의 경우가 생김
        }

        return dp[n] % 10007;
    }
}
