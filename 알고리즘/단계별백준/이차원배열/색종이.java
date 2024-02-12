package 알고리즘.단계별백준.이차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 색종이 {
    // n m이 아니라 m n이 주어짐

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int bol[][] = new int[100][100];
        int n = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());


            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    if(bol[end + j][start + k] == 0) {
                    bol[end + j][start + k] = 1;
                    count++;}
                }
            }
        }

        System.out.println(count);

    }}
            

