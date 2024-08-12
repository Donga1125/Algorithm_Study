package 알고리즘.leetcode.august;

import java.util.PriorityQueue;

public class KthLargest정답 {

    PriorityQueue<Integer> heap = new PriorityQueue<>();
    int k;
    public KthLargest정답(int k, int[] nums) {
        this.k=k;

        for (int n : nums) { // 따로 하나씩 추가 초기화시에도
            add(n);
        }

    }

    public int add(int val) {

        if (heap.size() < k) {

            heap.offer(val);
        } else if (val > heap.peek()) {
            heap.poll();
            heap.offer(val);
        }
        return heap.peek();

    }
}
