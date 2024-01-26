package 알고리즘.개발자취업하기.바이러스;

import java.io.*;
import java.util.StringTokenizer;

// 신종 바이러스 웜 바이러스는 네트워크를 통해 전염되고, 그 네트워크에 있는 컴퓨터라면 다 전염
// n개의 컴퓨터 개수와 m의 네트워크 연결 m개의 간선(edge)정보가 주어진다.

public class Joon2066 {
    static boolean[][] graph;
    // 연결된 정보를 표시하기 위해 true면 연결
    static boolean[] visited;
    // 모든 dfs는 방문기록정보를 얻기 위해 모두 다 이런 식으로 선언 (7개의 컴퓨터기에 n+1로 7을 표현해줌)
    static int n , m;
    static int answer;

    public static void dfs(int idx) {
        visited[idx] = true; // dfs에서 가장 먼저 할 것은 들어온 수를 true 만들어서 이번재귀에서 방문여부를 바꿔줘서 다시 방문하지 않게 하기
        answer++; // dfs를 호출 했다는 건 연결되었다고 가정할꺼기 때문에 들어오면 ++ 해주

        for (int i = 1; i <= n; i++) {
            if (visited[i] == false && graph[idx][i]) //방문한 적이 없고 && 그 인덱스1번째에 i번쨰가 연결되어 있으면 호출(i는바뀌니까)

            dfs(i);

        }
    }

    public static void main(String[] args) throws IOException{
        // 0. 입력 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine()); // 컴퓨터의 수
        m = Integer.parseInt(br.readLine()); // n개끼리 연결되어있는 쌍의 수

        graph = new boolean[n + 1][n + 1]; // n은 컴퓨터의 갯수라 7개, 우리가 원하는 배열은 7x7인데 8번째 인덱스인(7)숫자가 찍히기 위해 +1
        visited = new boolean[n + 1]; // 마찬가지로 8번째 인덱스인(7)을 찍기 위ㅐ

        // 1. graph에 연결 정보 채우기
        int x, y;
        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()); // 두개의 숫자가
            // 두개의 숫자가 한줄에 들어오기에 띄어쓰기 기준으로짤라서 저장해야함
            x = Integer.parseInt(st.nextToken()); // 첫째 줄 처음 수
            y = Integer.parseInt(st.nextToken()); // 첫째 줄 띄어쓰기 이후 수

            graph[x][y] = true; //x번 컴퓨터와 y번 컴퓨터가 서로 연결되어 있다.
            graph[y][x] = true; //y번 컴퓨터와 x번 컴퓨터가 서로 연결되어 있다. 두번의 이유는 그래프에 x 기준 y기준 같은 거라도 기록을 그렇게 하기로 해서

        }

        // 2. (dfs)재귀함수 호출
        dfs(1); //1번부터 재귀함수 계속 호출해라

        // 3. 출력
        bw.write(String.valueOf(answer -1));

        br.close();
        bw.close();
    }
}
