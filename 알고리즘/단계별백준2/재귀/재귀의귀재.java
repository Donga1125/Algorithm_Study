package 알고리즘.단계별백준2.재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 재귀의귀재 {
    //팰린드롬을 재귀로 표현해보자




    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            int count = 0;
            String s = br.readLine();
            char arr[] = new char[s.length()];

            for (int j = 0; j < s.length(); j++) {
                arr[j] = s.charAt(j);

            }

            int[] result = isPalindrome(arr,count);

            sb.append(result[0]).append(" ").append(result[1]).append('\n');

        }

        System.out.println(sb);
        br.close();


    }

    public static int[] recursion(char[] arr, int l, int r, int count) {
        count++;
        if(l >= r) {
        return new int[]{1, count};
        } else if (arr[l] != arr[r]) {
            return new int[]{0, count};
        } else {

            return recursion(arr, l + 1, r - 1, count);}

        }

    public static int[] isPalindrome(char[] arr, int count) {

        int[] result = recursion(arr, 0, arr.length - 1, count);
        return result;
    }
    }
