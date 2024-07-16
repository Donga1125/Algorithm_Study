package 알고리즘.leetcode.july;

import java.util.Arrays;

public class MinDifference정답 {

    //1509. Minimum Difference Between Largest and Smallest Value in Three Moves

    // 배열이 주어지면, 그 배열에서 3번의 움직임으로 배열 속 최소 값과 최대 값의 차이가
    // 가장 작게 만들어라
    // 배열의 요소를 거의 다 같게 만드는 게 제일 좋을 것 같은데
    // 고정된 배열이니 슬라이딩 윈도우로 수를 조정해나가야하나 ?
    // 고정된 배열 속에서 최대 최소의 위치도 모르니 투포인터로 ?
    // 최소 값으로 다 바꿀 수 있다면 그 값으로 바꾸면 될 것 같고
    // 최소 값으로 다 바꾸지 못한다면 그 다음 작은 수?

    // 차이가 가장 작은 수로 남겨야 한다 즉  차이가 중요한거지 수 자체가 작은건 상관 x
    // 그럼 배열이 3개보다 작으면, 그냥 0 반환 (같은수로 다 바꾸면 되니까) 같은 수 도 바꾸지말란 말은 없다
    //
    //

    public static void main(String[] args) {
        int[] nums = new int[]{1, 5, 0, 10, 14};
        int[] nums1 = new int[]{1,4,5,11,20};
        int[] nums2 = new int[]{6,6,0,1,1,4,6};
        MinDifference정답 main = new MinDifference정답();
        System.out.println("정답은 = " + main.minDifference(nums1));

    }

    public int minDifference(int[] nums) {


        int size = nums.length;
        int min = Integer.MAX_VALUE;

        // 1. 예외처리
        if (size <= 4) { // 4보다 작거나 깉으면 같은수를 바꾸거나, 하나씩 바꾸면 되니까 0 return

            return 0;
        }
        // 2. 정렬 ( 정렬됐으면 왼 오에서 3개의 수를 조합해서 만들면 되니까
        Arrays.sort(nums);
        // 3. 최소 값 찾기


        for (int i = 0; i <= 3; i++) {



            min = Math.min(min, nums[size-4 + i] - nums[i]);

        }


        return min;

        }


}
