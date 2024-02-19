package 알고리즘.단계별백준.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 수정렬 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {

            arr[i] = Integer.parseInt(br.readLine());

        }
        br.close();

        quickSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    private static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }
    private static void quickSort(int[] arr, int start, int end) {
        // start가 end보다 크거나 같다면 정렬할 원소가 1개 이하이므로 정렬하지 않고 return
        if (start >= end)
            return;
        int pivot = start;
        int lo = start + 1;
        int hi = end;

        // lo는 현재 부분배열의 왼쪽, hi는 오른쪽을 의미

        while (lo <= hi) {
            while (lo <= end && arr[lo] <= arr[pivot]) { // 피벗보다 큰 값 만날 때 까지
                lo++;
            }
            while (hi > start && arr[hi] >= arr[pivot]) {// 피벗보다 작은 값 만날때까지
                hi--;
            }

            if (lo > hi) {
                swap(arr, hi, pivot); //엇갈리면 피벗과 교체
            } else
                swap(arr, lo, hi); // 엇갈리지 않으면 로우와 하이 값 교체
        }

        // 엇갈렸을 경우,
        // 피벗값과 hi값을 교체한 후 해당 피벗을 기준으로 앞 뒤로 배열을 분할하여 정렬 진행
        quickSort(arr, start, hi - 1);
        quickSort(arr, hi + 1, end);
        }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }



}
