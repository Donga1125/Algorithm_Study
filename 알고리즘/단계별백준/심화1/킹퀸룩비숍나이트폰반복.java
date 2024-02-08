package 알고리즘.단계별백준.심화1;

import java.util.Scanner;

public class 킹퀸룩비숍나이트폰반복 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int chess[] = {1, 1, 2, 2, 2, 8};
        int input[] = new int[6];
        for (int i = 0; i < chess.length; i++) {
            input[i] = sc.nextInt();
        }
        for (int i = 0; i < chess.length; i++) {
            System.out.print(chess[i] - input[i] + " ");
        }
    }


    }


