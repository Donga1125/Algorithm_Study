package 알고리즘.leetcode.august;

public class MostStonesRemovedwithSameRoworColumn {

    //[0,0],[0,1],[1,0],[1,2],[2,1],[2,2]

    public static void main(String[] args) {

        int[][] stones = new int[][]{{0, 0},
                                     {0, 1},
                                     {1, 0},
                                     {1, 2}, // 1{-
                                     {2, 1},
                                     {2, 2}}; // 1 {1,1]

    }

    public int removeStones(int[][] stones) {

        int[][] space = new int[10000][10000];


        for (int i = 0; i < stones.length; i++) {
            for (int j = 0; j < 2; j++) {
                space[stones[i][0]][stones[i][1]] = stones[i][j];

            }
        }

    }
}
