package 알고리즘.바이러스;

import java.io.*;

// 신종 바이러스 웜 바이러스는 네트워크를 통해 전염되고, 그 네트워크에 있는 컴퓨터라면 다 전염
// n개의 컴퓨터 개수와 m의 네트워크 연결 m개의 간선(edge)정보가 주어진다.

public class Joon2066 {
    static boolean[][] graph;
    // 연결된 정보를 표시하기 위해 true면 연결
    static boolean[] visited;
    // 모든 dfs는 방문기록정보를 얻기 위해 모두 다 이런 식으로 선언 (7개의 컴퓨터기에 n+1로 7을 표현해줌)
    static int n , m;
    static int answer;

    public static void main(String[] args) throws IOException{
        // 0. 입력 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());

        graph = new boolean[n + 1][n + 1]; // n은 컴퓨터의 갯수라 7개, 우리가 원하는 배열은 7x7인데 8번째 인덱스인(7)숫자가 찍히기 위해 +1
        visited = new boolean[n + 1]; // 마찬가지로 8번째 인덱스인(7)을 찍기 위ㅐ

        // 1. graph에 연결 정보 채우기
        int x, y;
        for (int i = 0; i < m; i++) {

        }

        // 2. (dfs)재귀함수 호출

        // 3. 출력

    }
}
