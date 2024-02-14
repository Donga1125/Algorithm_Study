package 알고리즘.단계별백준.약수배수소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.zip.InflaterInputStream;

public class 소수찾기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int count = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {

            int p = Integer.parseInt(st.nextToken());


            if (isPrime(p)) {
                count++;
            }
        }


        System.out.println(count);

    }

    public static boolean isPrime(int p) {
        if (p < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(p); i++) {
            if (p % i == 0) {
                return false;
            }
        }


        return true;}



}
