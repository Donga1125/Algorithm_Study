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
        MostStonesRemovedwithSameRoworColumn sol = new MostStonesRemovedwithSameRoworColumn();

        System.out.println(sol.removeStones(stones));

    }

    public int removeStones(int[][] stones) {
        int length = stones.length;

        int[][] space = new int[length][length];




        for (int i = 0; i < length; i++) {

                space[stones[i][0]][stones[i][1]] = 1;


        }

        for (int i = 0; i < length; i++) {


            for (int j = 0; j <length; j++) {
                if (space[i][j] == 1) {

                }

            }
        }


        return 1;

    }


}
