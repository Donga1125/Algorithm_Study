package 알고리즘.단계별백준.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 좌표정렬하기 {
    // 좌표 정렬 x순 먼저 나오고 x가 같다면 y가 더 높은 순으로 정렬
    // 두개의 데이터가 들어오는데 x가 먼저 정렬되고 x값이 같으면 y 값을 순서대로 정렬
    // 키로 정렬해놓고, 키가 같다면 그 키에 값들을 불러오자

   public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int n = Integer.parseInt(br.readLine());
       int[][] arr = new int[n][2]; // 2차원 배열로 선언

       for (int i = 0; i < n; i++) {
           StringTokenizer st = new StringTokenizer(br.readLine());
           arr[i][0] = Integer.parseInt(st.nextToken());
           arr[i][1] = Integer.parseInt(st.nextToken());
       }

       Arrays.sort(arr, (e1, e2) -> {
           // 어레이 소트는 인자로 int[][] 타입의 arr , comparator<? super T> 를 받는데 comporator를 람다로 구현한 방식!
           if (e1[0] == e2[0]) {
               return e1[1] - e2[1];
           } else {
               return e1[0] - e2[0];
           }
       }  );

       StringBuilder sb = new StringBuilder();

       for (int i = 0; i < n; i++) {

           sb.append(arr[i][0] + " " + arr[i][1]).append('\n');
       }

       System.out.println(sb);

   }
}
