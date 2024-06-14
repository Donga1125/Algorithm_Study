package 알고리즘.프로그래머스.항해99.사주차;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 순위워셜알고리즘 {

    //1~n번까지의 권투선수, 1대1 방식으로 매치 결과를 0,1의 배열로 주어지는데 0이 이긴 선수 1이 진 선수
    //주어진 매치 결과 순위를 매기려고 하는데 모든 결과가 있지 않아 정확하게 순위를 매길 수 없다
    // 결과만 보고 정확한 순위를 알 수 있는 선수의 수를 return

    //그래프로 방향성을 주고, 정답 리스트를 놓아서      [0,1,2,3,4,~ , n] 의 값중 하나만 있으면 정답으로 처리하자

    //선수의 수는 1명 이상 100명 이하입니다.
    //경기 결과는 1개 이상 4,500개 이하입니다.
    //results 배열 각 행 [A, B]는 A 선수가 B 선수를 이겼다는 의미입니다.
    //모든 경기 결과에는 모순이 없습니다.
    public static void main(String[] args) {

        int[][] fight = new int[][] {{4, 3}, {4, 2}, {3, 2}, {1, 2}, {2, 5}};
        int n = 5;

        순위워셜알고리즘 main = new 순위워셜알고리즘();
//        System.out.println(main.solution(n, fight));

        main.solution(n, fight);

    }

    public int solution(int n, int[][] results) {



        int answer = 0;


        boolean[][] graph = new boolean[n + 1][n + 1];
       int[][] graph1 = new int[n + 1][n + 1];



        for (int[] result : results) {
            int win = result[0];
            int lose = result[1];


            graph[win][lose] = true;
            graph1[win][lose] = 1;


        }

//
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {
                System.out.print(graph1[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println("------------------------");




        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n ; j++) {
                for (int k = 1; k <= n; k++) {
                    if (graph[j][i] && graph[i][k]) {
                        graph[j][k] = true;
                        graph1[j][k] = 1;
                    }
                }

            }
        }

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {
                System.out.print(graph1[i][j] + " ");

            }
            System.out.println();
        }




        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int j = 1; j <=n ; j++) {

                if (i != j && graph[i][j] || graph[j][i]) {
                    count++;
                }
                
            }
            // 자신을 제외한 모든 선수와의 관계가 확인되면 정확한 순위를 판별할 수 있음
            if (count == n - 1) {
                answer++;
                System.out.println(i);

        }}


        return answer;
    }


}
