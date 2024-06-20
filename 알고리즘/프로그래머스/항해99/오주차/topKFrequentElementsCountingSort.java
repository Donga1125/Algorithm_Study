package 알고리즘.프로그래머스.항해99.오주차;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class topKFrequentElementsCountingSort {

    //347. Top K Frequent Elements
    // map으로 관리
    // 31일차 문제와 너무 유사
    // priorityQueue로 우선순위를 크기로 주기


    public static void main(String[] args) {
        int nums[] = new int[]{1, 1, 1, 2, 2, 3};
        int k = 2;
        topKFrequentElementsCountingSort main = new topKFrequentElementsCountingSort();
        int[] now = main.topKFrequent(nums, k);


        int arr[] = new int[]{4, 2, 2, 8, 3, 3, 1};
        main.countingSort(arr);



    }

    public void countingSort(int[] arr) {

        if (arr.length == 0) {
            return;
        }
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        int range = max - min + 1;

        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("range = " + range);

        // 카운트 배열과 출력 배열 생성
        int[] count = new int[range];
        int[] output = new int[arr.length];

        // 카운트 배열 초기화
        for (int i = 0; i < arr.length; i++) {
            count[arr[i] - min]++;
        }


        // 카운트 배열의 누적합 계산
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }
//        System.out.println("  기존 arr 배열   = " + Arrays.toString(arr));
//        System.out.println("count배열의 누적합 = " + Arrays.toString(count));
        int q = 1;

        // 출력 배열에 정렬된 값 저장
        for (int i = arr.length - 1; i >= 0; i--) {

            output[count[arr[i] - min] - 1] = arr[i];
            System.out.println(q +":회차 = " + "빼기 전 count = " + Arrays.toString(count));
            count[arr[i] - min]--;



            System.out.println(q +":회차 = " + "     arr    = " + Arrays.toString(arr));
            System.out.println(q +":회차 = " + "   output   = " + Arrays.toString(output));
            System.out.println(q +":회차 = " + " 뺀 후 count = " + Arrays.toString(count));
            q++;
        }


        // 원본 배열에 정렬된 값 복사
        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
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
