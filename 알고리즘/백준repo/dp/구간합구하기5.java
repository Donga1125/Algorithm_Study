package 알고리즘.백준repo.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 구간합구하기5 {

    //11660
    //2,2 -> 3,4 구하라고 하면 22 23 24 32 33 34구하기다 21은 포함안됨
    static int[][] arr;
    static int[][] wanted;
    static int[][] from;
    static int[][] to;
    static long[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        arr = new int[n][n];

        wanted = new int[m][4];
        dp = new long[n][n];
        from = new int[m][2];
        to = new int[m][2];



        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
            
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = 0;
            int y = 0;
            for (int j = 0; j < 4; j++) {
//                wanted[i][j] = Integer.parseInt(st.nextToken());
                x = wanted[i][j];
                y = wanted[i][j];

                System.out.println(x + " " + y);


            }
            for (int j = 0; j < 2; j++) {
                from[i][j] = Integer.parseInt(st.nextToken());

            }
            for (int j = 0; j < 2; j++) {
                to[i][j] = Integer.parseInt(st.nextToken());

            }



            
        }





    }
}
