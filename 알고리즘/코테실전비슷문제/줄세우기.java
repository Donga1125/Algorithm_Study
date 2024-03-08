package 알고리즘.코테실전비슷문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 줄세우기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        






        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[20];
            StringBuilder sb = new StringBuilder();
            int count = 0;
            int num = Integer.parseInt(st.nextToken());


            for (int k = 0; k < 20; k++) {


                arr[k] = Integer.parseInt(st.nextToken());

            }
            for (int u = 0; u < 20; u++) {

                for (int j = 0; j < u; j++) {
                    if (arr[u] < arr[j]) {
                        count++;
                    }

                }

            }
            sb.append(num).append(" ").append(count);

        System.out.println(sb);
        }
    }

//    public static void swap(int[] arr, int a, int b) {
//        int temp = b;
//        arr[b] = arr[0];
//        arr[a] = arr[b];
//    }
}
