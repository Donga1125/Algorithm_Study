package 알고리즘.백준repo.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 구간합구하기5성공 {

    //11660
    //2,2 -> 3,4 구하라고 하면 22 23 24 32 33 34구하기다 21은 포함안됨

    //현재 막히는 부분이 2차원 dp의 순서에 따라 어떻게 저장하는지 ? or 1차원 dp로 바꿔서증가 시킬지

    //구간합을 구하는 공식이 있다.. arr[] 안쓰고 애초 누적합으로 저장
    // dp[i][j] = dp[i][j - 1] + dp[i - 1][j] - dp[i - 1][j - 1]
    static int[][] arr;
//    static int[][] wanted;
//    static long[] dp1;
    static int[][] from;
    static int[][] to;
    static long[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        arr = new int[n+ 1][n+1];
        dp = new long[n + 1][n + 1];

        StringBuilder sb = new StringBuilder();



//        from = new int[m +1][2 +1];
//        to = new int[m+1][2 + 1];



        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 1; j <= n; j++) {
                dp[i][j] = dp[i][j - 1] + dp[i - 1][j] - dp[i - 1][j - 1] + Integer.parseInt(st.nextToken());
                // 구간합을 처음부터 구해놓기



            }



            
        }

        long answer;
        for (int i = 1; i <= m; i++) {
            answer = 0;
            st = new StringTokenizer(br.readLine());
            int x1 =Integer.parseInt(st.nextToken()); // 2,2 3,4
            int x2 =Integer.parseInt(st.nextToken());
            int y1 =Integer.parseInt(st.nextToken());
            int y2 =Integer.parseInt(st.nextToken());
            answer = dp[y1][y2] - dp[y1][x2 - 1]- dp[x1 - 1][y2]  + dp[x1 - 1][x2 - 1];
            //누적합을 구해놓고 그 누적합에서 범위 밖 빼주고 겹치는 범위 더해주기!

            sb.append(answer).append('\n');

        }
        System.out.println(sb);


            
        }

    }

