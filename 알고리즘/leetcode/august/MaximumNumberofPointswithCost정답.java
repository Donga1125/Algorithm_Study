package 알고리즘.leetcode.august;

public class MaximumNumberofPointswithCost정답 {

    // 1937. Maximum Number of Points with Cost

    // 배열의 셀마다 점수가 있고 최대 점수가 되길 원하는데,
    // 행마다 하나씩 고를 수 있으며, 첫 행을 고르고 다음 행을 선택할 때 열이 다르다면
    // 둘의 열의 차이만큼 -를 해야한다. 따라서 최대한 큰 점수를 갖고 있는 수 중

    public static void main(String[] args) {

        int[][] points = new int[][]
                {{1, 2, 3},
                {1, 5, 1},
                {3, 1, 1}};
        MaximumNumberofPointswithCost정답 sol = new MaximumNumberofPointswithCost정답();
        System.out.println(sol.maxPoints(points));
    }


        public long maxPoints(int[][] points) {

            int m = points.length;  // 행의 개수
            int n = points[0].length;  // 열의 개수

            long[] prev = new long[n];
            long[] curr = new long[n];

            // 첫 번째 행 초기화
            for (int j = 0; j < n; j++) {
                prev[j] = points[0][j];
            }

            // 각 행에 대해 DP 계산
            for (int i = 1; i < m; i++) {
                // 왼쪽에서 오른쪽으로 이동하면서 최대 점수를 계산
                long[] leftMax = new long[n];
                leftMax[0] = prev[0];
                for (int j = 1; j < n; j++) {
                    leftMax[j] = Math.max(leftMax[j - 1] - 1, prev[j]);
                }

                // 오른쪽에서 왼쪽으로 이동하면서 최대 점수를 계산
                long[] rightMax = new long[n];
                rightMax[n - 1] = prev[n - 1];
                for (int j = n - 2; j >= 0; j--) {
                    rightMax[j] = Math.max(rightMax[j + 1] - 1, prev[j]);
                }

                // 현재 행의 최대 점수를 계산
                for (int j = 0; j < n; j++) {
                    curr[j] = points[i][j] + Math.max(leftMax[j], rightMax[j]);
                }

                // 현재 행의 점수를 이전 행으로 업데이트
                long[] temp = prev;
                prev = curr;
                curr = temp;
            }

            // 마지막 행에서의 최대 점수를 반환
            long maxPoints = 0;
            for (int j = 0; j < n; j++) {
                maxPoints = Math.max(maxPoints, prev[j]);
            }

            return maxPoints;
        }
}
