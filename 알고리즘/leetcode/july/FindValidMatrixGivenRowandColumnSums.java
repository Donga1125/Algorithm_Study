package 알고리즘.leetcode.july;

import java.util.Arrays;

public class FindValidMatrixGivenRowandColumnSums {

    //1605. Find Valid Matrix Given Row and Column Sums

    //음수가 아닌 행의 합과 열의 합이 주어지는데, 그 수로 기존 배열을 만들어라


    public static void main(String[] args) {
        int[] rowSum = new int[]{5, 7, 10};
        int[] colSum = new int[]{8, 6, 8};

        FindValidMatrixGivenRowandColumnSums main = new FindValidMatrixGivenRowandColumnSums();

        int[][] matrix = main.restoreMatrix(rowSum,colSum);

//        for (int[] ints : matrix) {
//            for (int anInt : ints) {
//                System.out.printf(anInt+ " ");
//
//            }
//            System.out.println();
//        }

    }

    int[][] restoreMatrix(int[] rowSum, int[] colSum) {

        // 그리디를 써서 작은 값을 계속 먼저 써주고, (초과되지 않게) 빼가면서 수 저장
        // 절대 내가 생각 해내진 못할듯 ㅠㅠ

        int[][] answer = new int[rowSum.length][colSum.length];
        int n = rowSum.length;
        int m = colSum.length;

        for (int i = 0; i < n; i++) { // 하나의 행에 숫자들을 열을 쭉 채워나가기

            for (int j = 0; j < m; j++) {
                int value = Math.min(rowSum[i], colSum[j]);
                answer[i][j] = value;
                rowSum[i] -= value;
                colSum[j] -= value;
            }
        }

        System.out.println(Arrays.toString(rowSum));
        System.out.println(Arrays.toString(colSum));

        return answer;

    }
}
