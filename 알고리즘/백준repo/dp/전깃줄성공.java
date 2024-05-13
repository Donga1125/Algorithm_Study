package 알고리즘.백준repo.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class 전깃줄성공 {
    //2565

    //서로 전깃줄이 연결되어 있는데 교차되지 않는 최소의 수를 제거하자 많이 얽혀있는 거 위주로일듯 (아닐 수 있다
    // 많이 얽혀 있는 걸 어떻게 알까 ? 일단 얽힌 건 얽혀있는 수 1보다 크거나,2보다 작은 경우 or 1보다 작거나 2보다 큰 경우면 얽혀있다
    // 1 1 이면 하나인데 2개면 2가지이ㅡ 경우 이렇게 접근 ?
    // 같은 위치를 잇는 건 없고 위치 번호는 500개 이하,전기줄의 갯수는 총 100개다

    // 위에 틀렸고, 정답 보니까 얽혀 있는 갯수를 구하기엔 불편하니 전체 전선의 갯수에서 최대한 겹치지 않게
    // (전체 전선 갯수 - 설치 가능 갯수) = 철거갯수로 접근한다.. 어렵네  즉 최대한 설치 가능한 전선의 갯수를 구하기!
    // 즉 LIS 이다
    // 반대의 경우 1작거나 크거나 or 1보다 크거나 2보다 작거나 를 만족해야 했지만 이 경우 1보다 2가 크기만 하면 된다.

    private static int wire[][];
    private static int dp[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        wire = new int[n + 1][2];
        dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            wire[i][0] = Integer.parseInt(st.nextToken());//
            wire[i][1] = Integer.parseInt(st.nextToken());



        }
        Arrays.sort(wire, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) { // 0인 a전봇대 기준으로 2차원 배열 정렬 (람다식은 바이트코드가 아니라
                //런타임에게 위임함으로 오래 걸린다고 한다.)
                return o1[0] - o2[0];
            }

        });


        for (int i = 1; i <= dp.length-1; i++) {

            dp[i] = 1; //최소 갯수인 1로 초기화
            /*
             * i번째 전봇대를 기준으로 이전의 전봇대들의
             * 전선을 연결하기 위한 탐색
             * 즉, i번째 전봇대에 연결된 B전봇대는
             * 탐색할 j번째 전봇대에 연결된 B전봇대보다 값이 커야함
             */

            for (int j = 1; j <= i; j++) { //
                if (wire[i][1] > wire[j][1]) { // i가 j보다 더 큰 수여야 찾고 있는 수들에서 얽히지 않았다는 뜻
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int max = 0;
        for (int i = 1; i <= n; i++) {
            max = Math.max(max, dp[i]); //다 돌면서 dp[i]에 저장된 가장 큰 수를 구해주고 그걸 n 뺴주면 교차된 걸 제거하는ㄴ것
        }


        System.out.println(n - max);

    }
}
