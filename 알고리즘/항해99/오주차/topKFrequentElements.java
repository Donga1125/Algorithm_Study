package 알고리즘.항해99.오주차;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class topKFrequentElements {

    //347. Top K Frequent Elements
    // map으로 관리
    // 31일차 문제와 너무 유사
    // priorityQueue로 우선순위를 크기로 주기


    public static void main(String[] args) {
        int nums[] = new int[]{1, 1, 1, 2, 2, 3};
        int k = 2;
        topKFrequentElements main = new topKFrequentElements();
        int[] now = main.topKFrequent(nums, k);
        for (int num : now) {
            System.out.println(num);

        }



    }

    public int[] topKFrequent(int[] nums, int k) {

        int answer[] = new int[k];

        HashMap<Integer, Integer> map = new HashMap<>();


        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }


        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>(
                (a, b) -> b.getValue().compareTo(a.getValue()));
        // 람다로 내림차순 정렬

        maxHeap.addAll(map.entrySet());

        for (int i = 0; i < k; i++) {

            Map.Entry<Integer, Integer> entry = maxHeap.poll();
            int now = entry.getKey();
            answer[i] = now;

        }

        return answer;

    }
}
