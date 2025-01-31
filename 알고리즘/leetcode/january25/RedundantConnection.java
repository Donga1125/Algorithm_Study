package 알고리즘.leetcode.january25;

public class RedundantConnection {

    private static int[] parent;

    //684. Redundant Connection

    // 원래 트리였떤 것이 어떤 간선이 추가되고 사이클이 만들어짐
    // 사이클을 없애기 위해 간선을 지워라.
    // 여러 개일 경우 가장 마지막에 들어온 것을 지워

    // 하나의 간선을 제거하여 그래프가 다시 트리가 되도록 만들기 위해, 제거해야 하는 간선을 반환합니다.
    //만약 제거할 수 있는 간선이 여러 개라면, 입력에서 가장 마지막에 등장한 간선을 반환합니다.

    // 서로 연결되어 있는 지 판별해 해야함
    //서로소 집합(Disjoint Sets)

    // 유니온 파인드 알고리즘

    // 사이클을 찾아야 한다.
    // 사이클이 없다면 합병 시키는 원리 루트는 여기서 준 가장 늦게 들어온 간선을 삭제 해야하기에 늦으면 ㅁ너저 들어온 것이 루트


    public static void main(String[] args) {

        int[][] edges = new int[][]{{1, 2}, {1, 3}, {2, 3}};
        RedundantConnection sol = new RedundantConnection();
        System.out.println(sol.findRedundantConnection(edges));

    }

    public int[] findRedundantConnection(int[][] edges) {

        int n = edges.length;
        parent = new int[n + 1]; // 부모 배열


        // 초기화: 각 노드의 부모를 자기 자신으로 설정
        for (int i = 1; i <= n; i++) {
            parent[i] = i;
        }

        for (int[] edge : edges) {
            int u = edge[0], v = edge[1];

            // 사이클 발생 시 해당 간선을 반환
            if (!union(u, v)) {
                return edge;
            }
        }

            return new int[0]; // 이론상 도달하지 않음
        }



    // find 함수 (경로 압축)
    int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]); // 경로 압축
        }
        return parent[x];
    }

    // union 함수 (사이클 확인)
    boolean union(int a, int b) {
        int rootA = find(a);
        int rootB = find(b);

        if (rootA == rootB) {
            return false; // 이미 같은 집합이면 사이클 발생!
        }
        parent[rootA] = rootB; // 두 집합을 합침
        return true;
    }

    // 간선 처리


}


