package 알고리즘.프로그래머스.dfsbfs;

public class 게임맵내최단거리 {

    //주어진 곳(length,length)까지에 도착하기 위해 최단 거리 구해라.
    //도착하지 못한다면 -1, 동서남북으로 움직일 수 있다.
    public static int[][] movement = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    // 동남서북로 움직이는 게 효율적으로보임 1,1에 서있으니까


    public static void main(String[] args) {

        int[][] map = new int[][]{
                {1, 0, 1, 1, 1},
                {1, 0, 1, 0, 1},
                {1, 0, 1, 1, 1},
                {1, 1, 1, 0, 1},
                {0, 0, 0, 0, 1}};

        게임맵내최단거리 main = new 게임맵내최단거리();
        main.solution(map);
    }

    //먼저 갔던 방향을 다시 가면 안되니까 visited 배열을 써야함
    // 1이면 갈 수 있고 0이면 벽이다
    // 최단거리를 구해야함

    //visited를 넘길텐데, 하나의 배열로 가능할 거 같은데 4개로 그냥 동남서북

    // 도착하지 못하는 걸 어떻게 알것인가? 모든 무빙을 다해도 도착하지 못할 수 있다.
    // 끝에 도달하지 못하고 움직일 수 없을 경우엔 -1 return

    // 움직이지 못하는 곳은 벽과 배열을 벗어나는 경우

    public int solution(int[][] maps) {
        int answer = 0;
        boolean[] isVisited = new boolean[4];
        // 0.동,  1.남,  2.서,  3. 북


        return answer;


    }

    private int dfs(int[][] maps, boolean[] isVisited, int answer, int nowX, int nowY) {

        int last = maps.length;

        if ((nowX > last || nowY > last)) {
            answer = -1;
            return answer;
        }
            // 리턴으로 -1을 주고 바로 뛰고 싶음 배열의 범위를 벗어나면
            //
        if (nowX == last && nowY == last) {

            return answer;
        }

        for (int i = 0; i < 4; i++) {

            // 4가지 방향으로 움직이기
            // visited 확인 및 움직였으면 true 만들어주고,
            // 벽이거나 이미 방문한 곳은 못움직이는 예를 만들기
        }

        return 1;



    }
}
