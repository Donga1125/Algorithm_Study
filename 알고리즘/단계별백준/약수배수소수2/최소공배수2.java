package 알고리즘.단계별백준.약수배수소수2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 최소공배수2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();



        for (int i = 0; i < t; i++) {

            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            long count1 = a;
            long count2 = b;



            while (true) {

                if(count1 < count2) {

                    count1 = count1 + a;

                } else if (count1 == count2) {

                    sb.append(count1).append('\n');

                    break;

                } else
                    count2 = count2 + b;

            }
        }

        System.out.println(sb);

    }
}
