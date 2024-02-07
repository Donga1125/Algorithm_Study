package 알고리즘.단계별백준.일차원배열;

import java.util.Scanner;

public class 그대로출력하기 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);



        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            System.out.println(str);

        }


        sc.close();
    }
}
