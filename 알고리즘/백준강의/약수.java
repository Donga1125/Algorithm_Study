package 알고리즘.백준강의;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 약수 {
    public static int min = Integer.MAX_VALUE;
    public static int max = Integer.MIN_VALUE;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(st.nextToken());
            if (n > max) {
                max = n;
            }
            if (n < min) {
                min = n;
            }

        }

        System.out.println(max * min);

            
    }
}
