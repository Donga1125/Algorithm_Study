package 알고리즘.leetcode.december;

import java.util.Arrays;
import java.util.Map;

public class SpecialArrayII {

    //3152. Special Array II

    public static void main(String[] args) {
        //주어진 배열에서 queries의 from부터 to 까지 부분 배열 중
        // 서로 양 옆의 수가 짝수와 홀수의 연속이면 true 아니면 false 반환

        //queries는 10^5 들어올 수 있기에 한번 검사한 게 저장되는 형식이라면 좀 더 효율적일듯

        int nums[] = new int[]{3, 4, 1, 2, 6};
        int queries[][] = new int[][]{{0, 2}, {2, 3}};

        SpecialArrayII main = new SpecialArrayII();
        main.isArraySpecial(nums, queries);




    }

    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        boolean[] check = new boolean[nums.length - 1];
        int[] check1 = new int[nums.length - 1];
        Arrays.fill(check1, -1);

        for (int i = 0; i < queries.length; i++) {
            int from = queries[i][0];
            int to = queries[i][1];
        }

    }

    public int checkSpecial(int[] check, int index,int end, int[] num) {

        if (check[index] == 1) { // 초기값이 true라면

            return 1;

        } else if (check[index] == 0) {
            return 0;

        } else {

            int now = num[index];
            int next = num[index + 1];

            if (Math.abs(now - next) % 2 == 0) {
                return 0;
            } else
                return 1;


        }

    }
}
