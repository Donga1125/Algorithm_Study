package 알고리즘.단계별백준.일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 알파벳찾기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = br.readLine();

        for (char c = 'a'; c <= 'z'; c++) {
            sb.append(s.indexOf(c)).append(" ");

        }

        System.out.println(sb);
    }
}
