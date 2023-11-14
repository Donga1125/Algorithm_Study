package 기초1.Day22.정동아;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 정수삼각형 {
    //맨위부터 시작해서 아래에 있는 수 중 하나를 선택해서 아래층으로 내려올 때, 이제까지 선택된 수의 합이
    //최대가 되는 경로를 출력
    // 아래층에 있는 수는 현재 층에서 선택된 수의 대각선 왼쪽 또는 대각선 오른쪽에 있는 것 중에서만 선택할 수 있다.

    //dp 위에서 내려오면서 값 더해서 맨 마지막에서 제일 큰 값 출력

    static int [][] arr;
    static Integer [][] dp;
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());

        arr = new int[N][N];
        dp = new Integer[N][N];

        for (int i = 0; i<N; i++){ //정수삼각형으로 입력받은 값을 arr배열에 넣어줌
            st = new StringTokenizer(br.readLine()," ");

            for (int j =0; j<i+1; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i =0; i<N; i++){
            dp[N-1][i] = arr [N-1][i];
        }

        System.out.println(find(0,0));


    }

    static int find (int depth, int idx){
        //마지막행일 경우 현재 위치의 dp값 반환
        if (depth == N-1){
            return dp[depth][idx];
        }

        //탐색하지 않았던 값일 경우 다음 행의 양쪽 값 비교
        if (dp[depth][idx] == null){
            dp[depth][idx] = Math.max(find(depth+1, idx), find(depth+1, idx+1))+arr[depth][idx];
        }
        return dp[depth][idx];
    }
}
