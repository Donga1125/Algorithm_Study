package 알고리즘.leetcode.august;

import java.util.HashMap;
import java.util.Map;

public class MostStonesRemovedwithSameRoworColumn {
    // 유니온 파인드

    //[0,0],[0,1],[1,0],[1,2],[2,1],[2,2]
    private int[] parent;
    private int[] rank;

    public static void main(String[] args) {

        int[][] stones = new int[][]{{0, 0},
                                     {0, 1},
                                     {1, 0},
                                     {1, 2}, // 1{-
                                     {2, 1},
                                     {2, 2}}; // 1 {1,1]
        MostStonesRemovedwithSameRoworColumn sol = new MostStonesRemovedwithSameRoworColumn();

        System.out.println(sol.removeStones(stones));

    }

    public int removeStones(int[][] stones) {


        int length = stones.length;

        int[][] space = new int[length][length];


        int n = stones.length;
        parent = new int[n];
        rank = new int[n];

        // 초기화: 각 돌은 자기 자신이 부모로 설정됨
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            rank[i] = 0;
        }

        Map<Integer, Integer> rowMap = new HashMap<>();
        Map<Integer, Integer> colMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int x = stones[i][0];
            int y = stones[i][1];

            if (rowMap.containsKey(x)) {
                union(i, rowMap.get(x));
            } else {
                rowMap.put(x, i);
            }

            if (colMap.containsKey(y)) {
                union(i, colMap.get(y));
            } else {
                colMap.put(y, i);
            }
        }

        int componentCount = 0;
        for (int i = 0; i < n; i++) {
            if (find(i) == i) {
                componentCount++;
            }
        }

        return n - componentCount;
    }

    private int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);  // 경로 압축(Path Compression)
        }
        return parent[x];
    }

    private void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);

        if (rootX != rootY) {
            if (rank[rootX] > rank[rootY]) {
                parent[rootY] = rootX;
            } else if (rank[rootX] < rank[rootY]) {
                parent[rootX] = rootY;
            } else {
                parent[rootY] = rootX;
                rank[rootX]++;
            }
        }





    }


}
