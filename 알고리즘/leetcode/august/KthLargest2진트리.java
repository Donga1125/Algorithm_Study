package 알고리즘.leetcode.august;

import java.util.ArrayList;
import java.util.Collections;

public class KthLargest2진트리 {

    int k;
    ArrayList<Integer> list;

    public KthLargest2진트리(int k, int[] nums) {
        this.k = k;
        list = new ArrayList<>();

        // 초기 배열을 ArrayList로 변환하고 정렬
        for (int num : nums) {
            list.add(num);
        }

        // 내림차순 정렬
        Collections.sort(list, Collections.reverseOrder());
    }

    public int add(int val) {
        // 이진 탐색을 사용하여 적절한 위치에 삽입
        int index = Collections.binarySearch(list, val, Collections.reverseOrder());

        // binarySearch가 음수를 반환하면 그 값의 절대값에서 -1 위치에 삽입
        if (index < 0) {
            index = -index - 1;
        }

        list.add(index, val); // 값을 삽입

        // k번째로 큰 값을 반환
        return list.get(k - 1);
    }

}
