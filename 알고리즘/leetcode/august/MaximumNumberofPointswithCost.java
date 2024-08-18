package 알고리즘.leetcode.august;

public class MaximumNumberofPointswithCost {

    // 1937. Maximum Number of Points with Cost

    // 배열의 셀마다 점수가 있고 최대 점수가 되길 원하는데,
    // 행마다 하나씩 고를 수 있으며, 첫 행을 고르고 다음 행을 선택할 때 열이 다르다면
    // 둘의 열의 차이만큼 -를 해야한다. 따라서 최대한 큰 점수를 갖고 있는 수 중

    public static void main(String[] args) {

        int[][] points = new int[][]
                {{1, 2, 3},
                {1, 5, 1},
                {3, 1, 1}};
        MaximumNumberofPointswithCost sol = new MaximumNumberofPointswithCost();
        System.out.println(sol.maxPoints(points));
    }

    public long maxPoints(int[][] points) {
        int col = points.length;
        int row = points[0].length;

        long dp[][] = new long[col + 1][row + 1];

        dp[0][0] = 0;


        for (int i = 1; i <col ; i++) {

            for (int j = 1; j < row; j++) {

                dp[i][1] = dp[i - 1][1] + dp[i][0];

                dp[i][0] = dp[i-1][0] +dp[i-1][0];  // 미완
                        // dp[i] + max (dp[i][j],point[i][j] )인데 가장 큰 값
                // 그럼 max를 계산하기 위해선 point[i-1][1] 저장된 수의 인덱스 abs- 현재 point[i][j]해서 큰 수를 dp[i][1]에 저장

            }

        }
        return 1;

    }
}
