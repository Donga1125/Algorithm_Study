package 알고리즘.단계별백준.브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class 블랙잭 {
    // 무조건 3개

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 카드  총 갯수
        int m = Integer.parseInt(st.nextToken()); //총 합
        int answer = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr.add(Integer.parseInt(st.nextToken()));

        }

        Collections.sort(arr);


        for (int i = 0; i < n -2; i++) {
            for (int j = i + 1; j < n -1; j++) {
                for (int k = j + 1; k < n; k++) {
//                    if(arr.get(i) + arr.get(j) + arr.get(k) == m) {
//                        answer = m;
//                        return;
//                    }
                    if (answer <= arr.get(i) + arr.get(j) + arr.get(k) && arr.get(i) + arr.get(j) + arr.get(k) <= m) {
                        answer = arr.get(i) + arr.get(j) + arr.get(k);
                    }
                }
            }
        }
        System.out.println(answer);

    }
}
