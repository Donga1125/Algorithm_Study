package 기초1.Day01.정해영;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class 단어뒤집기 {

    /*
    문장이 주어졌을때 단어를 모두 뒤집어서 출력하는 프로그램을 작성
    단어의 순서는 바꿀수 없다.
    단어는 영어 알파벳으로만 이루어져있다.
     */


    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//
//        int T = sc.nextInt(); //테스트케이스의 개수. 만약 2면 2문장이 나올꺼라는뜻
//        List<String[]> list = new ArrayList<>();
//
//        for(int i=0; i<=T; i++){
//            String str = sc.nextLine(); //라인을 받아와서
//            String[] arr = str.split(" "); //공백을 기준으로 나눠준다.
//
//            list.add(arr);
//        }
//
//        for(int i=0; i<=T;i++){
//
//            String[] arr = list.get(i);
//
//            for(int j=0; j<arr.length; j++){
//                StringBuffer sb = new StringBuffer(arr[j]);
//                String reverse = sb.reverse().toString();
//
//                arr[j] = reverse +" ";
//            }
//            Arrays.stream(arr).forEach(System.out::print);
//
//            if(i < arr.length) {
//                System.out.print("\n");
//            }
//        }
//
//        sc.close();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n ;i++){
            String[] words = br.readLine().split(" ");

            for(String word : words){
                StringBuilder sb = new StringBuilder(word);
                System.out.println(sb.reverse().toString() + " ");
            }
            System.out.println();
        }
        br.close();
    }
}
