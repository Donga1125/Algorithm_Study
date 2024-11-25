package 알고리즘.leetcode.November;

import java.util.Arrays;

public class FindthePowerofK_SizeSubarraysI슬라이딩 {

    // 3254. Find the Power of K-Size Subarrays I
    // nums 배열의 수가 주어지고 k개의 양수가 주어짐
    // 배열을 k 단위로 끊어서 모든 수를 판별하는데, 순서대로 판별
    // 연속적으로asc 있어야하고, 작아지거나 같아지면 안됨
    // 정렬된 연속된 수로 되어있는 중 가장 큰 수를 반환하고, 아니라면 -1를 반환해서
    // 배열을 만들어 리턴

    public static void main(String[] args) {

        int[] nums = new int[]{1, 2, 3, 4, 3, 2, 5};
        int k = 3;

        FindthePowerofK_SizeSubarraysI슬라이딩 sol = new FindthePowerofK_SizeSubarraysI슬라이딩();
        int [] answer = sol.resultsArray(nums, k);
        System.out.println(Arrays.toString(answer));

    }

    public int[] resultsArray(int[] nums, int k) {
        int size = nums.length - k + 1;
        int[] answer = new int[size];

        // 초기 윈도우 설정
        boolean isConsecutive = true;

        for (int i = 0; i < k - 1; i++) {
            if (nums[i + 1] - nums[i] != 1) {
                isConsecutive = false;
                break;
            }
        }

        answer[0] = isConsecutive ? nums[k - 1] : -1;
        // 초기 값이 false면 바로 -1로 저장

        // 슬라이딩 윈도우
        for (int i = 1; i < size; i++) {
            // 이전 윈도우가 연속적이고 새 구간도 연속적인지 확인
            if (answer[i - 1] != -1 && nums[i + k - 1] - nums[i + k - 2] == 1) {
                answer[i] = nums[i + k - 1];
                // 범위대로 늘려가기
            } else { // 그러다가 범위 벗어나면 다시 현재 수로 세팅해서 true false로 저장
                // 새로운 윈도우 확인
                isConsecutive = true;
                for (int j = i; j < i + k - 1; j++) {
                    if (nums[j + 1] - nums[j] != 1) {
                        isConsecutive = false;
                        break;
                    }
                }
                answer[i] = isConsecutive ? nums[i + k - 1] : -1;
            }
        }





        return answer;

    }


}
