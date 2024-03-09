package 알고리즘.코테실전비슷문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class 올림픽 {
    // 생각해보니 2차원 배열을 정렬하면 될 거 같다
    // 메달의 총합이 1,000,000니까 다 더했을 떄 우선순위를 판별하기 위해 금 은 동의 가중치를 다르게 ?

    // 해결 방식 보니까 그냥 compare 오버라이드해서 sort 해주기
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        int country = Integer.parseInt(st.nextToken());

        int arr[][] = new int[t][4];


        for (int i = 0; i < t; i++) {

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 4; j++) {
                int n = Integer.parseInt(st.nextToken());
                arr[i][j] = n;

            }

        }

        Arrays.sort(arr, ((o1, o2) -> {
            if (o1[1] == o2[1]) {

                if (o1[2] == o2[2]) {

                    return Integer.compare(o1[3], o2[3]);

                } else {

                    return Integer.compare(o1[2], o2[2]);}
            } else
                return Integer.compare(o1[1], o2[1]);
        }));

        int rank = 1;
        int idx = 0;
        for (int i = 0; i < t; i++) {
            if (arr[i][0] == country) {
                idx = i;
                break;
            }
        }

        for (int i = t-1; i >= 0; i--) { //이게 헷갈렸다 반대부터 찾아서 반환
            if(arr[i][1] == arr[idx][1] && arr[i][2] == arr[idx][2] && arr[i][3] == arr[idx][3]){
                break;
            } else
                rank++;
        }
        System.out.println(rank);



//        for (int a[] : arr) {
//            for (int s : a) {
//                System.out.println(s);
//            }
//        }

    }

}



