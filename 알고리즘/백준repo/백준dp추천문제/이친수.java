package 알고리즘.백준repo.백준dp추천문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 이친수 {

    //2193

    // 0과 1로 이루어진 이진수인데 인수는 특수한 성질을 갖는다.
    // 0으로 시작 x, 1이 연속으로 못온다
    private static int t;
    private static int count = 0;
    private static String str;
    private static Integer dp[];


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());

        str = "1";

        dp = new Integer[t];
        dp[0] = 1;
        dp[1] = 0;



    }

    private static Integer[] dp(Integer[] dp, int depth) {

        if (dp[depth] == null) {
            return dp[depth] = dp[]
        }

    }

    private static int dp(int depth, String str) {


        if (str.length() == t) {


            return count++;

        }



        if (str.charAt(str.length() - 1) == '0' - 0) {

                 dp(depth + 1, str + "0");
                 dp(depth + 1, str + "1");
            }
        if (str.charAt(str.length() - 1) == '1' - 0) {
                dp(depth + 1, str + "1");
            }



    }
}
