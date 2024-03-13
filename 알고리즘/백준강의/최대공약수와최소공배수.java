package 알고리즘.백준강의;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 최대공약수와최소공배수 {

    public static long max = Long.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        int c = Math.min(a, b); // b
        int d = Math.max(a, b); // a

        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                if (max < i) {
                    max = i;
                }


            }

        }
        sb.append(max).append('\n');

        while (d != c) {
            if (d > c) {
                c = c + Math.min(a,b);

            } else if (d < c) {
                d = d + Math.max(a,b);
            }

        }
        sb.append(c);

        System.out.println(sb);


    }

}
