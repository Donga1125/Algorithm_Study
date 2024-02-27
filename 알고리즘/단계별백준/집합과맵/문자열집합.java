package 알고리즘.단계별백준.집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

public class 문자열집합 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int count = 0;

        HashSet<String> set = new HashSet<>();

        String[] arrM = new String[m];

        for (int i = 0; i < n; i++) {

            set.add(br.readLine());


        }

        for (int i = 0; i < m; i++) {
            arrM[i] = br.readLine();
            if(set.contains(arrM[i])){
                count++;
            }
        }

        System.out.println(count);

    }
}
