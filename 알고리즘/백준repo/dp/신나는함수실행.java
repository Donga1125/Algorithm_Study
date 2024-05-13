package 알고리즘.백준repo.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 신나는함수실행 {
    //9184
    //a b c 주어지면 그걸재귀 구현
    //c 언어 해석이 힘들다 이거 나중으로 ~

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int a = 0;
        int b= 0;
        int c = 0;
        int answer = 0;
        sb.append("w(").append(a).append(", ").append(b).append(", ").append(c + ") = ").append(answer);

    }
}
