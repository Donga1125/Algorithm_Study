package 기초1.Day10.정해영;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class BaseConversion {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[m];

        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }
        int ten = 0;

        for (int i = 0; i < m; i++) {
            ten += arr[i] * Math.pow(A, m-i-1);
            // 237(8) 8진수 237을 10진수로 바꾸면...?
            //    2 x pow(8,2) i = 0
            //    3 x pow(8,1) i = 1
            //    7 x pow(8,0) i = 2
            //    즉 pow(8,3-i-1)
        }

        Stack<Integer> stack = new Stack<>();

        while (ten != 0) {
            stack.push(ten % B);
            ten /= B;
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        sc.close();
    }
}

