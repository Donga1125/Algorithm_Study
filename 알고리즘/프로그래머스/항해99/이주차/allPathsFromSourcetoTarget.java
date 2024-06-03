package 알고리즘.프로그래머스.항해99.이주차;

import java.util.*;

public class allPathsFromSourcetoTarget {

    //leetcode
    // 797. All Paths From Source to Target
    // DAG, (방향이 있고사이클이 없는 비순환 알고리즘이란 뜻)
    //방향을 가진 노드들로 0부터n-1까지 갈 수 있는 방법을  return
    //배열이 주어지면 index가 그 수가 되고, 값이 갈 수 있는 방향의 수를 나타냄
    // 모든 경우의 수를 다 가져야 하니까, 기록해주면서 dfs 호출 ?
    // hashmap으로 생각했는데 중복때문에 pass
    // 기저 조건을 어떻게 잡아줄까... index를 늘려주면서 그 index에 접근하면 ?

    private static int n;



    private List<List<Integer>> allPathsSourceTarget(int[][] graph) {

        n = graph.length;

        List<List<Integer>> answer = new ArrayList<>(); // 경로들이 다 담긴 정답리스트

        List<Integer> route = new ArrayList<>(); // 정답인 하나의 경로

        route.add(0); // 첫 경로 시작을 0

        dfs(0, graph, route, answer);


        return answer;

    }

    private void dfs(int index, int[][] graph, List<Integer> route, List<List<Integer>> answer) {


        if (index == n - 1) { // 마지막 까지 도착했다면 ?
            // 마지막을 어떻게 표현할지 하다가 그냥 graph의 level로 처리
            answer.add(new LinkedList<>(route));
            return;
        }

        for (int j : graph[index]) {
            route.add(j); // index에서 갈 수 있는 수들을 돌면서 각각의 루트에 추가
            dfs(j, graph, route, answer); // 추가한 후 그 수로 이동해서 계속 ~
            route.remove(route.size() - 1); //백트레킹을 위해 다시 호출한 idx에서 다음 j번째 탐색
        }
    }

    public static void main(String[] args) {

        int[][] graph = new int[][]
                {{1, 2},
                        {3},
                        {3},
                        {}};


        allPathsFromSourcetoTarget main = new allPathsFromSourcetoTarget();

        main.allPathsSourceTarget(graph);


    }


}

