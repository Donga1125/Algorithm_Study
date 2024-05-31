package 알고리즘.프로그래머스.항해99.이주차;

public class 게임맵최단거리 {

    // 2차원 배열로 양 끝(시작과 끝)에서 서로 시작하는데, 상대방 진형에 먼저 도착하면 이기는 게임
    // 검은 색 벽이 존재하고 흰색 길로만 갈 수 있다.
    // 움직일 땐 동서남북 넷 중 하나로 움직이고, 맵 범위를 넘어갈 순 없다
    // 만약 가는 도착할 수 없다면 -1을 return
    // 가능한 경로 중 최단 거리의 이동횟수를 return 해라

    //maps는 n x m 크기의 게임 맵의 상태가 들어있는 2차원 배열로, n과 m은 각각 1 이상 100 이하의 자연수입니다.
    //n과 m은 서로 같을 수도, 다를 수도 있지만, n과 m이 모두 1인 경우는 입력으로 주어지지 않습니다.
    //maps는 0과 1로만 이루어져 있으며, 0은 벽이 있는 자리, 1은 벽이 없는 자리를 나타냅니다.
    //처음에 캐릭터는 게임 맵의 좌측 상단인 (1, 1) 위치에 있으며, 상대방 진영은 게임 맵의 우측 하단인 (n, m) 위치에 있습니다.

    private int size;

    private static int[][] moving = new int[][]
            {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};
            //  왼  ,    오  ,    위   ,   아래

    public static void main(String[] args) {
        int[][] arr = new int[][]
                       {{1, 0, 1, 1, 1},
                        {1, 0, 1, 0, 1},
                        {1, 0, 1, 1, 1},
                        {1, 1, 1, 0, 1},
                        {0, 0, 0, 0, 1}};
        게임맵최단거리 sol = new 게임맵최단거리();
        sol.solution(arr);

    }

    private int solution(int[][] maps) {
        size = maps.length;
        System.out.println();


        int answer = 0;
        return answer;
    }

    private void dfs(int depth) {

        if (depth == size) {


        }


    }


}
