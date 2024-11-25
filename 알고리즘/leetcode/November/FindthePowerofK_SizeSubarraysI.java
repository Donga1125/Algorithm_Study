package 알고리즘.leetcode.November;

import java.util.Arrays;

public class FindthePowerofK_SizeSubarraysI {

    // 3254. Find the Power of K-Size Subarrays I
    // nums 배열의 수가 주어지고 k개의 양수가 주어짐
    // 배열을 k 단위로 끊어서 모든 수를 판별하는데, 순서대로 판별
    // 연속적으로asc 있어야하고, 작아지거나 같아지면 안됨
    // 정렬된 연속된 수로 되어있는 중 가장 큰 수를 반환하고, 아니라면 -1를 반환해서
    // 배열을 만들어 리턴

    public static void main(String[] args) {

        int[] nums = new int[]{1, 2, 3, 4, 3, 2, 5};
        int k = 3;

        FindthePowerofK_SizeSubarraysI sol = new FindthePowerofK_SizeSubarraysI();
        int [] answer = sol.resultsArray(nums, k);
        System.out.println(Arrays.toString(answer));

    }

    public int[] resultsArray(int[] nums, int k) {
        int size = nums.length - k + 1;
        int[] answer = new int[size];


        for (int i = 0; i < size; i++) {
            int now = nums[i];

            // 0 1 2 3 k = 3

            for (int j = i; j < i + k - 1; j++) {
                if (nums[j + 1] - nums[j] == 1) {
                    now = nums[j + 1];

                } else { now = -1;
                    break;}


            }
            answer[i] = now;

        }

        return answer;

    }


}
