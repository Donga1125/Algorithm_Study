package 알고리즘.leetcode.august;

public class CountSubIslands {

    // 0과 1로 이루어진 matrix가 2개 있음 1은 섬이고 0안 물이다
    // 그리드 1에서 있는 섬들이 그리드2에도 있을 때 서브그리드로 포함된다.
    // 큰 틀인 어레이 안에 서브 어레이면 됨

    // 먼저 하나의 섬인지 판별부터하고, 두번째로 하나의 섬이면 표시 후
    // 그리디1의 서브 어레이인지 확인
    int move[][] = new int[][]{{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
    // 오,아래,위,왼


    public static void main(String[] args) {

        int[][] gird1 = new int[][]{{1,1,1,0,0},{0,1,1,1,1},{0,0,0,0,0},{1,0,0,0,0},{1,1,0,1,1}};
        int[][] gird2 = new int[][]{{1,1,1,0,0},{0,0,1,1,1},{0,1,0,0,0},{1,0,1,1,0},{0,1,0,1,0}};
        CountSubIslands sol = new CountSubIslands();
        System.out.println(sol.countSubIslands(gird1, gird2));


    }

    public int countSubIslands(int[][] grid1, int[][] grid2) {

        int m = grid1.length;
        int n = grid1[0].length;
        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (grid2[i][j] == 1) { // 그리드 1부터 탐색해서 바교

                    if (bfs(i, j, grid1, grid2)) { // 그리드 1이 섬일 때 그리드2를 비교하기

                        count++;

                    }

                }
            }
        }

        return count;

    }

    private boolean bfs(int row, int col, int[][] grid, int[][] grid2) {

        // 기저 조건은 물이거나(어차피 둘다 0으로 바뀌거나 원래 0이거나 해서 이미 방문했거나), 범위를 벗어나면 바로 리턴
        if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || grid2[row][col] == 0) {
            return true;

        }

        grid2[row][col] = 0;

        boolean isSubIsland = grid[row][col] == 1;


        isSubIsland = bfs(row + 1, col, grid, grid2) && isSubIsland; //오
        isSubIsland = bfs(row, col + 1, grid, grid2)&& isSubIsland; // 밑
        isSubIsland = bfs(row -1, col, grid, grid2)&& isSubIsland; // 왼
        isSubIsland = bfs(row, col - 1, grid, grid2)&& isSubIsland; // 위

        return isSubIsland;

    }
}
