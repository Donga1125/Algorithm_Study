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

    }
}
