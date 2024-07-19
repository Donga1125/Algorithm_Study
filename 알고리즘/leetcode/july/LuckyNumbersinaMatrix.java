package 알고리즘.leetcode.july;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumbersinaMatrix {

    // 1380 Lucky Numbers in a Matrix
    //matrix 에서 가장 큰 행 중 가장 작은 열을 lucky number
    // luckynum 출력

    public static void main(String[] args) {

        int[][] matrix = new int[][]{{1, 10, 4, 2}, {9, 3, 8, 7}, {15, 16, 17, 12}};
        LuckyNumbersinaMatrix main = new LuckyNumbersinaMatrix();
        main.luckyNumbers(matrix);

    }


    public List<Integer> luckyNumbers (int[][] matrix) {
        // 틀린 이유 ( 행에서 최소, 열에서는 최대여야 하는데
        // 열에서 최대 행에서 최소로 찾아서

        List<Integer> answer = new ArrayList<>();

        int row = matrix.length;
        int column = matrix[0].length;


        int maxElinRow = Integer.MIN_VALUE;
        int minElincol = Integer.MAX_VALUE;

        int maxRow = 0;

        int minCol = 0;


        for (int i = 0; i < row; i++) {
//            maxElinRow = Math.max(maxElinRow, matrix[i][0]);
            if (maxElinRow < matrix[i][0]) {

                maxRow = i;
                maxElinRow = matrix[i][0];

            }}

            for (int j = 0; j < column; j++) {
//                minElincol = Math.min(minElincol, matrix[i][j]);
                if (minElincol > matrix[maxRow][j]) {

                    minCol = j;
                    minElincol = matrix[maxRow][j];

                }

            }


        answer.add(matrix[maxRow][minCol]);
        return answer;

    }
}
