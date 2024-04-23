package 알고리즘.백준repo.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 구간합구하기5 {

    //11660
    //2,2 -> 3,4 구하라고 하면 22 23 24 32 33 34구하기다 21은 포함안됨
    static int[][] arr;
    static int[][] wanted;
    static long[] dp1;
    static int[][] from;
    static int[][] to;
    static long[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        arr = new int[n+ 1][n+1];



        from = new int[m +1][2 +1];
        to = new int[m+1][2 + 1];



        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());

            }

            
        }

        for (int i = 1; i <= m; i++) {
            dp = new long[n + 1][n + 1];
            dp1 = new long[n + 1];
            st = new StringTokenizer(br.readLine());
            int x1 = 0;
            int x2 = 0;
            int y1 = 0;
            int y2 = 0;

            for (int j = 1; j <=2; j++) {
                from[i][j] = Integer.parseInt(st.nextToken());


            }

            x1 = from[i][1];
            x2 = from[i][2];

            for (int j = 1; j <= 2; j++) {
                to[i][j] = Integer.parseInt(st.nextToken());

            }
            y1 = to[i][1];
            y2 = to[i][2];
            dp[x1][x2] = arr[x1][x2];

            for (int j = x1; j <= y1 ; j++) {
                for (int k = x2; k <= y2; k++) {

                    dp[j][k] = dp[j][k - 1] + arr[j][k];
                    dp[]
                    System.out.println("누적합: " + dp[j][k]);

                }

                
            }
            System.out.println(" 하나 끝");

//            System.out.println(dp[y1][y2]);

            
        }





    }
}
