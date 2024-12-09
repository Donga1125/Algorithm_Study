package 알고리즘.leetcode.december;

import java.util.HashMap;
import java.util.Map;

public class SpecialArrayII필요할때마다캐싱틀림 {

    private Map<Integer, Boolean> cache = new HashMap<>();

    //3152. Special Array II

    public static void main(String[] args) {
        //주어진 배열에서 queries의 from부터 to 까지 부분 배열 중
        // 서로 양 옆의 수가 짝수와 홀수의 연속이면 true 아니면 false 반환

        //queries는 10^5 들어올 수 있기에 한번 검사한 게 저장되는 형식이라면 좀 더 효율적일듯

        int nums[] = new int[]{3, 4, 1, 2, 6};
        int queries[][] = new int[][]{{0, 2}, {2, 3}};

        SpecialArrayII필요할때마다캐싱틀림 main = new SpecialArrayII필요할때마다캐싱틀림();
        main.isArraySpecial(nums, queries);




    }

    public boolean[] isArraySpecial(int[] nums, int[][] queries) {

        boolean[] check = new boolean[queries.length];



        for (int i = 0; i < queries.length; i++) {
            int from = queries[i][0];
            int to = queries[i][1];

            check[i] = checkSpecial(nums, from, to);}

        return check;}


    private boolean checkSpecial(int[] nums, int from, int to) {

        for (int i = from; i < to; i++) {
            Integer key = i;

            if (!cache.containsKey(key)) {
                // 없다면 계산부터 있음 넘어가

                Boolean isSpecial = Math.abs(nums[i] - nums[i + 1]) % 2 != 0;
                cache.put(key, isSpecial);

            }
            if (!cache.get(key)) {
                // 넘어갔을 때 key값을 판별
                return false;
            }
        }
            return true;
    }





}
