package 알고리즘.단계별백준.약수배수소수2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 소수구하기 {

    //에리

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        boolean[] arr = new boolean[n + 1];



        arr[0] = arr[1] = true;


        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (!arr[i]) {

                for (int j = i * i; j <= n; j+=i) {
                    arr[j] = true;

                }
            }
        }

        for (int i = m; i <=n ; i++) {
            if (!arr[i]) {
                System.out.println(i);
            }

        }





    }

}
