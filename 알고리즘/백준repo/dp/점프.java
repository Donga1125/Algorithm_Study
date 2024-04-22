package 알고리즘.백준repo.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 점프 {
    //바텀업과 topdown의 방식이 혼합해서 자꾸 나오다보니 이도 저도 아닌 상태가 된다..
    // 너무 헷갈려서 개념을 잡고 싶은데도 그것도 힘드네..

    static int board[][];
    static long dp[][];
    static int count = 0;

    //1890
    //현재 수와 같은 행열의 수 중 0이 되는 수를 계속 탐색해서 저장하면 되지 않을까 ?

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        board = new int[t][t];
        dp = new long[t][t];

        for (int i = 0; i < t; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 0; j < t; j++) {

                board[i][j] = Integer.parseInt(st.nextToken());

                
            }}

           // dp[0][0] = board[0][0]; // 왜 그 수로 저장해줬을까 dp에 저장된 건 이동한 수여야 한다.. 이러니 헷갈림
            dp[0][0] = 1; //



            for (int j = 0; j <t; j++) {

                for (int k = 0; k<t ; k++) {
                    int now = board[j][k];

                    if (now == 0) {
                        break;
//                        count++; // 도착하면 ++숫자 세려고 했지만 그렇다면 같은 장소로 오는 경우 중 다른 경우를 통해 올 수 있기에
                        // 즉 겹치는 수에 대해선 카운트가 안되기에 실패)
                    }
                    if (j + now < t) {
                        dp[j + now][k] += dp[j][k];
                    }
                    if (k + now < t) {
                        dp[j][k + now] += dp[j][k];
                    }

                    //현재 수를 저장하고 그만큼 움직이려면, 다음 점화식은




                }
            }
        System.out.println(dp[t-1][t-1]);


//        for (long[] longs : dp) {
//            for (long aLong : longs) {
//                System.out.print(aLong + " ");
//            }
//            System.out.println();
//        }



    }


}
