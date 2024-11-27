package 알고리즘.leetcode.November;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindChampionII {

    //2924. Find Champion II
    //n개의 팀이 있고 노드가 주어짐
    // [0,1] 이라면 1보다 0의 팀이 강한 것을 의미
    //DAG라서 방향 노사이클 그래프
    // 가장 쎈 팀을 반환하는데 유일하지 않다면 -1 반환

    public static void main(String[] args) {

        int n = 3;
        int n1 = 6;
        int[][] edges = new int[][]{{0, 1}, {1, 2}};
        int[][] edges1 = new int[][]{ {0, 1},
                {0, 2},
                {1, 3},
                {2, 3},
                {3, 4},
                {4, 5}};

        FindChampionII sol = new FindChampionII();
        System.out.println(sol.findChampion(n1, edges1));
        System.out.println(sol.findChampion(n, edges));

    }

    public int findChampion(int n, int[][] edges) {

        List<List<Integer>> graph = new ArrayList<>();
        int[] inDegree = new int[n];

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>()); // 그래프의 인덱스 별 어느 팀을 이겼나 기록하기 위해 빈 어레이리스트
        }

        for (int[] edge : edges) {

            int u = edge[0]; // 이긴팀
            int v = edge[1]; // 진팀
            graph.get(u).add(v); //이긴팀의 인덱스에 진팀을 기록해주기
            inDegree[v]++; // 질때마다, 진팀의 진입차수를 1 올려줘서 그 인덱스에 기록(몇번 졌냐 적어서 0인앨 찾아야함)

        }
        List<Integer> chams = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (inDegree[i] == 0) {
                chams.add(i);
                count++;
            }
        }

        if (chams.size() != 1) {
            return -1; //챔피언이 하나가 아니라면 바로 -1 리턴
        }

        // 0인 index 그냥 반환하면 안되나


//        for (int i = 0; i < n; i++) {
//            if (inDegree[i] == 0) {
//                return i;
//            }
//        }

        return chams.get(0);






    }
}
