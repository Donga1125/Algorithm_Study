package 알고리즘.leetcode.february25;

import java.util.*;

public class MostProfitablePathinaTree {

    //2467. Most Profitable Path in a Tree

    // 엘리스는 0부터 시작해 한 방향 리프로 향함, 밥은 주어진 위치부터 시작해 0으로 출발
    // 각 노드마다 점수가 있음
    // -면 비용 지불 + 면 수익 발생
    // 만약 둘이 같이 마주친다면, 둘이서 반반 해결
    // 엘리스의 최대 수익을 반환

    // 고려해야할 게 밥이 지나온 길에 따라 엘리스의 수익이 나눠짐
    // 먼저 밥을 출발시키면 안되려나? 꼬일 거 같은데 만나는 지점만 체크해서 먼저 출발?
    // 둘이서 교차하는 순간에 비용이나 수익의 경우의 수를 계산해야할듯

    public static void main(String[] args) {

        int[][] edges = new int[][]{{0, 1}, {1, 2}, {1, 3}, {3, 4}};
        int bob = 3;
        int[] amount = new int[]{-2, 4, 2, -4, 6};

        MostProfitablePathinaTree main = new MostProfitablePathinaTree();
        System.out.println(main.mostProfitablePath(edges, bob, amount));




    }





    public int mostProfitablePath(int[][] edges, int bob, int[] amount) {

        int n = amount.length;
        List<Integer>[] tree = new ArrayList[n];


        for (int i = 0; i < n; i++) {
            tree[i] = new ArrayList<>();
        }

        for (int[] edge : edges) { //무방향 그래프
            int u = edge[0];
            int v = edge[1];
            tree[u].add(v);
            tree[v].add(u);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Node " + i + " -> " + tree[i]);
        }

        int[] parent = new int[n];
        Arrays.fill(parent, -1);
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        parent[0] = -1;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            for (int neighbor : tree[node]) {
                if (parent[neighbor] == -1 && neighbor != 0) {
                    parent[neighbor] = node;
                    queue.add(neighbor);
                }
            }
        }

        // 밥의 경로를 역추적하여 시간 설정
        int[] bobTime = new int[n];
        Arrays.fill(bobTime, Integer.MAX_VALUE);
        int time = 0;
        int curr = bob;
        while (curr != -1) {
            bobTime[curr] = time++;
            curr = parent[curr];
        }


        // 2. 앨리스의 DFS 탐색
        return dfs(0, 0, -1, tree, amount, bobTime);
    }

    private int dfs(int node, int time, int parent, List<Integer>[] tree, int[] amount, int[] bobTime) {
        int bobArrival = bobTime[node]; // 밥이 도착한 시간
        int netIncome;

        // 현재 노드에서 얻을 수 있는 이익 계산
        if (time < bobArrival) {
            netIncome = amount[node];  // 앨리스가 먼저 도착 → 전부 가짐
        } else if (time == bobArrival) {
            netIncome = amount[node] / 2;  // 동시에 도착 → 반만 가짐
        } else {
            netIncome = 0;  // 밥이 먼저 도착 → 이익 없음 (이미 문이 열림)
        }

        // 리프 노드 확인
        boolean isLeaf = true;
        for (int neighbor : tree[node]) {
            if (neighbor != parent) {
                isLeaf = false;
                break;
            }
        }

        // 리프 노드라면 현재 수익 반환
        if (isLeaf) {
            return netIncome;
        }

        // 리프 노드가 아니라면 자식 노드들 중 최대 수익 탐색
        int maxChildProfit = Integer.MIN_VALUE;
        for (int neighbor : tree[node]) {
            if (neighbor != parent) {
                int childProfit = dfs(neighbor, time + 1, node, tree, amount, bobTime);
                maxChildProfit = Math.max(maxChildProfit, childProfit);
            }
        }

        return netIncome + maxChildProfit;
    }
}

