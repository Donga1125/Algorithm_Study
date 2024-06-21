package 알고리즘.프로그래머스.항해99.오주차;

import java.util.*;

public class topKFrequentElementsUseCountingSort {

    //347. Top K Frequent Elements
    // map으로 관리
    // 31일차 문제와 너무 유사
    // priorityQueue로 우선순위를 크기로 주기


    public static void main(String[] args) {
        int nums[] = new int[]{1, 1, 1, 2, 2, 3};
        int k = 2;
        topKFrequentElementsUseCountingSort main = new topKFrequentElementsUseCountingSort();
        int[] now = main.topKFrequent(nums, k);
        System.out.println(Arrays.toString(now));


//        int arr[] = new int[]{4, 2, 2, 8, 3, 3, 1};
//        main.countingSort(arr);



    }

    public int[] countingSort(int[] arr, int k) {

        if (arr.length <= 1) {
            return arr;
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        int range = max - min + 1;


        // 카운트 배열과 출력 배열 생성
        int[] count = new int[range];


        // 카운트 배열 초기화
        for (int i = 0; i < arr.length; i++) {
            count[arr[i] - min]++;
        }


        List<Integer>[] frequencyList = new List[arr.length + 1];
        for (int i = 0; i < frequencyList.length; i++) {
            frequencyList[i] = new ArrayList<>();
        }

        // 빈도수 별 숫자 저장
        for (int num = min; num <= max; num++) {
            int frequency = count[num - min];
            if (frequency > 0) {
                frequencyList[frequency].add(num);
            }
        }



        // 결과 배열에 상위 k개의 숫자 저장
        int[] result = new int[k];
        int idx = 0;
        for (int freq = frequencyList.length - 1; freq >= 0; freq--) {
            List<Integer> list = frequencyList[freq];
            for (int num : list) {
                result[idx++] = num;
                if (idx == k) {
                    return result;
                }
            }
        }

        return result;}






    public int[] topKFrequent(int[] nums, int k) {



        HashMap<Integer, Integer> map = new HashMap<>();


        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: 빈도수를 배열에 저장합니다.
        int[] frequencyArray = new int[map.size()];
        int index = 0;
        for (int count : map.values()) {
            frequencyArray[index++] = count;
        }








        int[] sortedArray = countingSort(frequencyArray, k);

        return sortedArray;

    }
}
