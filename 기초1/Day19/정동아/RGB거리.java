package 기초1.Day19.정동아;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RGB거리 {
    //규칙을 만족하면서 모든 집을 칠하는 비용의 최솟값을 출력
    /**
     * 1번 집의 색은 2번 집의 색과 같지 않아야 한다.
     * N번 집의 색은 N-1번 집의 색과 같지 않아야 한다.
     * i(2 ≤ i ≤ N-1)번 집의 색은 i-1번, i+1번 집의 색과 같지 않아야 한다.
     */
    final static int Red = 0;
    final static int Green = 1;
    final static int Blue =2;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int [][] cost = new int[N][3];

        for(int i =0; i<N; i++){
            st = new StringTokenizer(br.readLine()," ");

            cost[i][Red] = Integer.parseInt(st.nextToken());
            cost[i][Green] = Integer.parseInt(st.nextToken());
            cost[i][Blue] = Integer.parseInt(st.nextToken());
        }

        //1부터 N-1까지 각 i별 i-1의 서로 다른ㄴ 색상 중 최소값을 누적해서 더함
        for (int i = 1; i<N; i++){
            cost[i][Red] += Math.min(cost[i-1][Green], cost[i-1][Blue]);
            cost[i][Green] += Math.min(cost[i-1][Red], cost[i-1][Blue]);
            cost[i][Blue] += Math.min(cost[i-1][Red],cost[i-1][Green]);
        }

        System.out.println(Math.min(Math.min(cost[N-1][Red], cost[N-1][Green]), cost[N-1][Blue]));

    }

}
