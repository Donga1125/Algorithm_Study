package 알고리즘.코테실전비슷문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 쿠키의신체측정 {
    static int heartx;
    static int hearty;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        char[][] arr = new char[t][t];



        for (int i = 0; i < t; i++) {
            String input = br.readLine();

            for (int j = 0; j < t; j++) {
                arr[i][j] = input.charAt(j);

                }
            }

        heart(arr, t);
        int answer[] = new int[5];

        int count = 0;
        int count1 = 0;
        for (int i = 0; i < t; i++) {


            for (int j = 0; j < t; j++) {

                if (arr[heartx - 2][j] == '*') {
                    count++;

                }
                if (arr[i][hearty - 1] == '*') {
                    count1++;

                }
            }

        }



        }




    public static void heart(char[][] arr, int t) {
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < t; j++) {
                if (arr[i][j] == '*') {

                    heartx = i + 2;
                    hearty = j +1;


                    return;

                }
            }
        }
    }
}



