package 알고리즘.프로그래머스.항해99.일주차;

import java.util.Arrays;

public class 가장큰수 {

    //가장 큰 수
    // 0 or 양의 정수가 주어질 떄 이 정수를 이어 붙여 가장 큰 수를 만들 수 있는 수를 문자열로 리턴
    //100,000개니까 완탐 x
    // 우선 순위를 부여하자 ex) 6, 9 ,10 ,3 이라면 앞자리가 제일 중요 그 다음 앞자리가 같다면 뒷자리가 다른 한수보다 높다면 더 앞에
    // merge sort로 구현해보자
    // 정렬을 그냥 자리 수보다 큰 수

    private static int[] sorted;

    public static void main(String[] args) {
        int[] num = new int[] {6, 10, 2, 123};
        sorted = new int[num.length];

        가장큰수 main = new 가장큰수();
        main.solution(num);


    }

    private String solution(int[] numbers) {

        mergeSort(numbers, 0, numbers.length - 1);
        for (int number : numbers) {
            System.out.println(number);
        }





        String answer = "";
        return answer;
    }

    private static void mergeSort(int[] arr, int left, int right) {

        if(left == right) return; // 둘다 같다는 건 나눈 리스트들이 1개의 요소를 가진 기저조건

        int mid = (left + right) / 2; // mid 는 중간 값으로 두개 나누기 위해

        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);

        merge(arr, left, mid, right);
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        // 정렬된 양쪽 배열을 하나의 배열로 합치기 위한 메서드
        int l = left; //
        int r = mid + 1;
        int idx = left; // 배열에 채워넣을 현재 인덱스


        while (l <= mid && r <= right) { // 하나씩 돌면서


            int max = Integer.max(arr[l], arr[r]);
            int min = Integer.min(arr[l], arr[r]);
            String comparison = String.valueOf(max);
            String standdard = String.valueOf(min);



            for (int i = 0; i < standdard.length(); i++) {
                int s = Integer.valueOf(standdard.charAt(i) - 0);

                for (int j = 0; j < comparison.length(); j++) {
                    int a = Integer.valueOf(comparison.charAt(j) - 0);
                    if (s <= a) {
                        sorted[idx] = arr[l]; // 작은 수를 실제로 넣어주고
                        idx++; // 인덱스 올려주고,
                        l++; // 완쪽배열의 인덱스를 올려줌
                        break;

                    }


                }





            }



            if (arr[l] <= arr[r]) { // 두개의 배열의 왼 배열이 실제 값이 작거나 같으면 그 수 먼저

                sorted[idx] = arr[l]; // 작은 수를 실제로 넣어주고
                idx++; // 인덱스 올려주고,
                l++; // 완쪽배열의 인덱스를 올려줌


            }
            else {
                sorted[idx] = arr[r];
                idx++;
                r++;
            }
        }

        if (l > mid) { // 다 돌았는데 mid보다 l이 크다는 건 오른쪽 배열의 수만 남고 왼쪽 배열만 다 채워졌다는 뜻
            while (r <= right) {
                sorted[idx] = arr[r];
                idx++;
                r++;

            }

        }

        else {
            while (l <= mid) { // 다 돌았는데 mid r
                sorted[idx] = arr[l];
                idx++;
                l++;
            }
        }
        for (int i = left; i <= right; i++) { // 기존 배열에 다시 정렬된 배열을 넣어주기 !
            arr[i] = sorted[i];
        }


    }
    }
