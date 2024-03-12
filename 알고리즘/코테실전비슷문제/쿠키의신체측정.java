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
        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < t; i++) {
            String input = br.readLine();

            for (int j = 0; j < t; j++) {
                arr[i][j] = input.charAt(j);

            }
        }

        heart(arr, t);
        sb.append(heartx).append(" ").append(hearty).append('\n');

        int answer[] = new int[5];

        int leftArm = 0;
        int rightArm = 0;
        int length = 0;
        int leftReg = 0;
        int rightReg = 0;

        for (int i = 0; i < hearty -1 ; i++) {
            if (arr[heartx - 1][i] == '*') {
                leftArm++;
            }
        }

        for (int i = hearty; i < t; i++) {
            if (arr[heartx - 1][i] == '*') {
                rightArm++;
            }

        }

        for (int i = heartx; i <t ; i++) {
            if (arr[i][hearty -1] == '*') {
                length++; // 3 // 3 + 3
            }
            
        }
        for (int i = heartx + length; i < t; i++) {
            if (arr[i][hearty - 2] == '*') {
                leftReg++;
            }

        }
        for (int i = heartx + length ; i < t; i++) {
            if (arr[i][hearty] == '*') {
                rightReg++;
            }

        }

        sb.append(leftArm).append(" ").append(rightArm).append(" ")
                .append(length).append(" ").append(leftReg).append(" ").append(rightReg);

        System.out.println(sb);
    }









    public static void heart(char[][] arr, int t) {
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < t; j++) {
                if (arr[i][j] == '*') {

                    heartx = i + 2;
                    hearty = j + 1;


                    return;

                }
            }
        }
    }
}



