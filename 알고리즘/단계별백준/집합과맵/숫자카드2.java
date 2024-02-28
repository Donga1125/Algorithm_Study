package 알고리즘.단계별백준.집합과맵;

import java.io.IOException;
import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;


public class 숫자카드2 {
    // 맵에 저장할 때 getOrDefault로 저장해주기!

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < n; i++) {

            int s = Integer.parseInt(st.nextToken());
            map.put(s, map.getOrDefault(s, 0) + 1);

        }
        int m = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < m; i++) {
            int s = Integer.parseInt(st.nextToken());
            int answer = map.getOrDefault(s, 0);
            sb.append(answer).append(' ');


        }

        br.close();

        System.out.println(sb);
    }
}
