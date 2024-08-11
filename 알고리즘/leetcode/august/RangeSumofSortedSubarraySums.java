package 알고리즘.leetcode.august;

import java.util.Arrays;

public class RangeSumofSortedSubarraySums {

    //1508. Range Sum of Sorted Subarray Sums

    // 새로운 서브 배열 만들어서 비내림차순으로 정렬

    // 서브배열 만드는 기준 {1,2,3,4}
    // 면 1,3,6,10 1 하나 1+2, 1+2+3, 1+2+3+4, 2, 2+3, ...
    //이러고 비내림차순 정렬 후 left부터 right까지 다 더하기

    static final int MOD = 1000000007;

    public static void main(String[] args) {

        int n = 4;
        int nums[] = new int[]{1, 2, 3, 4};
        int l = 3;
        int r = 4;
        RangeSumofSortedSubarraySums sol = new RangeSumofSortedSubarraySums();
        System.out.println(sol.rangeSum(nums, n, l, r));

    }

    public int rangeSum(int[] nums, int n, int left, int right) {

        //n * (n + 1) / 2 서브배열의 크기 구하는 공식이다.

        int subArrays[] = new int[n * (n + 1) / 2];



        int length = nums.length;
        int index = 0;

        for (int i = 0; i < length; i++) {

            int sum = 0;
            // 1,2,3,4
            for (int j = i; j < length; j++) {
                sum = (sum + nums[j]) % MOD;
                subArrays[index++] = sum;

            }

        }
        Arrays.sort(subArrays);

        int answer = 0;

        for (int i = left - 1; i < right; i++) {

            answer = (answer + subArrays[i]) % MOD;

        }

        return answer;
       

    }


}
