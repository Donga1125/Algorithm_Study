package 알고리즘.단계별백준.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class 수정렬하기3 {

    //시간은 줄였는데 메모리를 줄여야 한다.. 어떠게 할까 다른 알고리즘들을 써야 할듯 ?
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(br.readLine()));
            
        }
        br.close();

        Collections.sort(list);

        for (int value : list) {
            sb.append(value).append('\n');

        }

        System.out.println(sb);


    }
}
