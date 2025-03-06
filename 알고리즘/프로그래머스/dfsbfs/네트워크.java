package 알고리즘.프로그래머스.dfsbfs;

import java.util.LinkedList;
import java.util.Queue;

public class 네트워크 {
    //dfs
    // 연결되어 있거나 되어있지 않은 네트워크의 갯수를 세라
    // 총 컴퓨터 갯수 중 연결이든 아니든 네트워크 갯수를 세서 반환
    //n읜 컴퓨터의 갯수
    // computer는 연결되어 있는 네트워크를 알려줌
    // [i][i]는 무조건 1이고, 무방향으로 연결되어 있음


    public static void main(String[] args) {

        int n = 3;
        int computers[][] = new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        네트워크 main = new 네트워크();
        System.out.println(main.solution(n, computers));



    }
    // 정답을 반환하는 건 연결되어 있는 네트워크의 갯수
    // 연결되어 있지 않아도 1개 연결되어 있음 통으로 1개씩 세서 총 네트워크를 반환
    //queue를 써서 순차적으로 돌면서 연결되어 있는 끝에 1개를 세고, 쭉 세기

    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] isVisited = new boolean[n];
        for (int i = 0; i < n; i++) {

            if (!isVisited[i]) {
                // 한 번 더 확인하는 이유가 dfs로 끝까지 갔을 때, 방문한 적이 없어야만 answer에 추가됨
                dfs(i, isVisited, n, computers);
                answer++;

            }
        }





        return answer;
    }

    private void dfs(int now, boolean[] isVisited, int n, int[][] computers) {

        isVisited[now] = true;
        for (int j = 0; j < n; j++) {
            if (computers[now][j] == 1 && !isVisited[j]) {
                // 현재 a가 0 , 1, 2 돌때 연결되어 있고 방문한 적이 없어야 깊게 파고듦
                dfs(j, isVisited, n, computers);
            }
        }

    }




}
