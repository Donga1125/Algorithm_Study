package 알고리즘.단계별백준.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 문자열반복 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            String str = st.nextToken();
            String answer = "";

            for (int j = 0; j < str.length(); j++) {

                for (int k = 0; k < r; k++) {
                    answer = answer + str.charAt(j);

                }
            }
            System.out.println(answer);
        }


    }
}
