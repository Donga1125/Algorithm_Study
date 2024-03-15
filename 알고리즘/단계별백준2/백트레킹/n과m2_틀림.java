package 알고리즘.단계별백준2.백트레킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n과m2_틀림 {

    //1과는 다르게 반대 중복도 없애주자 찾는 조건에 추가해주면 될듯 ?
    public static int[] arr;
    public static boolean[] isVisited;

    public static int depth = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        arr = new int[m];
        isVisited = new boolean[n + 1];

        backTracking(n, m, depth);


    }

    private static void backTracking(int n, int m, int depth) {

        if (m == depth) {

            for (int num : arr) {
                System.out.print(num + " ");

            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= n; i++) {


            if (!isVisited[i] && (depth == 0 || (arr[depth - 1] < i))) {

                arr[depth] = i;
                isVisited[i] = true;
                backTracking(n, m, depth + 1);
                isVisited[i] = false;
            }


        }

    }
}
