package 알고리즘.단계별백준.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class 수정렬하기3카운팅소트 {

  // 카운팅 소트를 써보자!
    
    public static void main(String[] args) throws IOException {
        int[] cnt = new int[10001];//
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());


        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            cnt[Integer.parseInt(br.readLine())] ++;
            
        }
        br.close();

        StringBuilder sb = new StringBuilder();

        // 0은 입력범위에서 벗어난다(주어진 범위)
        for (int i = 1; i < 10001; i++) {
            //i 값의 개수가 0이 될 때 까지 출력(빈도수를 뜻함)
            while (cnt[i] > 0) {
                sb.append(i).append('\n');
                cnt[i]--;
            }

        }

        System.out.println(sb);


    }
}
