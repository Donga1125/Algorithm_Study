package 알고리즘.단계별백준2.백트레킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.StringTokenizer;

public class n과m4 {

    private static int[] arr;
    private static int n, m;

    private static int at;

    private static StringBuilder sb = new StringBuilder();


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[m];

        backTracking(0);
        System.out.println(sb);

    }

    private static void backTracking(int depth) {


        if (depth == m) {

            for (int i : arr) {
                sb.append(i).append(' ');
            }
            sb.append('\n');
            return;
        }



        for (int i = 1; i < n ; i++) {

            arr[depth] = i;

            backTracking( depth +1);

        }


        }

    }


