package 알고리즘.leetcode.july;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumbersinaMatrix정답 {

    // 1380 Lucky Numbers in a Matrix
    //matrix 에서 가장 큰 행 중 가장 작은 열을 lucky number
    // luckynum 출력

    // 애 많이 먹음 .. 2중포문을 여러개 써야하는데 하나로만 해결할려고 했다

    public static void main(String[] args) {

        int[][] matrix = new int[][]{{1, 10, 4, 2}, {9, 3, 8, 7}, {15, 16, 17, 12}};
        LuckyNumbersinaMatrix정답 main = new LuckyNumbersinaMatrix정답();
        main.luckyNumbers(matrix);

    }


    public List<Integer> luckyNumbers (int[][] matrix) {
        // 틀린 이유 ( 행에서 최소, 열에서는 최대여야 하는데
        // 열에서 최대 행에서 최소로 찾아서

        List<Integer> answer = new ArrayList<>();

        int row = matrix.length;
        int column = matrix[0].length;


        // 행에서 최소부터 탐색 후 (j이 값이 작은 값 먼저 적어주고)
        // 열에서 최대를 찾기 (i 값 중 제일 큰 거

        // 하나의 이중문으로 찾으려고 해서 실패
        // 두개으 ㅣ이중문이 필요하다
        int[] mins = new int[row];
        int[] maxs = new int[column];


        for (int i = 0; i <row; i++) {
            int minElincol = Integer.MAX_VALUE;

            for (int j = 0; j < column; j++) {
                if (matrix[i][j] < minElincol) {
                    minElincol = matrix[i][j];

                }

                mins[i] = minElincol;
            }

        }

        for (int j = 0; j < column; j++) { //4
            int maxElinrow = Integer.MIN_VALUE;

            for (int i = 0; i < row; i++) { //행


                if (maxElinrow < matrix[i][j]) { // 3

                    maxElinrow = matrix[i][j];
                }
            }
            maxs[j] = maxElinrow;

        }


        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < row; i++) {

            max = Math.max(mins[i], max);
            
        }

        for (int i = 0; i < column; i++) {

            min = Math.min(maxs[i], min);
        }

        if (max == min) {

            answer.add(max);

        }


        return answer;

    }
}
