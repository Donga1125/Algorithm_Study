package 알고리즘.백준repo.백준dp추천문제;

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 평범한배낭 {

    //n개의 물품과 최대 k를 넣을 수 있는 무게
    // 각 무게 w, v가 주어짐

    //현재 dp[i]에 저장되어야 할 값은
    //math.max(i, i+1)인데 i+1은 k를 안 넘어야 해

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[][] pack = new int[n+1][2];


        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
                pack[i][0] = Integer.parseInt(st.nextToken());
                pack[i][1] = Integer.parseInt(st.nextToken());

            }
        int[][] dp = new int[n+1][k+1];

        dp[0][0] = 0;

        //현재 계산의 경우 2가지다.

        //이번 걸 가지고 dp에 저장하냐 or 이번 걸 가지지 않냐
        // 이번 걸 가지지 않는 경우에는 전에꺼 그대로 가면 되고,
        // 만약 이번 걸 선택한다면 ?
        // 경우를 따져야 한다. 이번걸 +했을 때 무게가 넘지 않아야하고
        // 무게가 넘지 않을 경우에는

        for (int i = 1; i <= n; i++) { //아이템 1부터 들어온4까지 탐색
            int weight = pack[i][0];
            int value = pack[i][1];
            for (int j = 0; j <= k; j++) { //0부터 7kg 까지 탐색 1,2,3,4~ 쭉쭉 저장

                 //현재 무게에서 weight보다 작으면 그냥 선
                    dp[i][j] = dp[i - 1][j];// 이번 탐에 선택 안하면 그냥 그대로 이월





                if (j >= weight) { //j는 인덱스인데 ? 현재 인덱스가 무게를 넘지 않으면 ? 아
                    // j가 배낭의 무게인거고, weight가 현재 아이템의 무게

                    dp[i][j] = Math.max(dp[i-1][j], dp[i - 1][j - weight] +value);

                }
                
            }

        }
        System.out.println(dp[n][k]);


        

}}
