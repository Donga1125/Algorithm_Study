package 알고리즘.백준repo.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 주지수 {

    //15724

    // 범위의 사람의 수를 부르면 그 안에 총 사람 계산이네
    // 아마 점화식이 x-1,y + x ,y-1 -(x,y)
    // dp 자체를 구하는 식은 x-1,y + x, y-1 + x,y
    private static int[][] land;
    private static int[][] dp;
    private static int answer;
    private static int location[][];
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        land = new int[n + 1][m + 1];
        dp = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= m; j++) {
                land[i][j] = Integer.parseInt(st.nextToken());
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1] + land[i][j] - dp[i-1][j-1];
                // 누적합 dp로 저장
                System.out.print(dp[i][j] + " ");

            }
            System.out.println();
        }

        answer = Integer.parseInt(br.readLine());
        location = new int[answer + 1][4 +1];
        for (int i = 1; i <=3 ; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <=4 ; j++) {
                location[i][j] = Integer.parseInt(st.nextToken());

            }
            int d = dp[location[1][3]][location[1][4]] -;



        }

    }
}
