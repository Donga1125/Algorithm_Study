package 알고리즘.단계별백준.문자열;

import java.util.Arrays;
import java.util.Scanner;

public class 단어의개수 {

    //공백을 만나면 카운트를 올려주자

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        str = str.trim(); // 다 제거했을때 0이 들어오면 0으로 반환해야하지만 1로 반환함 오류
        if (str == "") {
            System.out.println(0);

        } else {
        String[] arr = str.split(" ");

        System.out.println(arr.length);}

    }}
