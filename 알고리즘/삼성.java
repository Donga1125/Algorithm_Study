package 알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 삼성 {
    static int arr[][];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        arr = new int[t + 1][t + 1];
        int ans = 0;


        while (ans < t) {

            int i = Integer.parseInt(br.readLine());
            int j = Integer.parseInt(br.readLine());
            arr[i][j] = 1;
            ans++;


        }
        for (int k = 1; k <= t; k++) {
            for (int l = 1; l <= t; l++) {
                System.out.print(arr[k][l] + " ");

            }
            System.out.println();
        }


    }
}
