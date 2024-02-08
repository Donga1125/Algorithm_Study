package 알고리즘.단계별백준.심화1;

import java.util.Scanner;

public class 팰린드롬인지 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] arr = new int[str.length()];
        int count = 0;

        if (str.length() == 1) {
            System.out.println(1);
        }

        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }

        for (int i = 0; i < arr.length /2; i++) {
            if (arr[i] == arr[arr.length - 1 - i]) {
                count++;

            }
        }
        if (count == arr.length / 2) {
            System.out.println(1);
        } else
            System.out.println(0);


    }
}
