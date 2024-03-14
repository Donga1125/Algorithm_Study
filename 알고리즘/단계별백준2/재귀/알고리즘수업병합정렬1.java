package 알고리즘.단계별백준2.재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 알고리즘수업병합정렬1 {

    // 핵심은 머지소트 시 빈 배열에서 새로 저장될 때 횟수다

    static int[] tmp; //정렬 후 저장하는 배열
    static int result = -1; //결과 저장 (실패시 -1)
    static int cnt = 0; //저장 횟수 누적 저장
    static int K; // 저장 횟수

    //24060

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int t = Integer.parseInt(st.nextToken()); // 배열 총 수
        K = Integer.parseInt(st.nextToken()); // 몇 번째에 저장되는 지 ?
        int[] arr = new int[t];
        tmp = new int[t];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < t; i++) {
            arr[i] = Integer.parseInt(st.nextToken());

        }

        merge_sort(arr, 0, arr.length - 1);
        System.out.println(result);

    }

    public static void merge_sort(int[] arr, int start, int end) {
        if(cnt > K) return;

        if (start < end) {
            int mid = (start + end) / 2;
            merge_sort(arr, start, mid);
            merge_sort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    //병합하는 메소드
    /*
     [파라미터]
     start : 시작 점 (인덱스)
     mid : 중간 점 (인덱스) _ 쪼갠 배열의 첫번재 배열
     end : 마지막 점 (인덱스)
    */
    public static void merge(int[] arr, int s, int mid, int end) {
        int i = s;
        int j = mid + 1; // 반 나뉜 인덱스의 시작값
        int idx = 0;

        //시작 인덱스가 중간 인덱스(1번쨰)보다 작고,
        //중간인덱스(2번째)가 마지막인덱스보다 작을 경우 반복
        while(i <= mid && j <= end){
            if(arr[i] < arr[j]){ //만약 Array[i](=앞의 값)이/가 Array[j](=뒤의 값)보다 작을 경우
                tmp[idx] = arr[i]; //작은 값을 넣어주고
                i++;
            }
            else{//만약 Array[i](=앞의 값)이/가 Array[j](=뒤의 값)보다 크거나 같을 경우
                tmp[idx] = arr[j]; //작은 값이 Array[j]이므로 작은 값을 차근차근 쌓는다.
                j++;
            }
            idx++;
        }

        //다 정렬하고도 남은 경우
        while(i <= mid){ //왼쪽 배열이 남은 경우
            tmp[idx] = arr[i]; //tmp배열에 저장하는 정수
            i++;
            idx++;
        }

        while(j <= end){ //오른쪽 배열이 남은 경우
            tmp[idx] = arr[j]; //tmp배열에 저장하는 정수
            j++;
            idx++;

        }
        i = s;
        idx = 0;
        while(i <= end){ //결과를 배열 A에 저장한다. i(시작), end(끝)
            cnt++;

            if(cnt == K){ //저장횟수가 같다면
                result = tmp[idx]; //해당 증가한 만큼의 t인덱스의 값을 result변수에 담고
                break;
            }

            arr[i++] = tmp[idx++]; //A에 순서대로 정렬된 값을 저장
        }


    }
}
