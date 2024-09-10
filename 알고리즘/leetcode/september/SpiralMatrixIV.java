package 알고리즘.leetcode.september;

import 알고리즘.leetcode.ListNode;

import java.util.ArrayList;

public class SpiralMatrixIV {

    //2326. Spiral Matrix IV
    // m n의 행렬이 주어지고 head의 수로 쭉 이어서 채우는데
    // 채울 때 (나선형으로 밖에서 안으로)
    // head의 수가 mn보다 작아지면 남은 수는 -1로 다 채운 후
    // 행 순서 기준으로 열을 쭉 출력

    public static void main(String[] args) {

        int m = 3;
        int n = 5;

        ListNode node =
                new ListNode(3,
                        new ListNode(0,
                                new ListNode(2, new ListNode(6, new ListNode(8, new ListNode(1, new ListNode(7, new ListNode(9, new ListNode(4, new ListNode(2,
                                        new ListNode(5,
                                                new ListNode(5, new ListNode(0)
                                               ))))))))))));

        SpiralMatrixIV sol = new SpiralMatrixIV();
        sol.spiralMatrix(m, n, node);


    }

    public int[][] spiralMatrix(int m, int n, ListNode head) {

        int answer[][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                answer[i][j] = -1;
            }
        }


        int top = 0;
        int left = 0;
        int bottom = m - 1; // 2
        int right = n - 1; // 4
        ListNode current = head;
        while (top <= bottom && left <= right && current != null) {

            //오른쪽 무빙
            for (int i = left; i <= right && current != null; i++) {
                answer[top][i] = current.val;
                current = current.next;
            }
            top++;

            // 아래 무빙
            for (int i = top; i <= bottom && current != null; i++) {
                answer[i][right] = current.val; // 라이트 넣은 이유는 레프트끝까지 안갈수도 있음
                current = current.next;
            }
            right--;

        //왼쪽 무빙
            for (int i = right; i >= left && current != null; i--) {

                answer[bottom][i] = current.val;
                current = current.next;

            }
            bottom--;
            for (int i = bottom; i >= top && current != null; i--) {

                answer[i][left] = current.val;
                current = current.next;

            }
            left++;

        }



        return answer;
    }

}

