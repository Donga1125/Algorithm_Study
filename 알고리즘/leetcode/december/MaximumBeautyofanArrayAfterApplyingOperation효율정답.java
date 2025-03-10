package 알고리즘.leetcode.december;

import java.util.*;

public class MaximumBeautyofanArrayAfterApplyingOperation효율정답 {

    // 2779. Maximum Beauty of an Array After Applying Operation

//     아직 선택되지 않은 배열의 인덱스 하나를 선택함
//     i를 i -k , i+k 범위 내에서 임의의 정수로 교체할 떄 배열 nums의 아름다움의 최댓값 반환
//     아름다움이란 동일한 요소 이루어진 가장 부분 수열의 길이
//     그리고 최대 값이여야 한다
//
//     전체적으로 모든 수를 잡고 검사해여봐야함
//     그렇다면 첫번 째로 배열 안에서 k 범위만큼 빼고 더해주는 배열을 만들어주고
//     찾기 쉽게 인덱스 맵으로 value를 넣어주고, 그 중 모든 범위에 있는 수 중 가장 큰 걸로 배열을 만든 후
//     그 수를 세서 리턴

    public static void main(String[] args) {
        int nums[] = new int[]{4, 6, 1, 2};
        int k = 2;
        MaximumBeautyofanArrayAfterApplyingOperation효율정답 main = new MaximumBeautyofanArrayAfterApplyingOperation효율정답();
        System.out.println(main.maximumBeauty(nums, k));
    }

    public int maximumBeauty(int[] nums, int k) {

        // 각 숫자에 대해 [num - k, num + k] 범위로 변환
        for (int i = 0; i < nums.length; i++) {
            nums[i] -= k; // 최소값
        }

        System.out.println(Arrays.toString(nums));

        // 정렬
        Arrays.sort(nums);

        int maxBeauty = 0;
        int left = 0;

        // 슬라이딩 윈도우로 범위 내 숫자 계산
        for (int right = 0; right < nums.length; right++) {
            // 오른쪽 포인터가 범위를 벗어나면 왼쪽 포인터 이동
            while (nums[right] > nums[left] + 2 * k) {

                left++;
            }
            // 현재 윈도우 크기 계산
            maxBeauty = Math.max(maxBeauty, right - left + 1);
        }

        return maxBeauty;
    }
}

