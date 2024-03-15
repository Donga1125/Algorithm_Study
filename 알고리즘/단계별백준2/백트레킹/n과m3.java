package 알고리즘.단계별백준2.백트레킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n과m3 {

    // 기억할 필요 없이 순서대로 계속 출력

    private static int n, m;
    private static int[] arr;

    private static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        sb = new StringBuilder();


        arr = new int[m];



        backTracking(0);

        System.out.println(sb);

    }

    private static void backTracking(int depth) {

        if (depth == m) {

            for (int num : arr) {
                sb.append(num).append(' ');

            }
            sb.append('\n');
            return;
        }

        for (int i = 1; i <= n; i++) {


                arr[depth] = i;
                backTracking(depth + 1);

            }

        }

    }

