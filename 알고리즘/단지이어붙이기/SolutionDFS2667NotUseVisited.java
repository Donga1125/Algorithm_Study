package 알고리즘.단지이어붙이기;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;


public class SolutionDFS2667NotUseVisited {

    static int n;
    final static int MAX = 25 + 10; // max로 최대값 선언 넉넉하게 원래 25에서 10 더한 값
    static boolean[][] connect;
    static boolean[][] visited;
    static int countPerDanji;

    static int[] dirY = {1, -1, 0, 0}; // 상하좌우 움직이게
    static int[] dirX = {0, 0, 1, -1};

    public static void dfs(int y , int x) {
        //visited[y][x] = true;
        connect[y][x] = false;
        countPerDanji++;

        for (int i = 0; i < 4; i++) {
           // connect[dirY][dirX] dirY를 숫자로 바꿔주자
            int newY = y + dirY[i]; // y번째에서 dir[i]번째로 움직인 새로운 좌표 값 (4개의 방향 다 확인
            int newX = x + dirX[i];
            if (connect[newY][newX]) // 탐색 시에도 새로운 위치 값이 탐색되기 전과 커넥션되어 있다면 dfs호출
             dfs(newY, newX);
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

       // StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(br.readLine());

        connect = new boolean[MAX][MAX];
        visited = new boolean[MAX][MAX];

        for (int i = 1; i <= n; i++) {
            String s = br.readLine(); // 스트링 값으로 "01010110" 이런 식으로 들어온다.
            for (int j = 1; j <= n ; j++) {
                //connect[i][j] = s.charAt(j - 1) == '1'; // j는 1부터 시작했으니 j-1한 값이 1이면 true를 담아주기 아님 false
                if (s.charAt(j - 1) == '1')  // // j는 1부터 시작했으니 j-1한 값이 시작 s의 인덱스가 0부터 시작하기에
                    connect[i][j] = true;
            }
        }

        ArrayList<Integer> countList = new ArrayList<>();//나는 배열로 만들려고 했는데 걍 리스트가 더 맞네;;
        // 각 단지가 이어진 아파트가 몇개인지 ? 세어줘야하네
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (connect[i][j]) {
                    countPerDanji = 0; // 새로운 단지가 시작될 때의 dfs인데 이땐 다시 0으로 초기화해서 다시 세야한다.
                    dfs(i, j);
                    countList.add(countPerDanji); // 하나씩 담길 거다

                }
            }
        }

//        System.out.println(countList.size());// 몇개의 단지가 있는지
        bw.write(String.valueOf(countList.size()));

        Collections.sort(countList);
        for (int i = 0; i < countList.size(); i++) {
            bw.newLine();
            //   System.out.println(countList.get(i));
            bw.write(String.valueOf(countList.get(i)));

        }

        bw.flush();
        bw.close();

        br.close();




    }
}
