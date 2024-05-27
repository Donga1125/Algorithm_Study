package 알고리즘.프로그래머스.항해99.이주차;

import java.util.Arrays;

public class hindex {
    //문제를 잘 읽어야 한다.. h 수를 찾자
    // 논문의 배열이 들어오고 h번보다 큰거나 같은 수가 h개 있어야하고, 나머지는 h보다 작거나 같은 수라면 그 수가 답이다
    //1000개의 논문이 들어오고 논문의 숫자는 0~10,000이다
    // 즉 h는 중간 값 찾는 거 같은데 ?
    // 게속 배열이 들어온다면 heap을 통해 효율적으로 정렬할 수 있대

    // 어떤 과학자가 발표한 논문 n편 중, h번 이상 인용된 논문이 h편 이상이고
    // 나머지 논문이 h번 이하 인용되었다면 h의 최댓값이 이 과학자의 H-Index입니다.
    private static int[] sorted;

    public static void main(String[] args) {

    }

    private int solution(int[] citations) {
        int answer = 0;
        int size = citations.length;

        sorted = new int[size];
        mergeSort(citations, 0, size - 1);


        for (int i = 0; i < size; i++) {
            int h = size - i;
            if (citations[i] >= h) {
                answer = h;
                break;

            }

            }



        return answer;
    }

//    private static int[] merge(int[] arr, int left, int mid, int right) {
//        int l = left
//
//    }

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
