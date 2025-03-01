package 알고리즘.leetcode.february25;

import java.util.HashMap;

public class LengthofLongestFibonacciSubsequence {

    //873. Length of Longest Fibonacci Subsequence

    // 증가하는 부분 수열 중 피보나치 일때의 갯수를 return

    public static void main(String[] args) {

        int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        LengthofLongestFibonacciSubsequence main = new LengthofLongestFibonacciSubsequence();
        System.out.println(main.lenLongestFibSubseq(arr));


    }

    public int lenLongestFibSubseq(int[] arr) {
        // 숫자를 잘 찾기 위해 해쉬맵으로 관리


        int n = arr.length;
        int dp[][] = new int[n][n];
        HashMap<Integer, Integer> indexMap = new HashMap<>();
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            indexMap.put(arr[i], i);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {

                int prev = arr[i] - arr[j];
                if (prev < arr[j] && indexMap.containsKey(prev)) {
                    int k = indexMap.get(prev);
                    dp[j][i] = dp[k][j] + 1;
                    maxLen = Math.max(maxLen, dp[j][i]);
                }

                if (dp[j][i] == 0) {
                    dp[j][i] = 2;
                }
            }
        }

        return maxLen >= 3 ? maxLen : 0;

    }


}
