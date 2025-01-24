package 알고리즘.leetcode.january25;

import java.util.ArrayList;
import java.util.List;

public class FindEventualSafeStates {

    // 802. Find Eventual Safe States

    //그래프 노드 문제 루프가 닫겨 있거나, 안전한 노드의 인덱스 반환

    // 먼저 키 밸류로 잡고 각 인덱스 마다 밸류로 갈 수 있는 노드를 기록
    // 각 키마다 탐색을 시작하는데, dfs로 각 키에 해당하는 밸류만큼 들어가고,
    // ㄷ닫겨있는 루프인지 확인해서 올라옴

    // 근데 각 루프마다 돌 때 같은 수를 순환할 수 있을 거 같음 그렇다면 기록ㅇ ㅣ가능한 dp?

    public static void main(String[] args) {

        int[][] graph = new int[][]{{1, 2}, {2, 3}, {5}, {0}, {5}, {}, {}};


        FindEventualSafeStates main = new FindEventualSafeStates();
        System.out.println(main.eventualSafeNodes(graph));

    }


    public List<Integer> eventualSafeNodes(int[][] graph) {

        int n = graph.length;
        List<Integer> result = new ArrayList<>();
        int[] dp = new int[n];

        for (int i = 0; i < n; i++) {
            // 현재 i 노드가 안전하다면, 추가해줌
            if (dfs(graph, dp, i)) {
                result.add(i);
            }
        }

        return result;


    }

    private Boolean dfs(int[][] graph, int[] dp, int n) {

        // 기저
        if (dp[n] != 0){
            return dp[n] == 2;
        }

        dp[n] = 1;

        for (int neighbor : graph[n]) {
            if (!dfs(graph, dp, neighbor)) {
                return false; // 이웃 노드가 안전하지 않으면 현재 노드도 안전하지 않음
            }
        }
        dp[n] = 2; // 모든 경로가 안전하다면 안전한 노드로 표시
        return true;
        }

    }


