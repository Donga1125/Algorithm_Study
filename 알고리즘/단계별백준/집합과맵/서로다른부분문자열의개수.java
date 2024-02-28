package 알고리즘.단계별백준.집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;

public class 서로다른부분문자열의개수 {
    // a, b, a, b, c, ab, ba, ab, bc, aba, bab, abc, abab, babc, ababc
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String n = br.readLine();
        String answer = "";

        HashSet<String> set = new HashSet<>();


        for (int i = 0; i < n.length(); i++) {

            answer = String.valueOf(n.charAt(i));
            set.add(answer);

            for (int j = i + 1; j <= n.length(); j++) {

                answer = answer + n.charAt(j);
                set.add(answer);
            }

        }

        System.out.println(set.size());
    }
}
