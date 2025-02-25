package 알고리즘.leetcode.february25;

import java.util.ArrayList;

public class NumberofSub_arraysWithOddSum {
    //1524. Number of Sub-arrays With Odd Sum

    // arr의 부분 arr를 모두 구한 뒤 그 합을 더해 arr를 만들고 거기서 홀수인 수만 반환


    public static void main(String[] args) {

        int arr[] = new int[]{1, 3, 5};
        NumberofSub_arraysWithOddSum main = new NumberofSub_arraysWithOddSum();
        main.numOfSubarrays(arr);
    }

    public int numOfSubarrays(int[] arr) {

//        int size = arr.length;
//        ArrayList<Integer> arrList = new ArrayList<>();
//        int MOD = 1_000_000_007;
//        int count = 0;
//
//
//        for (int i = 0; i < size; i++) {
//
//            int now = arr[i];
//            if (now % 2 != 0) {
//                count = (count + 1) % MOD;
//            }
//            arrList.add(now);
//
//
//            for (int j = i + 1; j < size; j++) {
//
//                now = now + arr[j];
//                if (now % 2 != 0) {
//
//                    count = (count + 1) % MOD;
//
//
//                }
//
//            }
//        }
//
//
//
//        return count;
//    }

        int MOD = 1_000_000_007;
        int count = 0, prefixSum = 0;
        int evenCount = 1, oddCount = 0;  // 초기 상태: 0은 짝수이므로 evenCount = 1

        for (int num : arr) {
            prefixSum += num;

            if (prefixSum % 2 == 0) { // 누적합이 짝수
                count = (count + oddCount) % MOD;  // 이전에 나온 홀수 개수만큼 홀수 부분 배열 추가
                evenCount++; // 짝수 개수 증가
            } else { // 누적합이 홀수
                count = (count + evenCount) % MOD;  // 이전에 나온 짝수 개수만큼 홀수 부분 배열 추가
                oddCount++; // 홀수 개수 증가
            }
        }

        return count;}
}
