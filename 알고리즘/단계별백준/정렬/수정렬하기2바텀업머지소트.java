package 알고리즘.단계별백준.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 수정렬하기2바텀업머지소트 {

    public static int[] sort;

    // 버블소트의 경우 최악의 경우 1조번 연산인데 2초니까 안됨
    // nlogN 짜리 머지 소트나, 퀵소트

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];



        for (int i = 0; i < n; i++) {

            arr[i] = Integer.parseInt(br.readLine());
        }
        br.close();

        mergeSort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }

    public static void mergeSort(int[] arr, int left, int right) {

        sort = new int[arr.length];
        //1 - 2 - 4 - 8 - ... 식으로 1부터 서브리스트를 나누는 기준을 두 배씩 늘린다.

        for (int size = 1; size <= right; size++) {

            /*
             * 두 부분리스트을 순서대로 병합해준다.
             * 예로들어 현재 부분리스트의 크기가 1(size=1)일 때
             * 왼쪽 부분리스트(low ~ mid)와 오른쪽 부분리스트(mid + 1 ~ high)를 생각하면
             * 왼쪽 부분리스트는 low = mid = 0 이고,
             * 오른쪽 부분리스트는 mid + 1부터 low + (2 * size) - 1 = 1 이 된다.
             *
             * 이 때 high가 배열의 인덱스를 넘어갈 수 있으므로 right와 둘 중 작은 값이
             * 병합되도록 해야한다.
             */
            for(int l = 0; l <= right - size; l += (2 * size)) {
                int low = l;
                int mid = l + size - 1;
                int high = Math.min(l + (2 * size) - 1, right);
                merge(arr, low, mid, high);		// 병합작업

        }
    }}

    private static void merge(int[] arr, int left, int mid, int right) {

        int l = left; // 나눠진 부분 리스트 시작점
        int r = mid + 1; //오른쪽 부분 리스트의 시작점
        int idx = left; // 채워 넣을 배열의 인덱스

        while (l <= mid && r <= right) {


            if (arr[l] <= arr[r]) {

                //왼쪽 부분 리스트 l번 원소가 오른쪽 부분리스트 r번째 요소보다 작거나 같을 경우
                //왼 l번째 요소를 새 배열에 넣고 l과 inx를 증가시킨다.

                sort[idx] = arr[l];
                idx++;
                l++;

            } else {
                //  오른쪽 부분리스트 r번째 원소가 왼쪽 부분리스트 l번째 원소보다 작거나 같을 경우
                // 오른쪽의 r번째 원소를 새 배열에 넣고 r과 idx를 1 증가시킨다.

                sort[idx] = arr[r];
                idx++;
                r++;

            }
        }

        // 왼쪽 부분리스트가 먼저 모두 새 배열에 채워졌을 경우 (l > mid)
        // = 오른쪽 부분리스트 원소가 아직 남아있을 경우
        // 오른쪽 부분리스트의 나머지 원소들을 새 배열에 채워준다.

        if (l > mid) {
            while (r <= right) {
                sort[idx] = arr[r];
                idx++;
                r++;
            }

        } else {
            while (l <= mid) {
                sort[idx] = arr[l];
                idx++;
                l++;
            }
        }
        for (int i = left; i <= right; i++) {
            arr[i] = sort[i];

        }
    }
    
}
