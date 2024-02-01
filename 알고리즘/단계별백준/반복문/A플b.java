package 알고리즘.단계별백준.반복문;

import java.io.*;
import java.util.StringTokenizer;

public class A플b {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        int answer = 0;


        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            answer = a + b;

            bw.write(String.valueOf(answer));
            bw.newLine();

        }

        bw.flush();
        bw.close();
        br.close();





    }
}
