package 알고리즘.단계별백준.일차원배열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class 과제안내신분배열 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[30 + 1];
        int student = 0;

        for (int i = 0; i < 28; i++) {
           student = sc.nextInt();
            arr[student] = 1;
        }


        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != 1) {
                System.out.println(i);
            }
        }




        sc.close();
    }
}
