package 알고리즘.leetcode.august;

import java.util.LinkedList;

public class MinimumSwapstoGroupAll1sTogetherII {

    // 2134. Minimum Swaps to Group All 1's Together II

    // 원형 배열에서 swap으로 1이 그룹되기 만들자

    // 연결되어 있는 1의 길이가 있는데, 앞 뒤로도 원형이라 가능하니
    // 앞으로 원형유지해야하나 뒤로 원형 유지 해야하나를 판별 후에 swap해야할듯?
    // 판별을 슬라이딩 윈도를 사용하는듯

    public static void main(String[] args) {

        int arr[] = new int[]{0, 1, 0, 1, 1, 0, 0};
        MinimumSwapstoGroupAll1sTogetherII sol = new MinimumSwapstoGroupAll1sTogetherII();
        sol.minSwaps(arr);


    }

    public int minSwaps(int[] nums) {

        int length = nums.length;
        int countOne = 0;
        LinkedList<Integer> list = new LinkedList<>();


        for (int i = 0; i < length; i++) { // 6개 중 3개
            list.add(nums[i]);

            if (nums[i] == 1) {
                countOne++;
            }
        }
        //[0, 1, 0, 1, 1, 0, 0] // 어떤 기준으로 슬라이딩 ?





        int right = 0;
        int left = 0;

        while (true) {
            if (list.get(right) == 0) {

            }

        }

    }
}
