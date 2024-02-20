package 알고리즘.단계별백준.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 수정렬하기2컬렉션쇼트 {

    public static int[] sort;

    // 버블소트의 경우 최악의 경우 1조번 연산인데 2초니까 안됨
    // nlogN 짜리 머지 소트나, 퀵소트인줄 알았으나, 반대로 정렬해야 할 경우 퀵소트도 나쁘지 않고
    //최선의 선택은 선택정렬인줄 알았으나,, 역시 그래도 n^2는 빡세다.. 결국 arraysort보다 colletion.sort를 써야한다
    // 그 이유는 timsort라는 머지소트와 삽입소트를 같이 쓰기에 효율이 좋다

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> al = new ArrayList<>();



        for (int i = 0; i < n; i++) {

            al.add(Integer.parseInt(br.readLine()));

        }
        br.close();

        Collections.sort(al);

        for (int value : al) {
            sb.append(value).append('\n');

        }

        System.out.println(sb);
        // 하나씩 출력 하면 시간초과날 수 있음;; 그래서 sb쓰거나 bufferedwriter 써서 한번에 출력하자 ㅠ


    }

}
