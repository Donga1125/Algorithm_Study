package 알고리즘.단계별백준.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 대표값2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());

        }

        bubbleSort(arr, arr.length);
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];


        }
        System.out.println(sum / arr.length);
        System.out.println(arr[arr.length/2]);

    }

    private static void bubbleSort(int[] arr, int length) {

        // round는 배열 -1 만큼 진행됨
        for (int i = 1; i < length; i++) {

            // 각 라운드마다 비교 배열의 크기에서 현재 라운드를 뺸 만큼 비교
            for (int j = 0; j < length - i; j++) {

                //현재 원소 다음 원소보다 크면 ?
                // 서로의 원소 위치를 스
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);

                }
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}
