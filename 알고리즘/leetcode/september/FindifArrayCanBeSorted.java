package 알고리즘.leetcode.september;

import java.util.*;

public class FindifArrayCanBeSorted {

    // 인접한 두 원소를 교환할 수 있는데,
    // 교환 하려면, 두 원소의 set bit가 같아야한다.
    // set bits는 2진수에서 1로 설정된 비트의 개수입니다.
    // 오름차순으로 정렬 가능하다면 가능하면 true 아니면 false를 반환

    public static void main(String[] args) {

        FindifArrayCanBeSorted sol = new FindifArrayCanBeSorted();
        int[] arr = new int[]{8, 4, 2, 30, 15};
        sol.canSortArray(arr);

    }

    public boolean canSortArray(int[] nums) {

        Map<Integer, List<Integer>> bitGroups = new HashMap<>();

        // 각 숫자의 set bits 개수를 구하고 해당 개수에 해당하는 그룹에 추가
        for (int num : nums) {
            int setBits = Integer.bitCount(num);
            bitGroups.putIfAbsent(setBits, new ArrayList<>());
            bitGroups.get(setBits).add(num);
        }

        // 그룹별로 정렬하여 배열의 전체 정렬 가능 여부 확인
        int index = 0;
        for (int num : nums) {
            int setBits = Integer.bitCount(num);
            List<Integer> group = bitGroups.get(setBits);

            // 그룹 내의 숫자들을 정렬
            Collections.sort(group);

            // 정렬된 그룹의 원소를 nums 배열의 해당 위치에 다시 넣기
            for (int sortedNum : group) {
                nums[index++] = sortedNum;
            }
        }

        // nums 배열이 전체적으로 정렬되었는지 확인
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                return false;
            }
        }

        return true;
    }

    }

