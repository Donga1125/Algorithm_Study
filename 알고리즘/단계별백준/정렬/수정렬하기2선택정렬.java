package 알고리즘.단계별백준.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 수정렬하기2선택정렬 {

    public static int[] sort;

    // 버블소트의 경우 최악의 경우 1조번 연산인데 2초니까 안됨
    // nlogN 짜리 머지 소트나, 퀵소트인줄 알았으나, 반대로 정렬해야 할 경우 퀵소트도 나쁘지 않고
    //최선의 선택은 선택정렬이다!

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];



        for (int i = 0; i < n; i++) {

            arr[i] = Integer.parseInt(br.readLine());
        }
        br.close();

        selectSort(arr, arr.length);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }

    public static void selectSort(int[] arr, int size) {

        for (int i = 0; i < size -1; i++) { // 마지막 수는 비교 안해도 최대값으로 정렬되니까

            int min = i;

            for (int j = i + 1; j < size; j++) { // i값이랑 j들을ㄷ ㅏ 비교해주고 j가 더 작다면 min의 자리로 스왑


                if (arr[j] < arr[i]) {
                    min = j;
                }

            }
            swap(arr, min, i);

        }
    }

    private static void swap(int[] arr, int i, int j) {

        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }


    
}
