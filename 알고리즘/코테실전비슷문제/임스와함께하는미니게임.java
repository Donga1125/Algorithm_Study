package 알고리즘.코테실전비슷문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

public class 임스와함께하는미니게임 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        String k = st.nextToken();
        HashSet<String> set = new HashSet<>();
        int count = 0;
        int name = 0;
        if (k.equals("Y")) { // 본인 뺀 수
            name = 1;
        } else if (k.equals("F")) {
            name = 2;

        } else if (k.equals("O")) {
            name = 3;
        }



        for (int i = 0; i < t; i++) {
            String n = br.readLine();
            set.add(n);
        }


            count = set.size() / name;

        System.out.println(count);


    }
}
