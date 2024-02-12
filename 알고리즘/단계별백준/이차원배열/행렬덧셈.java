package 알고리즘.단계별백준.이차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 행렬덧셈 {

    //문제를 제대로 못 읽어서 계속 틀렸다;;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arrN = new int[n][m];
        int[][] arrM = new int[n][m];

       // int[][] answer = new int[n][n];





        for (int i = 0; i < n; i++) {

            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < m; j++) {
                arrN[i][j] = Integer.parseInt(st.nextToken());
            }}

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < m; j++) {
                arrM[i][j] = Integer.parseInt(st.nextToken());

            }}

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int answer = arrN[i][j] + arrM[i][j];
                System.out.print(answer + " ");
            }
            System.out.println();

        }

}}
